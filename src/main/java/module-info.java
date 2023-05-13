module com.boomberman.ood_project_bbm {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.boomberman.app to javafx.fxml;
    exports com.boomberman.app;
    exports com.boomberman.controller;
    opens com.boomberman.controller to javafx.fxml;
    exports com.boomberman.test;
    opens com.boomberman.test to javafx.fxml;
}