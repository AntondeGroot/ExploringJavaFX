package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {
        Rectangle rect = new Rectangle(50, 50);

        StackPane root = new StackPane(rect);

        rect.addEventFilter(MouseEvent.MOUSE_CLICKED, evt -> {
            System.out.println("rect click(filter)1");
        //evt.consume();
        });
        root.addEventFilter(MouseEvent.MOUSE_CLICKED, evt -> {
            System.out.println("root click(filter)2");
        evt.consume();
        });

        root.setOnMouseClicked(evt -> {
            System.out.println("root click(handler)3");
        evt.consume();
        });
        rect.setOnMouseClicked(evt -> {
            System.out.println("rect click(handler)4");
        evt.consume();
        });

        Scene scene = new Scene(root, 200, 200);

        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
