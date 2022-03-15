package sample.controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import sample.Main;
import sample.utils.Validation;

import java.awt.event.ActionEvent;

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
    protected void onRegisterButtonClick(ActionEvent event) throws Exception {


        String username = username_id.getText();
        String password = password_id.getText();
        String confPassword = confPassword_id.getText();
        String email = email_id.getText();


        if (!Validation.isValidUsername(username)) {
            error_label.setVisible(true);
            error_label.setText("Tik didziosios ir mazosios raides, skaiciai, ilgis nuo 5 iki 13 simboliu!");
        } else if (!Validation.isValidPassword(password)) {
            error_label.setVisible(true);
            error_label.setText("Tik dydžiosios ir mažosios raidės, skaičiai ir spec. ženklai !@#$%");
        } else if (!password.equals(confPassword)) {
            error_label.setVisible(true);
            error_label.setText("Ne vienodi suvesti slaptazodziai");
        } else if (!Validation.isValidEmail(email)) {
            error_label.setVisible(true);
            error_label.setText("El_Pasto adresas neatitinka reikalavimus");
        } else {
            Parent root = FXMLLoader.load(Main.class.getResource("view/login-view.fxml"));
            Stage loginStage = new Stage();
            loginStage.setTitle("Login");
            loginStage.setScene(new Scene(root, 600, 400));
            loginStage.show();
            ((Node) (event.getSource())).getScene().getWindow().hide();
        }
    }
}