package ui;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;

public class setController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ComboBox<String> setA;

    @FXML
    private ComboBox<String> setB;

    @FXML
    private ComboBox<String> operator;

    @FXML
    private Label result;

    @FXML
    void addSet(ActionEvent event) {

    }

    @FXML
    void operate(ActionEvent event) {

    }

    @FXML
    void initialize() {
    	setA.getItems().add("A");
    	setA.getItems().add("A'");
    	setA.getItems().add("B");
    	setA.getItems().add("B'");
    	
    	setB.getItems().add("A");
    	setB.getItems().add("A'");
    	setB.getItems().add("B");
    	setB.getItems().add("B'");
    	
    	operator.getItems().add("Interseción");
    	operator.getItems().add("Unión");
    	operator.getItems().add("Complemento");
    	operator.getItems().add("Diferencia");
    	

    }
}