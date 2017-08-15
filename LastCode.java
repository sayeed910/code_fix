package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


/**
 *
 * @author Martens
 */
public class LastCode extends Application {
    ComboBox comboBox,comboBox1;
    Button button;
    @Override
    public void start(Stage primaryStage) {
        comboBox1 = new ComboBox();
        comboBox1.getItems().addAll(
                "Semester",
                "Subject",
                "Course"
        );

        comboBox1.setPromptText("Choice your field");
        button = new Button("Select");
       // HBox  hBox= new HBox(button) ;
        VBox vb=new VBox(comboBox1,button);
        vb.setSpacing(10);
        vb.setPadding(new Insets(20));
        FlowPane root = new FlowPane();
        root.getChildren().add(vb);
        //root.getChildren().add(hBox);
        comboBox1.setOnAction( e -> handleComboBoxAction((String) comboBox1.getValue(),root));
        Scene scene = new Scene(root, 500, 450);
        primaryStage.setTitle("HBox VBox Demo FX");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public void handleComboBoxAction( String data, FlowPane root)
    {
        //Button b = (Button)event.getSource();
        comboBox= new ComboBox();
        comboBox.getItems().addAll(
                "Winter",
                "Spring",
                "Summer"
        );
        HBox hb=new HBox(comboBox);
        comboBox.setPromptText("Chose "+data);
        hb.setSpacing(10);
        hb.setPadding(new Insets(20));
        root.getChildren().add(hb);
        ///lbl.setText("You Clicked on " + b.getText());

    }

    public static void main(String[] args) {
        launch(args);
    }

}
