package exercises;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.control.CheckBox;

public class DropDown extends Application {
	Stage window;
	Scene scene;
	Button btn;
	ComboBox<String> comboBox;
	public static void main(String[] args) {

		launch(args);
	}

	@Override
	public void start(Stage primaryStage) {
		window = primaryStage;
		window.setTitle("Drop down menu");

		VBox layout = new VBox();
		layout.setPadding(new Insets(20,20,20,02));
		btn = new Button("Submit");


//		Working with comboBox
		comboBox = new ComboBox<>();
		comboBox.getItems().addAll(
				"One",
				"Two",
				"Three",
				"Four",
				"Five"
		);

		comboBox.setPromptText("Choose a number: ");
		btn.setOnAction(e-> printValue());

//		directly shows the comboBox items
		comboBox.setOnAction(e-> System.out.println("User selected: " + comboBox.getValue()));

//		You can also give the user the chance to add values
//		that are not in the list
		comboBox.setEditable(true);

		layout.getChildren().addAll(comboBox,btn);

		scene = new Scene(layout, 300, 200);
		window.setScene(scene);
		window.show();
	}
	private void printValue(){
		System.out.println(comboBox.getValue());
	}

}
