import db.JDBC;
import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import util.FileUtil;
import util.UIUtil;
import util.UncaughtExceptionHandler;

import java.io.IOException;

public class App extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void init() throws IOException {
        Thread.setDefaultUncaughtExceptionHandler(new UncaughtExceptionHandler());
        FileUtil.createDirectories();
        JDBC.init();
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        Parent root = FileUtil.loadMainFromFXML();
        Scene scene = new Scene(root, UIUtil.getWidth(), UIUtil.getHeight());
        primaryStage.initStyle(StageStyle.UNDECORATED);
        primaryStage.setTitle("Угадай мелодию!");
        primaryStage.getIcons().add(FileUtil.getIconImage());
        primaryStage.setScene(scene);
        primaryStage.setMaximized(true);
        primaryStage.setResizable(false);
        primaryStage.show();
        UIUtil.addKeyHandlers(scene, primaryStage);
    }

}
