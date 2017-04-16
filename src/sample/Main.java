package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {
    private BorderPane _root;
    private Stage _primaryStage;

    @Override
    public void start(Stage primaryStage) throws IOException{
        _root = (BorderPane) FXMLLoader.load(Main.class.getResource("Start.fxml"));
        Scene scene = new Scene(_root);

        this._primaryStage = primaryStage;
        _primaryStage.setTitle("QuizMe");
        _primaryStage.setScene(scene);
        _primaryStage.show();
    }

    protected void showQuizScene()throws IOException{
        AnchorPane quizLayout = (AnchorPane) FXMLLoader.load(Main.class.getResource("Quiz.fxml"));
        _root.setCenter(quizLayout);
    }



    public static void main(String[] args) {

        launch(args);

    }
}
