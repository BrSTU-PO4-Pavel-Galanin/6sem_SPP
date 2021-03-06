package com.example.spp_2sem_po4_galanin_lab4;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ControllerMain {
    @FXML
    protected void Button__Producer_table_clicked() {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(ControllerMain.class.getResource("View-Table-Producer.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            Stage stage = new Stage();
            stage.setTitle("Справочник Производители");
            stage.setScene(scene);
            stage.show();
        }
        catch (Exception exception) {
            System.out.println(exception);
            exception.printStackTrace();
        }
    }
}
