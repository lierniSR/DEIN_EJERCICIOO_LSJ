package es.liernisarraoa.dein_ejercicioo_lsj;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * Clase principal del Producto
 * Esta clase extiende de Application y es el punto de entrada de la aplicación JavaFX.
 *
 * @author Lierni
 * @version 1.0
 */
public class Producto extends Application {

    /**
     * Método que inicia la aplicación JavaFX.
     * Carga el archivo FXML, configura la escena y muestra la ventana principal.
     *
     * @param stage El escenario principal de la aplicación.
     * @throws IOException Si ocurre un error al cargar el archivo FXML.
     */
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Producto.class.getResource("producto.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 523, 100);
        stage.setTitle("Producto!");
        stage.setScene(scene);
        stage.show();
    }

    /**
     * Método principal que lanza la aplicación JavaFX.
     *
     * @param args Argumentos de línea de comandos (no se utilizan en este caso).
     */
    public static void main(String[] args) {
        launch();
    }
}