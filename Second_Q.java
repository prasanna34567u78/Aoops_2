package application;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.*;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.input.KeyCombination;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.event.*;
import javafx.geometry.Pos;

public class Second_Q extends Application{

	 Label response;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		primaryStage.setTitle("Second Assignment Question");
		response = new Label("Second Assignment");
		BorderPane bp = new BorderPane();
		Scene firstScene = new Scene(bp,500,500,Color.AQUA);
		MenuBar mb = new MenuBar();
		Menu fileMenu = new Menu("_File");
	    MenuItem New = new MenuItem("New");
	    MenuItem open = new MenuItem("Open");
	    MenuItem save = new MenuItem("Save");
	    fileMenu.getItems().addAll(New,open,save);
	    mb.getMenus().add(fileMenu); 
	    Menu fileMenu2 = new Menu("_Edit");
	    MenuItem cut = new MenuItem("Cut");
	    MenuItem copy = new MenuItem("Copy");
	    MenuItem paste = new MenuItem("Paste");
	    fileMenu2.getItems().addAll(cut,copy,paste);
	    mb.getMenus().add(fileMenu2);  
	    Menu fileMenu3 = new Menu("_Help");
	    MenuItem help = new MenuItem("HelpCenter");
	    MenuItem about = new MenuItem("AboutUs");
//	    MenuItem paste = new MenuItem("paste");
	    fileMenu3.getItems().addAll(help,about);
	    mb.getMenus().add(fileMenu3);		
	    
	    TextField tf = new TextField();
        tf.setPrefColumnCount(20);
		// Create one event handler that will handle menu action events.
		EventHandler<ActionEvent> MEHandler = new EventHandler<ActionEvent>() {
			public void handle(ActionEvent ae) {
				String name = ((MenuItem) ae.getTarget()).getText();
				// If Exit is chosen, the program is terminated.
					
					
				response.setText(name + " selected");
			}
		};
		New.setOnAction(MEHandler);
		open.setOnAction(MEHandler);
		save.setOnAction(MEHandler);
		cut.setOnAction(MEHandler);
		copy.setOnAction(MEHandler);
		paste.setOnAction(MEHandler);
		help.setOnAction(MEHandler);
		about.setOnAction(MEHandler);
		New.setAccelerator(KeyCombination.keyCombination("shortcut+N"));
		open.setAccelerator(KeyCombination.keyCombination("shortcut+O"));
		save.setAccelerator(KeyCombination.keyCombination("shortcut+S"));
		cut.setAccelerator(KeyCombination.keyCombination("shortcut+E"));
		copy.setAccelerator(KeyCombination.keyCombination("shortcut+F"));
		paste.setAccelerator(KeyCombination.keyCombination("shortcut+G"));
		help.setAccelerator(KeyCombination.keyCombination("shortcut+Q"));
		about.setAccelerator(KeyCombination.keyCombination("shortcut+M"));
	 FlowPane fpRoot = new FlowPane(10, 10);
	// Center the controls in the scene.
		fpRoot.setAlignment(Pos.CENTER);
	// Add both the label and the text field to the flow pane.
		fpRoot.getChildren().addAll(response, tf);
// Add the flow pane to the center of the border layout.
		bp.setCenter(fpRoot);
		bp.setTop(mb);
	
		primaryStage.setScene(firstScene);
	primaryStage.show();
		
	}
}
