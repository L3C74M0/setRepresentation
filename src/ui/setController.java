package ui;

import java.net.URL;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.ResourceBundle;
import java.util.Set;

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
    	if (numSet<3) {
			
		}
    	

    }

    @FXML
    void operate(ActionEvent event) {
    	
    	boolean continuar = true;
    	
    	if(setA.getValue() == null) {
    		Alert alert = new Alert(AlertType.ERROR, "Por favor seleccione un conjunto A", ButtonType.OK);
			alert.getDialogPane().setMinHeight(Region.USE_PREF_SIZE);
			alert.show();
			continuar = false;
    	}
    	
    	if(setB.getValue() == null) {
    		Alert alert = new Alert(AlertType.ERROR, "Por favor seleccione un conjunto B", ButtonType.OK);
			alert.getDialogPane().setMinHeight(Region.USE_PREF_SIZE);
			alert.show();
			continuar = false;
    	}
    	
    	if(operator.getValue() == null) {
    		Alert alert = new Alert(AlertType.ERROR, "Por favor seleccione un operador", ButtonType.OK);
			alert.getDialogPane().setMinHeight(Region.USE_PREF_SIZE);
			alert.show();
			continuar = false;
    	}
    	
    	
    	if (continuar) {
    		
    		Set<String> set1 = new HashSet<String>(a);
    		Set<String> set2 = new HashSet<String>(b);
    		HashSet<String> set;
			
    		if (operator.getValue().equalsIgnoreCase("Union")) {
    			
    			set = so.union(set1, set2);
				
			}else if (operator.getValue().equalsIgnoreCase("Intersecion")) {
				
				 set = so.intersection(set1, set2);
				
			}else if (operator.getValue().equalsIgnoreCase("Diferencia")) {
				
				 set = so.diference(set1, set2);
				
			}else {
				 set = so.diference(set2, set1);
			}
    		
    		String message = "";
    	
    		
    		for (String f : set) {
				message += f;
			}
    		
    		result.setText(message);
    		
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
    	
    	operator.getItems().add("Intersecion");
    	operator.getItems().add("Union");
    	operator.getItems().add("Complemento");
    	operator.getItems().add("Diferencia");

    	
    	so = new SetOperations();
    }
}