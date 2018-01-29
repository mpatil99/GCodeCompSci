
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Hello World!");
        Button btn = new Button();
        btn.setText("Say 'Hello World'");
        TextField txt = new TextField();
        btn.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                //System.out.println("Hello World!");
                txt.setText("Hello World");
            }
        });




        FlowPane root = new FlowPane(Orientation.VERTICAL);
        root.setColumnHalignment(HPos.CENTER); // align labels on center
        root.setPrefWrapLength(350);
        root.getChildren().add(btn);
        root.getChildren().add(txt);
        primaryStage.setScene(new Scene(root, 250, 250));
        primaryStage.show();
    }
}