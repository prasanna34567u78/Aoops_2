package application;



import javafx.application.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene .Scene;
import javafx.scene.control.*;


public class First_Q extends Application {

	 Font f = new Font(20);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception{
		// TODO Auto-generated method stub
		
	   
		primaryStage.setTitle("USER_ID PASSWORD");
		Label title = new Label("REGISTRATION");
		title.setFont(Font.font(30));
		title.setTextFill(Color.WHITE);
	    Label l1 = new Label("User name :");
	    l1.setFont(f);
	    TextField tf1 = new TextField();
	    Label l2 = new Label("Password :");
	    l2.setFont(f);
	    PasswordField pf1 = new PasswordField();
	    Button btn = new Button("Submit");
	    btn.setTextFill(Color.GREEN);	
	  
	   
		GridPane root  = new GridPane();
		Scene myScene = new Scene(root,500,500,Color.BLUEVIOLET);
		
	    root.setLayoutX(280);
	    root.setLayoutY(100);
	    root.setMaxWidth(100);
	    root.setMaxHeight(100);
	    root.setHgap(10);
	    root.setBackground(null);
	    root.setVgap(10);
	    root.addColumn(1, title);
		root.addRow(1,l1,tf1);
		root.addRow(2,l2,pf1);
		root.add(btn, 1, 3);
		//result will be shown 
		Stage sec = new Stage();
		sec.setTitle("Result");
		GridPane gp = new GridPane();
	    Scene scene2 = new Scene(gp,500,300,Color.BLUEVIOLET);
	    Label tf2 = new Label("Welcome to Our application");
	    tf2.setTextFill(Color.WHITE);
	    tf2.setFont(Font.font(30));
	    sec.setScene(scene2);
	    gp.setMaxWidth(100);
	    gp.setMaxHeight(100);
	    gp.setHgap(20);
	    gp.setVgap(20);
	   gp.add(tf2,3,2);
	   gp.setBackground(null);
		
		
		btn.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent ae){
				String str1 = tf1.getText();
				String str2 = pf1.getText();
				
				if(str1.equals(str2)) {
					sec.show();	
				}else {
					
					System.out.println(tf1.getText() +  pf1.getText());
					System.out.println("Error as occured");
				}
				
				
			}
		});
	    
		primaryStage.setWidth(1000);
		primaryStage.setHeight(500);
	    primaryStage.setScene(myScene);
	    primaryStage.setResizable(false);
	    primaryStage.show();
	}
	
	

	
	
}




