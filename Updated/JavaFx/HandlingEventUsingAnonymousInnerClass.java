package JavaDx;

import javafx.application.*;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.event.*;

public class HandlingEventUsingAnonymousInnerClass extends Application {

	public static void main(String[] args) {
		launch(args);
	}
//	Declare all variables you need here.
	Button btnAdd;
	Button btnSubtract;
	Label lbl;
	int iCounter = 0;

	@Override
	public void start(Stage primaryStage) throws Exception {

//		Create the add button
		btnAdd = new Button("Add");
		btnAdd.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				iCounter++;
				lbl.setText(Integer.toString(iCounter));
			}
		});

//		Create the subtract button
		btnSubtract = new Button("Sub");
		btnSubtract.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				iCounter--;
				lbl.setText(Integer.toString(iCounter));
			}
		});

		// Create the Label
		lbl = new Label();
		lbl.setText(Integer.toString(iCounter));

		// Add the buttons and label to an HBox pane
		HBox pane = new HBox(10);
		pane.getChildren().addAll(lbl, btnAdd, btnSubtract);

		// Add the layout pane to a scene
		Scene scene = new Scene(pane, 200, 75);

		// Add the scene to the stage, set the title
		// and show the stage

		primaryStage.setScene(scene);
		primaryStage.setTitle("Add/Sub");
		primaryStage.show();

	}
}
