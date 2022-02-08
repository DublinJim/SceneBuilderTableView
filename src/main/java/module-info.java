module com.example.scenebuildertableview {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.scenebuildertableview to javafx.fxml;
    exports com.example.scenebuildertableview;
}