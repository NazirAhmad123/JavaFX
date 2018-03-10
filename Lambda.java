package JavaFx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.awt.*;

public class LambdaExpression extends Application {
	Button btn;
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) {
		btn = new Button();
		StackPane layout = new StackPane();
		Scene scene = new Scene(layout, 300, 200);
		primaryStage.setScene(scene);
		layout.getChildren().add(btn);
		btn.setText("Click me");
//		btn.setOnAction(new EventHandler<ActionEvent>() {
//			@Override
//			public void handle(ActionEvent event) {
//				System.out.println("Clicked");
//			}
//		});
		//btn.setOnAction(e -> System.out.println("Clicked."));

		// You can also have multiple lines of souts

		btn.setOnAction(e ->{
			System.out.println("Hello");
			System.out.println("World");
		});
		primaryStage.show();


	}
}
