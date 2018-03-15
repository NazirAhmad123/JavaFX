package exercises;

import exercises.Product;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class CheckBox_0 extends Application {

	Stage window;
	TableView<Product> table;

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		window = primaryStage;
		window.setTitle("Nazir - JavaFX");

		//Name column
		TableColumn<Product, String> nameColumn = new TableColumn<>("Name");
		nameColumn.setMinWidth(200);
		nameColumn.setCellValueFactory(new PropertyValueFactory<>("name"));

		//Price column
		TableColumn<Product, Double> priceColumn = new TableColumn<>("Price");
		priceColumn.setMinWidth(100);
		priceColumn.setCellValueFactory(new PropertyValueFactory<>("price"));

		//Quantity column
		TableColumn<Product, String> quantityColumn = new TableColumn<>("Quantity");
		quantityColumn.setMinWidth(100);
		quantityColumn.setCellValueFactory(new PropertyValueFactory<>("quantity"));

		table = new TableView<>();
		table.setItems(getProduct());
		table.getColumns().addAll(nameColumn, priceColumn, quantityColumn);

		VBox vBox = new VBox();
		vBox.getChildren().addAll(table);

		Scene scene = new Scene(vBox);
		window.setScene(scene);
		window.show();
	}

	//Get all of the products
	public ObservableList<Product> getProduct(){
		ObservableList<Product> products = FXCollections.observableArrayList();
		products.add(new Product("Laptop", 859.00, 20));
		products.add(new Product("Bouncy Ball", 2.49, 198));
		products.add(new Product("Toilet", 99.00, 74));
		products.add(new Product("The Notebook DVD", 19.99, 12));
		products.add(new Product("Corn", 1.49, 856));
		return products;
	}


}
class Product {

	private String name;
	private double price;
	private int quantity;

	public Product(){
		this.name = "";
		this.price = 0;
		this.quantity = 0;
	}

	public Product(String name, double price, int quantity){
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

}

























//package exercises;
//
//import javafx.application.Application;
//import javafx.collections.FXCollections;
//import javafx.collections.ObservableList;
//import javafx.geometry.Insets;
//import javafx.scene.Node;
//import javafx.scene.Scene;
//import javafx.scene.control.TableColumn;
//import javafx.scene.control.TableView;
//import javafx.scene.control.cell.PropertyValueFactory;
//import javafx.scene.layout.VBox;
//import javafx.stage.Stage;
//
//
//import javafx.application.Application;
//import javafx.event.ActionEvent;
//import javafx.event.EventHandler;
//import javafx.scene.Scene;
//import javafx.scene.control.Button;
//import javafx.scene.layout.StackPane;
//import javafx.stage.Stage;
//import javafx.scene.control.CheckBox;
//
//public class CheckBox_0 extends Application {
//	Stage window;
//	Scene scene;
//	Button btn;
//	TableView<Product> tableView;
//	public static void main(String[] args) {
//		launch(args);
//	}
//
//	@Override
//	public void start(Stage primaryStage) {
//
//		window = primaryStage;
//		window.setTitle("CheckBoxes");
//
////		Name column
//		TableColumn<Product, String> nameColumn = new TableColumn<>("name");
//		nameColumn.setMinWidth(200);
//		nameColumn.setCellValueFactory(new PropertyValueFactory<>("name"));
//
////		Price column
//		TableColumn<Product, Double> priceColumn = new TableColumn<>("price");
//		priceColumn.setMinWidth(200);
//		priceColumn.setCellValueFactory(new PropertyValueFactory<>("price"));
//
////		quantity column
//		TableColumn<Product, Integer> quantityColumn = new TableColumn<>("quantity");
//		quantityColumn.setMinWidth(200);
//		quantityColumn.setCellValueFactory(new PropertyValueFactory<>("quantity"));
//
//
//
//		tableView = new TableView<>();
//		tableView.setItems(getProduct());
//
//		tableView.getColumns().addAll(nameColumn,priceColumn,quantityColumn);
////		Layout
//		VBox layout = new VBox();
////		btn = new Button("Choose");
////		layout.getChildren().addAll(btn);
//
////		Scene
//		scene = new Scene(layout, 300, 200);
//		window.setScene(scene);
//		window.show();
//
//	}
//	// Gets all of the products
//	public ObservableList<Product> getProduct(){
//		ObservableList<Product> products = FXCollections.observableArrayList();
//		products.add(new Product("iPhone",500.00,10));
//		products.add(new Product("Laptop",400.00,5));
//		products.add(new Product("Printer",300.00,30));
//		products.add(new Product("Headphone",200.00,50));
//		products.add(new Product("USB",100.00,100));
//
//		return products;
//	}
//
//}
