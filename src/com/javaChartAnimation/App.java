package com.javaChartAnimation;

import javafx.animation.PathTransition;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.util.Duration;

public class App extends Application {

    @Override
    public void start(Stage stage) throws Exception {


        Rectangle rectangle = new Rectangle(100,100,100,100);
        rectangle.setFill(Color.BLUE);
        Circle circle = new Circle(100,100,100);

        circle.setFill(Color.TRANSPARENT);
        circle.setCenterX(300);
        circle.setCenterY(300);

        PathTransition pt = new PathTransition();
        pt.setDuration(Duration.millis(2000));
        pt.setPath(circle);
        pt.setNode(rectangle);

        pt.play();
        
        stage.setTitle("Java Chart Animation");

        Pane root = new Pane();
        root.getChildren().addAll(circle, rectangle);

        stage.setScene(new Scene(root, 600, 600));
        stage.show();
    }
}
