package JavaFx;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Layout extends Application{
	Stage stage;
	Button btn, btn1, btn2, btn3, btn4, btn5, btn6;
	public static void main(String[] args) {

		launch(args);

	}

	@Override
	public void start(Stage primaryStage) {
		stage = primaryStage;
		btn = new Button("Click me");

		// Create an HBox
		HBox hBox = new HBox();
		btn1 = new Button("Button1");
		btn2 = new Button("Button2");
		btn3 = new Button("Button3");
		hBox.getChildren().addAll(btn1,btn2,btn3);

		VBox vBox = new VBox();
		btn4 = new Button("Button4");
		btn5 = new Button("Button5");
		btn6 = new Button("Button6");
		vBox.getChildren().addAll(btn4, btn5, btn6);


		BorderPane borderPane = new BorderPane();
		borderPane.setTop(hBox);
		borderPane.setLeft(vBox);


		StackPane layout = new StackPane();
		layout.getChildren().add(btn);

		Scene scene = new Scene(borderPane, 300, 200);
		stage.setScene(scene);
		stage.show();
	}
}
