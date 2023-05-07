module com.boomberman.ood_project_bbm {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.boomberman.application to javafx.fxml;
    exports com.boomberman.application;
    exports com.boomberman.controller;
    opens com.boomberman.controller to javafx.fxml;
}