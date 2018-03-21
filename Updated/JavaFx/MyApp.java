package JavaDx;
import com.sun.scenario.effect.impl.prism.PrImage;
import javafx.application.*;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;

public class MyApp extends Application {
	Button btn;
	Scene scene;
	public static void main(String[] args) {
		launch(args);
	}


	@Override
	public void start(Stage primaryStage) {
//		Create a button
		btn = new Button();
		btn.setText("Click me");
		btn.setOnAction(e -> btnClick());

//		Add the button to a layout pane
		StackPane layout = new StackPane();
		layout.getChildren().add(btn);


//		Add layout to the scene
		scene =new Scene(layout, 300, 200);


//		Finalize and show the stage
		primaryStage.setScene(scene);
		primaryStage.setTitle("The clickMe App");
		primaryStage.show();
	}
	public void btnClick(){

		if (btn.getText() == "Click me"){
			btn.setText("You clicked me!");
		}else {
			btn.setText("Click Me Please!");
		}
	}
}
