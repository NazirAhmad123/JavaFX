package exercises;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.Observable;

public class DropDown extends Application {
	Stage window;
	Scene scene;
	Button btn;
	ComboBox<String> comboBox;
	ListView<String > listView;
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

//		Working with list view
		listView= new ListView<>();
		listView.getItems().addAll("1","2","3","4","5","6","7","8","9","10");
		listView.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);

		btn.setOnAction(e-> btnClicked());
		layout.getChildren().addAll(listView,btn);

		scene = new Scene(layout, 300, 200);
		window.setScene(scene);
		window.show();
	}
	private void printValue(){
		System.out.println(comboBox.getValue());
	}
//	print out the number user selected.
	private void btnClicked(){
		String message ="";
		ObservableList<String> numbers;
		numbers = listView.getSelectionModel().getSelectedItems();

		for (String m: numbers){
			message += m +"\n";
		}
		System.out.println(message);
	}

}
