package es.liernisarraoa.dein_ejercicioo_lsj;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Producto extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Producto.class.getResource("producto.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 523, 100);
        stage.setTitle("Producto!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}