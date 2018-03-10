package JavaFx;

import javafx.application.Application;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.awt.*;

public class SwitchScenes extends Application {

	Stage window;
	Scene s1, s2;
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) {
		window = primaryStage;
		Label l_1 = new Label("Welcome to scene 1");
		Button btn = new Button("Go to scene 2");
		btn.setOnAction(e -> window.setScene(s2));

		VBox layout_01 = new VBox(20);
		layout_01.getChildren().add(btn);

		s1 = new Scene(layout_01, 200, 300);


		Button btn1 = new Button("Go to scene 1");
		btn1.setOnAction(e -> window.setScene(s1));

		StackPane layout_02 = new StackPane();
		layout_02.getChildren().add(btn1);
		s2 = new Scene(layout_02, 300, 200);

		window.setTitle("Switching between windows");
		window.setScene(s1);
		window.show();
	}
}
