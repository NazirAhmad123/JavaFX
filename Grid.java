package JavaFx;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class Grid extends Application {
	Stage window;
	public static void main(String[] args) {

		launch(args);
	}

	@Override
	public void start(Stage primaryStage) {
		window = primaryStage;
		window.setTitle("GridPane");

		GridPane gridPane = new GridPane();
		gridPane.setPadding(new Insets(10,10,10,10));
		gridPane.setVgap(8);
		gridPane.setHgap(10);


		//Name label
		Label name = new Label("User name");
		GridPane.setConstraints(name, 0, 0);


		// Name input
		TextField nameInput = new TextField("John");

		GridPane.setConstraints(nameInput, 1, 0);

		//Name label
		Label pass = new Label("Password");
		GridPane.setConstraints(name, 0, 1);

		// Pass input
		TextField PassWrd = new TextField();
		PassWrd.setPromptText("Password");
		GridPane.setConstraints(PassWrd, 1, 1);

		Button btn = new Button("Login");
		GridPane.setConstraints(btn, 1, 2);

		gridPane.getChildren().addAll(name,nameInput,pass, PassWrd, btn);

		Scene scene =new Scene(gridPane, 300, 200);
		window.setScene(scene);
		window.show();
	}
}
