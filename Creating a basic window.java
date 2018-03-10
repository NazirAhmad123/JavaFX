package JavaFx;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {
	Button button;
	public static void main(String[] args) {
		launch(args);

	}
	//  When ur program starts it calls launch(args), launch goes to the application and
	// Application sets everything up and calls the start method.
	@Override
	public void start(Stage primaryStage) {
		primaryStage.setTitle("new window");
		
		// Create a button object
		button = new Button();
		
		// Set the title of the button
		button.setText("Click me");

		// We need to make a layout.
		StackPane layout = new StackPane();
		
		
		// this adds the button on the scene
		layout.getChildren().add(button);

		// It creates a scene
		Scene scene = new Scene(layout, 300, 250);
		
		// It sets the scene so that the user can see it
		primaryStage.setScene(scene);
		
		// Outputs the scene
		primaryStage.show();
	}
}
