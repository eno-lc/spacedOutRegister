module com.example.demo8 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.datatransfer;



    opens com.example.demo8 to javafx.fxml;
    exports com.example.demo8;
}