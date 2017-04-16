package sample;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.SplitPane;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import sample.Main;

import java.io.IOException;

public class StartController  {



    @FXML
    private Button statsButton;

    @FXML
    private Button settingsButton;

    @FXML
    private Button newSubject;

    @FXML
    void createSubject(ActionEvent event) throws IOException{
        AnchorPane root = (AnchorPane) FXMLLoader.load(getClass().getResource("Quiz.fxml"));
        Scene sceneOfEvent = (Scene) newSubject.getScene();
        BorderPane mainLayout = (BorderPane) sceneOfEvent.getRoot();
        SplitPane sp = (SplitPane) mainLayout.getCenter();
        sp.getItems().remove(1);
        sp.getItems().add(root);
    }

    @FXML
    void settingsIssueFired(ActionEvent event) {

    }

    @FXML
    void statsIssueFired(ActionEvent event) {

    }

}
