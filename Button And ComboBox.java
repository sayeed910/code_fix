

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
public class Main extends Application {
    Label lbl;
    Button btn1, btn2, btn3, btn4,btn5, btn6;
    ComboBox comboBox;

    @Override
    public void start(Stage primaryStage) {
        btn1 = new Button("Button 1");
        btn2 = new Button("Button 2");
        btn3 = new Button("Button 3");
        btn4 = new Button("Button 4");
        btn5 = new Button("Button 5");
        btn6 = new Button("Button 6");

        /*btn2.setOnAction(e -> handleButtonAction(e));
        btn3.setOnAction(e -> handleButtonAction(e));
        btn4.setOnAction(e -> handleButtonAction(e));
        btn5.setOnAction(e -> handleButtonAction(e));
        btn6.setOnAction(e -> handleButtonAction(e));*/

        //make an HBOX for the 1st 3 buttons
        HBox hb=new HBox(btn1, btn2, btn3);
        //set padding and spacing
        hb.setSpacing(10);
        hb.setPadding(new Insets(20));

        //make a VBOX for the last 3 buttons
        //set padding and spacing
        VBox vb=new VBox(btn4, btn5, btn6);
        vb.setSpacing(10);
        vb.setPadding(new Insets(20));

        //add the 2 boxes and label to a simple flowpane
        FlowPane root = new FlowPane();
        root.getChildren().add(hb);
        root.getChildren().add(vb);
        //root.getChildren().add(comboBox);
        btn1.setOnAction(e -> handleButtonAction(e,root));
        //usual code at the end of start
        Scene scene = new Scene(root, 300, 250);
        primaryStage.setTitle("HBox VBox Demo FX");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public void handleButtonAction(ActionEvent event ,FlowPane root)
    {
        Button b = (Button)event.getSource();
        comboBox= new ComboBox();
        comboBox.getItems().addAll(
                "Semester",
                "Subject",
                "Course"
        );
        comboBox.setPromptText("Chose Option");
        root.getChildren().add(comboBox);
        ///lbl.setText("You Clicked on " + b.getText());

    }

    public static void main(String[] args) {
        launch(args);
    }

}

