package ui;

import java.net.URI;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Main extends Application{	
	
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {
		Parent root= FXMLLoader.load(getClass().getResource("setGUI.fxml"));
       	Scene scene= new Scene(root);
       	stage.setTitle("Conjuntos");
       	stage.setScene(scene);
       	stage.show();
       	//stage.getIcons().add(new Image("\\ui\\icon.png"));
	}
}