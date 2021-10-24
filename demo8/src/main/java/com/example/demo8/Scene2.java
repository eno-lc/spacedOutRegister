package com.example.demo8;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.IOException;


public class Scene2 {
    public Button registerBtn;
    public CheckBox check2;
    public PasswordField password1;
    public PasswordField password2;
    public TextField lastname;
    public TextField name;
    public TextField email;
    public Label labelInfo;
    public Label labelInfo1;
    private Stage stage;
    private Scene scene;
    @FXML
    private ImageView userImg;

    public void showImage() {
        try {
            Image image = new Image("image/userLog.png");
            userImg.setImage(image);
            userImg.setCache(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }






    public void infoChecker(ActionEvent event) throws IOException {
        if (name.getText().equals("") && lastname.getText().equals("")&& password1.getText().equals("")
                && password2.getText().equals("") && email.getText().equals("") && !(check2.isSelected()) ) {
            labelInfo.setText("You need to enter your information!");
        } else if (lastname.getText().equals("")&& password1.getText().equals("")
                && password2.getText().equals("") && email.getText().equals("") && !(check2.isSelected()) ) {
            labelInfo.setText("You need to enter your other information!");
        }  else if ( password1.getText().equals("")
                && password2.getText().equals("") && email.getText().equals("") && !(check2.isSelected()) ) {
            labelInfo.setText("You need to enter your other information!");
        } else if (password1.getText().equals("")) {
            labelInfo.setText("You need to enter your password!");
        } else if (password2.getText().equals("")) {
            labelInfo.setText("You need to re-enter your password!");
        } else if(!(password1.getText().equals(password2.getText()))){
                labelInfo.setText("Passwords do not match!");
        } else if (lastname.getText().equals("")) {
            labelInfo.setText("You need to enter your last name!");
        } else if (!(email.getText().contains("@"))) {
                labelInfo.setText("Your e-mail should be valid!");
        } else if( !(email.getText().endsWith(".com"))) {
            labelInfo.setText("Your e-mail should be valid!");
        } else if (!(check2.isSelected())) {
            labelInfo.setText("You must accept our Terms and Agreements!");
        } else if (!(name.getText().equals("")) && !(password1.getText().equals("")) && !(password2.getText().equals("")) && check2.isSelected() && !(lastname.getText().equals(""))
                && !(email.getText().equals(""))) {
            labelInfo.setText("");
            labelInfo1.setText("You've registered successfully " + labelInfo.getText() + ".");
            switchToLoggedIn(event);
        }
    }
    public void switchToLoggedIn(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("loggedAndRegisteredScene.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void firstScene (ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("hello-view.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

}
