package com.example.demo2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class AppRunningPController {
    @FXML
    public void moveToKillApp(ActionEvent event) throws IOException {
        System.out.println("Hello1");
        Stage stage5_1=new Stage();
        stage5_1.setTitle("Kill");

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("KillApp.fxml"));
        Scene scene5_1 = new Scene(fxmlLoader.load());
        stage5_1.setScene(scene5_1);
        //ProcessRunningController controller1= fxmlLoader.getController();
        stage5_1.show();
        //processStage.show();
    }

    @FXML
    public void moveToStartApp(ActionEvent event) throws IOException {
        System.out.println("Hello1");
        Stage stage5_2=new Stage();
        stage5_2.setTitle("Start");

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("StartApp.fxml"));
        Scene scene5_2 = new Scene(fxmlLoader.load());
        stage5_2.setScene(scene5_2);
        //ProcessRunningController controller1= fxmlLoader.getController();
        stage5_2.show();
        //processStage.show();
    }
}
