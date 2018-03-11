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

import javafx.application.Application;
import javafx.stage.Stage;

public class CreateAlertBox extends Application{
	Stage window;
	Button btn;
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) {
		// We create the window
		window = primaryStage;

		// Give a title to the window
		window.setTitle("Alert box tut");

		// Create a layout to the window
		StackPane layout = new StackPane();

		// Create the button to the layout
		btn = new Button("Click me");
		btn.setOnAction(e -> AlertBox.display("new alert box","Welcome"));

		// add the button to the layout.
		layout.getChildren().add(btn);

		// Now that we have the layout we need to add a scene to it.
		Scene scene = new Scene(layout, 300, 200);

		// Set the scene
		window.setScene(scene);
		// Show the scene
		window.show();
	}
}
class AlertBox {

	public static void display(String title, String message){

		Stage window = new Stage();
		window.initModality(Modality.APPLICATION_MODAL);
		window.setTitle(title);
		window.setWidth(200);

		Label label = new Label();
		label.setText(message);

		Button closeButton = new Button("Close");
		closeButton.setOnAction(e -> window.close());

		VBox vBox = new VBox();
		vBox.getChildren().addAll(label,closeButton);
		vBox.setAlignment(Pos.CENTER);

		// Lastly set a scene
		Scene scene = new Scene(vBox);
		window.setScene(scene);
		window.showAndWait();
	}
}

