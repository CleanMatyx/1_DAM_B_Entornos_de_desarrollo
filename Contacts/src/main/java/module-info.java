module org.example.contacts {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.contacts to javafx.fxml;
    exports org.example.contacts;
}