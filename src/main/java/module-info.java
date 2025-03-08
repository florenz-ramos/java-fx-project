module com.calyx.dev.javafxdemo {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.calyx.dev.javafxdemo to javafx.fxml;
    exports com.calyx.dev.javafxdemo;
}