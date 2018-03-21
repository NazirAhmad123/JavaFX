package JavaDx;

import javafx.application.*;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;

public class ClickCounter extends Application {

	public static void main(String[] args) {
		launch(args);
	}
	Button btn;
	Label lbl, lbl2;

	int iClickCounter  =0;

	@Override
	public void start(Stage primaryStage) {

//		Create a button
		btn = new Button();
		btn.setText("Click me please!");
		btn.setOnAction(e -> btnClick());

//		Create a label.
		lbl = new Label();
		lbl.setText("You have not clicked the button");

		lbl2 = new Label("I'll start counting after you click.");

//		Add the button and the label to a layout pane.
		BorderPane layout = new BorderPane();
		layout.setTop(lbl);
		layout.setBottom(lbl2);
		layout.setCenter(btn);

//		Add the layout to a scene
		Scene scene = new Scene(layout, 250, 150);

//		Add the scene to a stage
		primaryStage.setScene(scene);
		primaryStage.setTitle("Click me program");
		primaryStage.show();
	}
	public void btnClick(){
		iClickCounter++;
		if (iClickCounter == 1){
			lbl.setText("You have clicked once.");
//			lbl2.setText("Your program is cool.");
		}else {
			lbl.setText("You have clicked " + iClickCounter + " times.");
			lbl2.setText("Counter: " + iClickCounter);
		}
	}
}
