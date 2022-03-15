package sample.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import sample.utils.Validation;

public class RegisterController {
    @FXML
    private TextField username_id;
    @FXML
    private PasswordField password_id;
    @FXML
    private PasswordField confPassword_id;
    @FXML
    private Button register_btn;
    @FXML
    private Label error_label;
    @FXML
    private TextField email_id;


    @FXML
    protected void onRegisterButtonClick() {


        String username = username_id.getText();
        if (!Validation.isValidUsername(username)){
            error_label.setVisible(true);
            error_label.setText("Neteisingai ivestas prisijungimo vardas");
        }else{
            //Vartotoja nukreipti i prisijungimo langa
            error_label.setVisible(true);
            error_label.setText("teisingai ivestas prisijungimo vardas");
        }
    }
}