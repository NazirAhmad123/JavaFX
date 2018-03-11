package JavaFx;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.awt.*;

public class ClosingApplication extends Application {
	Stage window;
	Button btn;
	public static void main(String[] args) {

		launch(args);
	}

	@Override
	public void start(Stage primaryStage) {
		window = primaryStage;
		window.setTitle("New program");
		window.setOnCloseRequest(e-> closeProgram());

		btn = new Button("Close program");
		btn.setOnAction(e ->{
			e.consume();
			closeProgram();
		});


		StackPane layout = new StackPane();
		layout.getChildren().add(btn);


		Scene scene = new Scene(layout, 300, 200);
		window.setScene(scene);
		window.show();
	}

	private void closeProgram(){
//		System.out.println("Code is saved!");
//		window.close();
		boolean answer = ConfirmBox.display("Title","Want to Exit?");
		if (answer)
			window.close();

		System.out.println("Your data was saved!");
	}
}
