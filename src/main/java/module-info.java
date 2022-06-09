module com.dad.rouletteboulette2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.dad.rouletteboulette2 to javafx.fxml;
    exports com.dad.rouletteboulette2;
}