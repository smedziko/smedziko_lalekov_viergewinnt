package main.ctrl;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import main.Model.Spieler;
import main.Model.Spielfeld;

import java.io.IOException;
import java.util.Scanner;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("../ctrl/viergewinnt.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
        Spielfeld spielfeld = new Spielfeld(1,2);

        Spieler spieler1 = new Spieler("Zigo",2);
        Spieler spieler2 = new Spieler("Sheeee",7);

        Spieler prioSpieler = spieler1;

        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <3;i++){
            System.out.println(prioSpieler.getName() + ", Your turn\n");
            spielfeld.Ausgabe();

        }
    }
}