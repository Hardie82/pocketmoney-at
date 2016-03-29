package com.foo.ui;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;
import javafx.scene.layout.GridPane;

import java.io.IOException;

public class MainView {

    @FXML
    private Button insertButton;

    @FXML
    private Button summaryButton;

    @FXML
    private TableView<String> summaryTable;

    @FXML
    private GridPane insertionPane;

    public Parent getRoot() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setController(this);
        fxmlLoader.setLocation(getClass().getResource(getClass().getSimpleName() + ".fxml"));

        Parent parent = fxmlLoader.load();

        initialize();

        return parent;
    }

    @FXML
    public void onInsert() {
        insertionPane.setVisible(true);
    }

    @FXML
    public void onSummary() {
        insertionPane.setVisible(false);
    }

    private void initialize() {
        insertionPane.managedProperty().bind(insertionPane.visibleProperty());
        summaryTable.managedProperty().bind(summaryTable.visibleProperty());
        summaryTable.visibleProperty().bind(insertionPane.visibleProperty().not());

        summaryTable.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);
    }

}
