package fahim.calculator;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class FXMLController implements Initializable {
    
    
    @FXML
    private TextField displayField;
    @FXML
    private Label label;
    private double currentNumber;
    private String currentOperation;
    @FXML
    private Button point;
    int z = 0;
    @FXML
    private void handleDigitAction(ActionEvent event) {
        String digit = ((Button) event.getSource()).getText();
        String oldText = displayField.getText();
        String newText = oldText + digit;
        displayField.setText(newText);
        
    }
    
    @FXML
    private void exitCalculator(){
       System.exit(1);
    }
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }   


    @FXML
    private void handleEqualOperation(ActionEvent event) {
        String newText = displayField.getText();
        double newNumber = Double.parseDouble(newText);
        if(currentOperation.equals("+")){
        currentNumber = currentNumber + newNumber;
        displayField.setText(currentNumber + "");
            z=1;
        }
        else if(currentOperation.equals("-")){
            currentNumber = currentNumber - newNumber;
            displayField.setText(currentNumber + "");
            z=1;
        }
        else if(currentOperation.equals("*")){
            currentNumber = currentNumber * newNumber;
            displayField.setText(currentNumber + "");  
            z=1;
        }
        else if(currentOperation.equals("/")){
            currentNumber = currentNumber / newNumber;
            displayField.setText(currentNumber + "");
            z=1;
        }
    }

    @FXML
    private void handleOperation(ActionEvent event) {
        String currentText = displayField.getText();
        currentNumber = Double.parseDouble(currentText);
        displayField.setText("");
        currentOperation = ((Button) event.getSource()).getText();
        z=0;
        
    }

    @FXML
    private void handleClear(ActionEvent event) {
        displayField.setText("");
        z=0;
    }

    @FXML
    private void handlePointAction(ActionEvent event) {
        
        if(event.getSource()== point){
            if(z==0){
        String digit = ((Button) event.getSource()).getText();
        String oldText = displayField.getText();
        String newText = oldText + digit;
        displayField.setText(newText);
        z=1;
        }
        }
        
    }
}
