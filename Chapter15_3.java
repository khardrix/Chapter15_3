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
import javafx.animation.ScaleTransition;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.util.*;
import javafx.scene.shape.*;


public class Chapter15_3 extends Application {

    // INSTANCE VARIABLE(s) declaration(s)
    private Timeline animation;

    public static void main(String[] args) {

        launch(args);
    }

    public void start(Stage primaryStage){

        // Create the Pane
        Pane pane = new Pane();

        // Create the Rectangle object and make it blue
        Rectangle rectangle = new Rectangle(150, 200, 150, 100);
        rectangle.setFill(Color.BLUE);

        // Add the Rectangle to the Pane
        pane.getChildren().add(rectangle);

        // Create the Scene, set the Title of the Scene, Set the Scene to the Stage, Show the Stage
        Scene scene = new Scene(pane, 500, 500);
        primaryStage.setTitle("Chapter 15, Problem 3: Size Changing Rectangle");
        primaryStage.setScene(scene);
        primaryStage.show();

        // Create the ScaleTransition object
        ScaleTransition st = new ScaleTransition(Duration.millis(1000), rectangle);

        // Set the CycleCount to INDEFINITE, Set AutoReverse to True, Set the X-value to multiply by 2,
            // Set the Y-value to multiply by 3 and Play the ScaleTransition object
        st.setCycleCount(Timeline.INDEFINITE);
        st.setAutoReverse(true);
        st.setByX(2);
        st.setByY(3);
        st.play();
    }

    public void play(){

        animation.play();
    }
}
