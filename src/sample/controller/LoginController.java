package sample.controller;

import javafx.event.ActionEvent;
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

public class LoginController {
    @FXML
    private TextField text_id;
    @FXML
    private PasswordField pass_id;
    @FXML
    private Button login_btn;
    @FXML
    private Button register_btn;
    @FXML
    private Label error_label;

    @FXML
    protected void onLoginButtonClick() {
        if (text_id.getText().equals("admin") && pass_id.getText().equals("admin")) {
            error_label.setVisible(true);
            error_label.setText("Prisijungimas sekmingas. Prisijungimo vardas: " + text_id.getText() + " Slaptazodis: " + pass_id.getText());
//            error_label.setVisible(false);
        } else {
            error_label.setVisible(true);
            error_label.setText("Klaidingi prisijungimo duomenys");
        }


    }

    @FXML
    protected void onRegisterButtonClick(ActionEvent event) throws Exception {

        //Vaizdo užkrovimas
        Parent root = FXMLLoader.load(Main.class.getResource("view/register-view.fxml"));
        Stage registerStage = new Stage();
        //Stage (langas) bus vienas, scenų gali būti daug
        registerStage.setTitle("Registracijos langas");
        registerStage.setScene(new Scene(root, 600, 400));
        //Parodymas lango
        registerStage.show();
        //Kodas reikalingas paslėpti prieš tai buvusį langą
        ((Node) (event.getSource())).getScene().getWindow().hide();
    }
}