package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

import static logic.Calculate.calculateTotal;

public class Controller {
    @FXML
    private TextField countField;
    @FXML
    private TextField amountField;
    @FXML
    private Button bereken;
    @FXML
    private TextField totalField;

    @FXML
    public void initialize() {
        bereken.setDisable(true);
    }

    public void setTotalField(int totalField) {
        this.totalField.setText(toString().valueOf(totalField));
    }

    @FXML
    public void onButtonClicked(ActionEvent e) {
        if (e.getSource().equals(bereken)) {
//            System.out.println(calculateTotal(Integer.parseInt(amountField.getText()), Integer.parseInt(countField.getText())));
            setTotalField(calculateTotal(Integer.parseInt(amountField.getText()), Integer.parseInt(countField.getText())));


        }
    }

    @FXML
    public void handleKeyReleased() {
        String text = countField.getText();
        String text2 = amountField.getText();
        boolean disableButtons = text.isEmpty() || text.trim().isEmpty() || text2.isEmpty() || text2.trim().isEmpty();
        bereken.setDisable(disableButtons);
    }
}
