module com.example.advancedjavalab1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.advancedjavalab1 to javafx.fxml;
    exports com.example.advancedjavalab1;
}