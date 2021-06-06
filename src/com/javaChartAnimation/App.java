package com.javaChartAnimation;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class App extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("Java Chart Animation");

        Pane pane = new Pane();
        Scene scene = new Scene(pane, 800, 600);
        stage.show();
    }
}
