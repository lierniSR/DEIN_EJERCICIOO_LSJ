package es.liernisarraoa.dein_ejercicioo_lsj.Componente;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;

public class ProductoComponente extends GridPane {
    @FXML
    public ImageView imagenProducto;
    @FXML
    public Label nombreProducto;
    @FXML
    public Label stockProducto;

    public ProductoComponente(){}

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

    public void setImage(Image imagen) {
        imagenProducto.setImage(imagen);
    }

    public void setName(String nombre) {
        nombreProducto.setText(nombre);
    }

}