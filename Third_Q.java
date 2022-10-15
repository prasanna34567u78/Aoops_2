package application;

import javafx.application.*;
import javafx.event.*;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.ContextMenu;
import javafx.scene.control.Label;
import javafx.scene.control.*;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Third_Q extends Application{

	 Label response;
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			launch(args);
		}

		@Override
		public void start(Stage primaryStage) throws Exception {
			// TODO Auto-generated method stub
			primaryStage.setTitle("Second Assignment Question");
			response = new Label("Thrid assigment context menu");
			BorderPane bp = new BorderPane();
			Scene firstScene = new Scene(bp,500,500,Color.AQUA);
			Menu mb1 = new Menu("New");
			Menu mb2  = new Menu("view");
			ContextMenu mb = new ContextMenu(mb1,mb2);
			
			TextField tf = new TextField();
			
		    MenuItem File = new MenuItem("File");
		    MenuItem Folder = new MenuItem("Folder");
		    MenuItem Image = new MenuItem("Image");  
		    MenuItem Large = new MenuItem("Large");
		    MenuItem Medium= new MenuItem("Medium");
		    MenuItem Small = new MenuItem("Small");
		    
		    mb1.getItems().addAll(File,Folder,Image);
		    mb2.getItems().addAll(Large,Medium,Small);
		
			// Create one event handler that will handle menu action events.
		    EventHandler<ActionEvent> MEHandler = new EventHandler<ActionEvent>() {
				public void handle(ActionEvent ae) {
					String name = ((MenuItem) ae.getTarget()).getText();
					// If Exit is chosen, the program is terminated.
					
					tf.setText(name + "is Selected");
				}
			};
			
			File.setOnAction(MEHandler);
			Folder.setOnAction(MEHandler);
			Image.setOnAction(MEHandler);
			Large.setOnAction(MEHandler);
			Medium.setOnAction(MEHandler);
			Small.setOnAction(MEHandler);
			
			// Create a text field and set its column width to 20.
	       
			tf.setContextMenu(mb);
	        FlowPane fpRoot = new FlowPane(10, 10);
					
			// Center the controls in the scene.
			fpRoot.setAlignment(Pos.CENTER);
			// Add both the label and the text field to the flow pane.
			fpRoot.getChildren().addAll(response,tf);
			// Add the flow pane to the center of the border layout.
			bp.setCenter(fpRoot);
			primaryStage.setScene(firstScene);
			
	     	primaryStage.show();
			
		}
}
