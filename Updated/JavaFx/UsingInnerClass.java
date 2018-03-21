package JavaDx;

import javafx.application.*;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.event.*;

public class UsingInnerClass extends Application{
	public static void main(String[] args) {
//		Handling Events using Inner class
		launch(args);
	}
	Button btnAdd;
	Button btnSubtract;
	Label lbl;
	int iCounter = 0;

	@Override
	public void start(Stage primaryStage) throws Exception {

		// Create a ClickHandler instance
		ClickHandler ch = new ClickHandler();


		btnAdd = new Button("Add");
		btnAdd.setOnAction(ch);


		// Create the Subtract button
		btnSubtract = new Button();
		btnSubtract.setText("Subtract");
		btnSubtract.setOnAction( ch);

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

	private class ClickHandler implements EventHandler <ActionEvent> {


		@Override
		public void handle(ActionEvent event) {
			if (event.getSource()==btnAdd)
			{
				iCounter++;
			}
			else
			{
				if (event.getSource()==btnSubtract)
				{
					iCounter--;
				}
			}
			lbl.setText(Integer.toString(iCounter));
		}
	}
}
