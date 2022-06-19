package com.example.videoplayer;

import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;

public class VideoPlayer extends BorderPane {

    Media media;
    MediaPlayer mediaPlayer;
    MediaView mediaView;
    Pane pane;

    VideoBar bar;

    public VideoPlayer(String filePath) {
        media = new Media(filePath);
        mediaPlayer = new MediaPlayer(media);
        mediaView = new MediaView(mediaPlayer);
        pane = new Pane();

        pane.getChildren().add(mediaView);
        //One more line
        setCenter(pane);

        //add Video bar here

        bar = new VideoBar(mediaPlayer);
        setBottom(bar);

        mediaPlayer.play();
    }
}
