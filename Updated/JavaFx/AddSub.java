package JavaDx;

import javafx.application.*;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.event.*;

public class AddSub extends Application implements EventHandler <ActionEvent> {
	public static void main(String[] args) {
		System.out.println("JavaFx program started.");
		launch(args);
		System.out.println("JavaFx program ended.");
	}
	Button btnAdd;
	Button btnSub;
	Label label;
	int iCounter = 0;
	@Override
	public void start(Stage primaryStage) {

//		Create the Add button
		btnAdd = new Button("Add");
		btnAdd.setOnAction(this);

//		Create the sub button
		btnSub = new Button("Sub");
		btnSub.setOnAction(this);

//		Create a Label

		label = new Label();
		label.setText(Integer.toString(iCounter));

//		Add the buttons and the label to a HBox
		HBox layout = new HBox(10);
//		layout.setSpacing(30);
		layout.getChildren().addAll(label, btnAdd, btnSub);

//		Add the layout pane to a scene
		Scene scene = new Scene(layout, 300, 200);

//		Add the scene to a stage, set the title and show the stage
		primaryStage.setScene(scene);
		primaryStage.setTitle("Handling Events");
		primaryStage.show();
	}

	@Override
	public void handle(ActionEvent event) {

		if (event.getSource() == btnAdd){
			iCounter++;
		}else {
			if (event.getSource() == btnSub){
				iCounter--;
			}
		}
		label.setText(Integer.toString(iCounter));

	}
}
