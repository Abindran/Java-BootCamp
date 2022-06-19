package com.example.videoplayer;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.IOException;
import javafx.scene.media.Media;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        VideoPlayer videoPlayer = new VideoPlayer("file:///C:/Users/Abindran/Desktop/file_example_MP4_1280_10MG.mp4");
        Scene scene = new Scene(videoPlayer,1280,760, Color.BLACK);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}