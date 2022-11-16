package com.example.demo2;

import javafx.event.ActionEvent;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.input.KeyEvent;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.util.Optional;


import java.io.IOException;

public class HelloController {
    @FXML

    public void moveToProcessScene(ActionEvent event) throws IOException {
        System.out.println("Hello");
        Stage stage2=new Stage();
        stage2.setTitle("Process");

        /*stage2.initModality(Modality.APPLICATION_MODAL);
        stage2.initOwner(stage2);*/

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("ProcessRunning.fxml"));
        Scene scene2 = new Scene(fxmlLoader.load());
        stage2.setScene(scene2);
        ProcessRunningController controller= fxmlLoader.getController();
        stage2.show();
        //processStage.show();
    }
    @FXML
    public void moveToAppScene(ActionEvent event) throws IOException {
        System.out.println("Hello");
        Stage stage5=new Stage();
        stage5.setTitle("App");

        /*stage2.initModality(Modality.APPLICATION_MODAL);
        stage2.initOwner(stage2);*/

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("AppRunning.fxml"));
        Scene scene5 = new Scene(fxmlLoader.load());
        stage5.setScene(scene5);
        //ProcessRunningController controller= fxmlLoader.getController();
        stage5.show();
        //processStage.show();
    }

    @FXML
    public void moveToKeyStrokeScene(ActionEvent event) throws IOException {
        System.out.println("Hello");
        Stage stage6=new Stage();
        stage6.setTitle("Keystroke");

        /*stage2.initModality(Modality.APPLICATION_MODAL);
        stage2.initOwner(stage2);*/

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Keystroke.fxml"));
        Scene scene6 = new Scene(fxmlLoader.load());
        stage6.setScene(scene6);
        //ProcessRunningController controller= fxmlLoader.getController();
        stage6.show();
        //processStage.show();
    }

    @FXML
    public void moveToScreenshotScene(ActionEvent event) throws IOException {
        System.out.println("Hello");
        Stage stage7=new Stage();
        stage7.setTitle("Screenshot");
        /*stage2.initModality(Modality.APPLICATION_MODAL);
        stage2.initOwner(stage2);*/

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("ScreenShot.fxml"));
        Scene scene7 = new Scene(fxmlLoader.load());
        stage7.setScene(scene7);
        //ProcessRunningController controller= fxmlLoader.getController();
        stage7.show();
        //processStage.show();
    }

    @FXML
    public void moveToShutdownScene(ActionEvent event) throws IOException{
        Alert alert=new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Alert");
        alert.setHeaderText("Shutdown Confimation");
        alert.setContentText("Are you sure to shutdown?");

        ButtonType buttonTypeYes=new ButtonType("Yes", ButtonBar.ButtonData.YES);
        ButtonType buttonTypeNo=new ButtonType("No", ButtonBar.ButtonData.NO);

        alert.getButtonTypes().setAll(buttonTypeYes,buttonTypeNo);
        //Optional<ButtonType> result=alert.showAndWait();
        alert.show();
    }

    @FXML
    private TextField ServerID;

    @FXML
    private Button connectButton;


    @FXML
    public void connectDisable(KeyEvent event) throws IOException
    {
        ServerID.textProperty().addListener((observable,oldValue,newValue)->{
            connectButton.setDisable(newValue.trim().isEmpty());
        });
    }

    @FXML
    public void connectServer(ActionEvent event) throws IOException{
        Alert alert1=new Alert(Alert.AlertType.INFORMATION);
        alert1.setContentText("Server successfully connected!");
        alert1.show();

    }



}