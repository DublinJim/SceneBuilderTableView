package com.example.scenebuildertableview;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {

    @FXML
    private TableView<Student> table;


    @FXML
    private TableColumn<Student, String> fstName;

    @FXML
    private TableColumn<Student, String> scndName;

    @FXML
    private TableColumn<Student, Integer> studentID;


    @Override
    public void initialize(URL location, ResourceBundle resources) {

        ObservableList<Student> contactList = FXCollections.observableArrayList (
                new Student ("James", "Keogh", 22),
                new Student ("Bill", "Hunter", 23),
                new Student ("Joe", "McDonald", 24),
                new Student ("Paddy", "O'Shea", 25));


        table.setItems (contactList);
        fstName.setCellValueFactory (new PropertyValueFactory<> ("firstName"));
        scndName.setCellValueFactory (new PropertyValueFactory<> ("lastName"));
        studentID.setCellValueFactory (new PropertyValueFactory<> ("studentId"));


    }
}
