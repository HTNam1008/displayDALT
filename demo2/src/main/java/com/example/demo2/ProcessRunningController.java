package com.example.demo2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class ProcessRunningController {

    @FXML
    public void moveToKillProcess(ActionEvent event) throws IOException {
        System.out.println("Hello1");
        Stage stage3=new Stage();
        stage3.setTitle("Kill");

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("KillProcess.fxml"));
        Scene scene3 = new Scene(fxmlLoader.load());
        stage3.setScene(scene3);
        //ProcessRunningController controller1= fxmlLoader.getController();
        stage3.show();
        //processStage.show();
    }

    @FXML
    public void moveToStartProcess(ActionEvent event) throws IOException {
        System.out.println("Hello1");
        Stage stage4=new Stage();
        stage4.setTitle("Start");

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("StartProcess.fxml"));
        Scene scene4 = new Scene(fxmlLoader.load());
        stage4.setScene(scene4);
        //ProcessRunningController controller1= fxmlLoader.getController();
        stage4.show();
        //processStage.show();
    }
}
