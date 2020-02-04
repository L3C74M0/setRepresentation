package ui;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ButtonType;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Region;
import model.SetOperations;

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
    

    private int numSet=0;
    
    private SetOperations so;
    
    private ArrayList<String> a;
    
    private ArrayList<String> b;

    @FXML
    private TextField set;


    @FXML
    void addSet(ActionEvent event) {
    	if (numSet<1) {
			String line=set.getText();
			String[] args=line.split(",");
			if (numSet==0) {
				for (int i = 0; i < args.length; i++) {
					a= new ArrayList<String>();
				 a.add(args[i]);
				}
			}else {
				for (int i = 0; i < args.length; i++) {
					b=new ArrayList<String>();
					b.add(args[i]);
				}
				set.setText("");
			}
			numSet++;
    	}else {
			
    		Alert alert = new Alert(AlertType.INFORMATION, "Ya no puede crear más conjuntos", ButtonType.OK);
			alert.getDialogPane().setMinHeight(Region.USE_PREF_SIZE);
			alert.show();
			set.setVisible(false);
    	}
    }


    @FXML
    void operate(ActionEvent event) {
    	if(setA.getValue() != null) {
    		Alert alert = new Alert(AlertType.ERROR, "Por favor seleccione un conjunto A", ButtonType.OK);
			alert.getDialogPane().setMinHeight(Region.USE_PREF_SIZE);
			alert.show();
    	}
    	
    	if(setB.getValue() != null) {
    		Alert alert = new Alert(AlertType.ERROR, "Por favor seleccione un conjunto B", ButtonType.OK);
			alert.getDialogPane().setMinHeight(Region.USE_PREF_SIZE);
			alert.show();
    	}
    	
    	if(operator.getValue() != null) {
    		Alert alert = new Alert(AlertType.ERROR, "Por favor seleccione un operador", ButtonType.OK);
			alert.getDialogPane().setMinHeight(Region.USE_PREF_SIZE);
			alert.show();
    	}
    	
    	
    	
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
    	
    	so = new SetOperations();
    	

    }
}