module com.example.sigorta {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.sigorta to javafx.fxml;
    exports com.example.sigorta;
}