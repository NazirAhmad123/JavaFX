package exercises;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.control.CheckBox;

public class DropDown extends Application {
	Stage window;
	Scene scene;
	Button btn;
	public static void main(String[] args) {

		launch(args);
	}

	@Override
	public void start(Stage primaryStage) {
		window = primaryStage;
		window.setTitle("Drop down menu");

//		Layout
//		StackPane layout = new StackPane();
		VBox layout = new VBox();
		layout.setPadding(new Insets(20,20,20,02));
		btn = new Button("Click me");

//		btn.setOnAction(e-> {
//			System.out.println("Button was clicked.");
//		});
//		CheckBox checkBox = new CheckBox();

		ChoiceBox<String> choiceBox = new ChoiceBox<>();
		choiceBox.getItems().add("1");
		choiceBox.getItems().add("2");
//		Or you can add all in one line
		choiceBox.getItems().addAll("3","4","5");
		choiceBox.setOnAction(e-> getChoice(choiceBox));
//		Add a default value in the list so the user can see it.
		choiceBox.setValue("1");
		layout.getChildren().addAll(choiceBox,btn);



//		Scene
		scene = new Scene(layout, 300, 200);
		window.setScene(scene);
		window.show();
	}
	public void getChoice(ChoiceBox<String> choiceBox){
		String numbers = choiceBox.getValue();
		System.out.println(numbers);

	}
}
