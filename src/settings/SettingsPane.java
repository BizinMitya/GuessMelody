package settings;

import javafx.scene.Cursor;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import main.Main;

/**
 * Created by Dmitriy on 20.08.2016.
 */
public class SettingsPane {
    private Pane pane;
    private Scene scene;
    private Label settingsTour1Label;
    private Label settingsTour2Label;
    private Label settingsTour3Label;
    private Label settingsSuperGameLabel;
    private Label settingsFolderLabel;
    private Label backLabel;
    private ImageView backgroundImageView;


    public Label getSettingsFolderLabel() {
        return settingsFolderLabel;
    }

    public SettingsPane() {
        backgroundImageView = new ImageView(new Image(Main.getPathToResource("images/settings.jpg")));
        backgroundImageView.setFitHeight(Main.SCREEN_SIZE.getHeight());//подгон под высоту
        backgroundImageView.setFitWidth(Main.SCREEN_SIZE.getWidth());//подгон под ширину
        backgroundImageView.setSmooth(true);//сглаживание

        pane = new Pane();

        settingsTour1Label = new Label("Настройки 1го тура");
        settingsTour1Label.setCursor(Cursor.HAND);
        settingsTour1Label.setLayoutX(Main.SCREEN_SIZE.getWidth() * 0.03);//в процентах от размеров экрана,резиновая вёрстка
        settingsTour1Label.setLayoutY(Main.SCREEN_SIZE.getHeight() * 0.1);
        settingsTour1Label.setId("settingsPaneLabel");

        settingsTour2Label = new Label("Настройки 2го тура");
        settingsTour2Label.setCursor(Cursor.HAND);
        settingsTour2Label.setLayoutX(Main.SCREEN_SIZE.getWidth() * 0.03);//в процентах от размеров экрана,резиновая вёрстка
        settingsTour2Label.setLayoutY(Main.SCREEN_SIZE.getHeight() * 0.2);
        settingsTour2Label.setId("settingsPaneLabel");

        settingsTour3Label = new Label("Настройки 3го тура");
        settingsTour3Label.setCursor(Cursor.HAND);
        settingsTour3Label.setLayoutX(Main.SCREEN_SIZE.getWidth() * 0.03);//в процентах от размеров экрана,резиновая вёрстка
        settingsTour3Label.setLayoutY(Main.SCREEN_SIZE.getHeight() * 0.3);
        settingsTour3Label.setId("settingsPaneLabel");

        settingsSuperGameLabel = new Label("Настройки супер-игры");
        settingsSuperGameLabel.setCursor(Cursor.HAND);
        settingsSuperGameLabel.setLayoutX(Main.SCREEN_SIZE.getWidth() * 0.03);//в процентах от размеров экрана,резиновая вёрстка
        settingsSuperGameLabel.setLayoutY(Main.SCREEN_SIZE.getHeight() * 0.4);
        settingsSuperGameLabel.setId("settingsPaneLabel");

        settingsFolderLabel = new Label("Папка с мелодиями");
        settingsFolderLabel.setCursor(Cursor.HAND);
        settingsFolderLabel.setLayoutX(Main.SCREEN_SIZE.getWidth() * 0.03);//в процентах от размеров экрана,резиновая вёрстка
        settingsFolderLabel.setLayoutY(Main.SCREEN_SIZE.getHeight() * 0.5);
        settingsFolderLabel.setId("settingsPaneLabel");

        backLabel = new Label("Назад");
        backLabel.setCursor(Cursor.HAND);
        backLabel.setLayoutX(Main.SCREEN_SIZE.getWidth() * 0.03);//в процентах от размеров экрана,резиновая вёрстка
        backLabel.setLayoutY(Main.SCREEN_SIZE.getHeight() * 0.6);
        backLabel.setId("settingsPaneLabel");

        scene = new Scene(pane, Main.SCREEN_SIZE.getWidth(), Main.SCREEN_SIZE.getHeight());
        scene.getStylesheets().add(Main.getPathToResource("css/style.css"));
        pane.getChildren().addAll(backgroundImageView, settingsTour1Label, settingsTour2Label, settingsTour3Label,
                settingsSuperGameLabel, settingsFolderLabel, backLabel);
    }

    public Scene getScene() {
        return scene;
    }

    public Label getSettingsTour1Label() {
        return settingsTour1Label;
    }

    public Label getSettingsTour2Label() {
        return settingsTour2Label;
    }

    public Label getSettingsTour3Label() {
        return settingsTour3Label;
    }

    public Label getSettingsSuperGameLabel() {
        return settingsSuperGameLabel;
    }

    public Label getBackLabel() {
        return backLabel;
    }
}