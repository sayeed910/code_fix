package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class Main extends Application {
    Stage window;
    Scene scene1,scene2;
    public static void main(String[] args) {
        launch(args);
    }
    @Override

    public void start(Stage primaryStage) throws Exception{
        window=primaryStage;
        Label label1 = new Label("Welcome to first scene");
        Button button1=new Button("Go to second Window");
        button1.setOnAction(e -> window.setScene(scene2));
        VBox layout1 = new VBox(20);
        layout1.getChildren().addAll(label1,button1);
        scene1 = new Scene(layout1,500,500);
        Button button2=new Button("Go back to first Window");
        button2.setOnAction(e -> window.setScene(scene1));
        StackPane layout2 =new StackPane();
        layout2.getChildren().addAll(button2);
        scene2 = new Scene(layout2,400,600);
        window.setScene(scene1);
        window.setTitle("Shamim Iqram");
        window.show();



    }

}
