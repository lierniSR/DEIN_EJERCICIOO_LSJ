package es.liernisarraoa.dein_ejercicioo_lsj.Componente;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;

/**
 * Controlador del producto
 *
 * @author Lierni
 * @version 1.0
 */
public class ProductoComponente extends GridPane {
    @FXML
    public ImageView imagenProducto;
    @FXML
    public Label nombreProducto;
    @FXML
    public Label stockProducto;

    /**
     * Un constructor vaio para poder acceder a los metodos
     */
    public ProductoComponente(){}

    /**
     * Poner un Stock y segun la cantidad cambiar le fondo
     *
     * @param cantidad
     */
    public void setStock(double cantidad) {
        String style;
        if (cantidad > 100) {
            style = "verde";
        } else if (cantidad > 20) {
            style = "azul";
        } else {
            style = "rojo";
        }
        stockProducto.setText(String.valueOf(cantidad));
        this.getStyleClass().clear();
        this.getStyleClass().add(style);
    }

    /**
     * Para poner una imagen
     *
     * @param imagen
     */
    public void setImage(Image imagen) {
        imagenProducto.setImage(imagen);
    }

    /**
     * Poner un nombre
     *
     * @param nombre
     */
    public void setName(String nombre) {
        nombreProducto.setText(nombre);
    }

}