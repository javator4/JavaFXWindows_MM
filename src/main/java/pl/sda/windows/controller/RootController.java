package pl.sda.windows.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import pl.sda.windows.App;

import java.io.IOException;

public class RootController {

    private App app;

    public void setApp(App app) {           //metoda setApp otrzymuje obiekt App (nie tworzymy go, tylko otrzymujemy z wywolania metody w klasie App)
        this.app = app;
    }

    @FXML
    private Button button1;

    @FXML
    private Button button2;


    public void openWindow1(ActionEvent actionEvent) throws IOException {
       this.app.loadOneView();

    }
    public void openWindow2(ActionEvent actionEvent) throws IOException {
       this.app.loadTwoView();

    }






}
