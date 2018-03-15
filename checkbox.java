package exercises;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.control.CheckBox;

public class CheckBox_0 extends Application {
	Stage window;
	Scene scene;
	Button btn;
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) {

		window = primaryStage;
		window.setTitle("CheckBoxes");

//		Checkbox
		CheckBox checkBox1 = new CheckBox("Milk");
		CheckBox checkBox2 = new CheckBox("Sugar");
		CheckBox checkBox3 = new CheckBox("Tea");
		checkBox1.setSelected(true);



//		Layout
		VBox layout = new VBox();
		btn = new Button("Choose");
		btn.setOnAction(e -> handleOption(checkBox1, checkBox2, checkBox3));
		layout.setPadding(new Insets(20,20,20,20));
		layout.getChildren().addAll(checkBox1,checkBox2,checkBox3,btn);


//		Scene
		scene = new Scene(layout, 300, 200);
		window.setScene(scene);
		window.show();

	}
	private void handleOption(CheckBox c1, CheckBox c2, CheckBox c3){
		String message = "User choose: ";
		if (c1.isSelected())
			System.out.println(message += "Milk");
		if (c2.isSelected())
			System.out.println(message+= "Sugar");
		if (c3.isSelected())
			System.out.println(message += "Tea");

	}
}
