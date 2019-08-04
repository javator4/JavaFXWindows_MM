package pl.sda.windows;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import pl.sda.windows.controller.RootController;

import java.io.IOException;

/**
 * Hello world!
 *
 */
public class App extends Application
{
    public static void main( String[] args )
    {
       launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(getClass().getResource("/rootview.fxml"));
        fxmlLoader.load();

        RootController controller = fxmlLoader.getController();  //tworzy controller poprzez metode getController()
        controller.setApp(this);                     //przekazujemy istniejaca instancje App do metody setController (jej konstruktor otrzymuje App)
        Parent parent = fxmlLoader.getRoot();               //tworzy obiekt parent do ktorego przypisuje root

        primaryStage.setScene(new Scene(parent));           //ustawia scene na Stage (wskazujac na obiekt parent)
        primaryStage.show();
    }

    public void loadOneView() throws IOException {
        Stage stage = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(getClass().getResource("/button1view.fxml"));
        fxmlLoader.load();
        Parent parent = fxmlLoader.getRoot();
        stage.setScene(new Scene(parent));
        stage.show();

    }
    public void loadTwoView() throws IOException {
        Stage stage = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(getClass().getResource("/button2view.fxml"));
        fxmlLoader.load();
        Parent parent = fxmlLoader.getRoot();
        stage.setScene(new Scene(parent));
        stage.show();

    }
}
