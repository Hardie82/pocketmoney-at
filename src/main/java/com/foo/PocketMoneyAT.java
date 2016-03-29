package com.foo;

import com.foo.ui.MainView;
import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.io.IOException;

public class PocketMoneyAT extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Scene scene = new Scene(createRoot(), 800, 600);
        scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
        stage.setScene(scene);
        stage.setTitle("pocketmoney-at");
        stage.show();
    }

    private Parent createRoot() throws IOException {
        return new MainView().getRoot();
    }
}
