module es.liernisarraoa.dein_ejercicioo_lsj {
    requires javafx.controls;
    requires javafx.fxml;


    opens es.liernisarraoa.dein_ejercicioo_lsj to javafx.fxml;
    exports es.liernisarraoa.dein_ejercicioo_lsj;
}