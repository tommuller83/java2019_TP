import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class SimpleTestJavaFX extends Application {

    @Override
    public void start(Stage primaryStage) {
        Text text = new Text("JavaFX marche ");
        StackPane root = new StackPane(text);
        Scene scene = new Scene(root, 300, 100);
        primaryStage.setTitle("Test Simple");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
