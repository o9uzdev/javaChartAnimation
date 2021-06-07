package com.javaChartAnimation;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class App extends Application {

    @Override
    public void start(Stage stage) throws Exception {

        Rectangle rectangle = new Rectangle(100,100,100,100);
        rectangle.setFill(Color.BLUE);
        Circle circle = new Circle(100,100,100);
        
        stage.setTitle("Java Chart Animation");

        Pane root = new Pane();
        root.getChildren().addAll(circle, rectangle);

        stage.setScene(new Scene(root, 600, 600));
        stage.show();
    }
}
