*
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    Stage window;
    Scene scene;
    Button button;
    ComboBox<String> comboBox;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;
        window.setTitle("StudyKit");
        button = new Button("Submit");

        comboBox = new ComboBox<>();
        comboBox.getItems().addAll(
                "Semester",
                "Subject",
                "Course"
        );

        comboBox.setPromptText("Chose Option");
        button.setOnAction(e -> printMovie());

        //ComboBoxes also generate actions if you need to get value instantly
        comboBox.setOnAction( e ->
        {
            if(comboBox.getValue()=="Semester")
            {
                VBox layout2 = new VBox(50);
                layout2.setPadding(new Insets(20, 20, 20, 20));
                layout2.getChildren().addAll(comboBox, button);
                scene = new Scene(layout2, 600, 400);
                window.setScene(scene);
                window.show();
            }
        } );

        VBox layout = new VBox(10);
        layout.setPadding(new Insets(20, 20, 20, 20));
        layout.getChildren().addAll(comboBox, button);

        scene = new Scene(layout, 600, 400);
        window.setScene(scene);
        window.show();
    }

    private void printMovie(){
        System.out.println(comboBox.getValue());
    }


}*/