/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication13;

import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Bounds;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.paint.PhongMaterial;
import javafx.scene.shape.DrawMode;
import javafx.scene.shape.Path;
import javafx.scene.shape.Sphere;
import javafx.stage.Stage;
import javafx.util.Duration;

/**
 *
 * @author risin
 */
public class JavaFXApplication13 extends Application {
        
    @Override
    public void start(Stage Stage) {
        final PhongMaterial redMaterial = new PhongMaterial();
        redMaterial.setDiffuseColor(Color.RED);
        Pane pane = new Pane();
        Scene scene = new Scene(pane, 500, 500);
        Sphere ball = new Sphere(20,10);
        Sphere ball2 = new Sphere(20,30);
        Path iz = new Path();
        ball.setDrawMode(DrawMode.LINE);
          ball2.setDrawMode(DrawMode.LINE);

        iz.setFill(Color.RED);
        //iz.addEventHandler(EventType.ROOT, eventHandler);

        ball.relocate(0, 10);
        ball2.relocate(0, 10);

        pane.getChildren().add(ball);
        pane.getChildren().add(ball2);

        Stage.setScene(scene);
        Stage.show();

        Bounds bounds = pane.getBoundsInLocal();
        Timeline timeline = new Timeline(new KeyFrame(Duration.seconds(3), 
                new KeyValue(ball.layoutXProperty(), bounds.getMaxX()-ball.getRadius())));
        timeline.setCycleCount(2);
        timeline.play();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
