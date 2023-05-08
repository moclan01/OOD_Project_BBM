module com.boomberman.ood_project_bbm {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.boomberman.view to javafx.fxml;
    exports com.boomberman.view;
    exports com.boomberman.controller;
    opens com.boomberman.controller to javafx.fxml;
}