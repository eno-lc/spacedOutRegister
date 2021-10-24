package com.example.demo8;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class HelloController {
    @FXML
    private TextField userField;
    @FXML
    private PasswordField passField;
    @FXML
    private CheckBox chkBox;
    @FXML
    private Label welcomeText1;
    @FXML
    private ImageView userImg;
    @FXML
    private Label welcomeText;

    private Stage stage;
    private Scene scene;
    @FXML
    protected void onHelloButtonClick(ActionEvent event) throws IOException { //userlogin

        if (userField.getText().equals("") && passField.getText().equals("")) {
            welcomeText1.setText("You need to enter your username and password!");
        } else if (passField.getText().equals("")) {
            welcomeText1.setText("You need to enter your password!");
        } else if (userField.getText().equals("")) {
            welcomeText1.setText("You need to enter your username!");
        } else if (!(userField.getText().equals("")) && !(passField.getText().equals(""))) {
            welcomeText1.setText("");
            welcomeText.setText("You've registered successfully " + userField.getText() + ".");
            switchToLoggedIn(event);
        }



    }
    public void switchToSignedOut(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("scene2.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void switchToLoggedIn(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("loggedAndRegisteredScene.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }


    public void showImage() {
        try {
            Image image = new Image("image/userLog.png");
            userImg.setImage(image);
            userImg.setCache(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }




}