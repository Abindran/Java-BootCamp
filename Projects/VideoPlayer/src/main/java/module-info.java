module com.example.videoplayer {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires validatorfx;
    requires eu.hansolo.tilesfx;
    requires javafx.media;

    opens com.example.videoplayer to javafx.fxml;
    exports com.example.videoplayer;
}