/*********************************************************************************************************************
 *********************************************************************************************************************
 *****                                          Chapter 15: Problem 3                                            *****
 *****___________________________________________________________________________________________________________*****
 *****        3.  Another form of Transition class is ScaleTransition, which alters the size of an object.       *****
 *****           It first increases the object's size and then decreases (if you are using auto reverse).        *****
 *****                              To use it, create an object (e.g., a Rectangle),                             *****
 *****                 create a ScaleTransition object which has two parameters in its constructor,              *****
 *****           the duration and the object (e.g., new ScaleTransition(Duration.millis(1000), rectangle),       *****
 *****   and like the other Transition objects, you pass it messages of setCycleCount, setAutoReverse and play.  *****
 *****                                      See above for how to do this.                                        *****
 *****-----------------------------------------------------------------------------------------------------------*****
 *****                   In addition, pass your ScaleTransition object two additional messages:                  *****
 *****                                   setByX(value1) and setByY(value2)                                       *****
 *****                          where the value1 is the increase/decrease in width and                           *****
 *****                          value2 is the increase/decrease in height (in pixels).                           *****
 *****                  Create a Rectangle and ScaleTransition to change the size of the Rectangle.              *****
 *********************************************************************************************************************
 *********************************************************************************************************************/

// IMPORTS of needed tools and plug-ins
import javafx.animation.RotateTransition;
import javafx.animation.ScaleTransition;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.text.*;
import javafx.stage.Stage;
import javafx.util.*;
import java.awt.*;


public class Chapter15_3 extends Application {

    // INSTANCE VARIABLE(s) declaration(s)
    private Timeline animation;

    public static void main(String[] args) {

        launch(args);
    }

    public void start(Stage primaryStage){

        Pane pane = new Pane();

        Rectangle rectangle = new Rectangle(150, 200, 150, 100);

        pane.getChildren().add(rectangle);

        ScaleTransition st = new ScaleTransition(Duration.millis(1000), rectangle);
    }

    public void play(){

        animation.play();
    }
}
