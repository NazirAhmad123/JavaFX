package JavaFx;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import javafx.application.Application;

import java.util.Stack;

public class AnonymousInnerClass extends Application{
	Button btn1, btn2;
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) {
		btn1 = new Button();
//		btn2 = new Button();
		btn1.setText("Button1");
		btn1.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				System.out.println("Button was clicked");
			}
		});
//		btn2.setText("Button2");
		StackPane layout = new StackPane();
		Scene scene = new Scene(layout, 500, 300);
		primaryStage.setTitle("Anonymous inner class");
		primaryStage.setScene(scene);
		layout.getChildren().add(btn1);
//		layout.getChildren().add(btn2);
		primaryStage.setScene(scene);
		primaryStage.show();


	}
}
