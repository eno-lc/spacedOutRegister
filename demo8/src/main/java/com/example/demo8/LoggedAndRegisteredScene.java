package com.example.demo8;

import javafx.application.HostServices;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Hyperlink;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import javafx.stage.Stage;


import java.io.IOException;



public class LoggedAndRegisteredScene extends HelloApplication{
    public ImageView userImg;
    public Hyperlink lkd;
    public Hyperlink fb;
    public Hyperlink insta;


    public void showImage() {
        try {
            Image image = new Image("image/userLog.png");
            userImg.setImage(image);
            userImg.setCache(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void firstScene (ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("hello-view.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void instagram()  {
        HostServices host = getHostServices();
        host.showDocument("https://www.instagram.com/accounts/login/");
    }


    public void linkedin() {
        HostServices host = getHostServices();
        host.showDocument("https://www.linkedin.com/login");
    }

    public void facebook() {
        HostServices host = getHostServices();
        host.showDocument("https://www.facebook.com/login/");
    }



}
