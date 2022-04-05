module com.skimsequence.skimsequence {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires json.simple;

    opens com.skimsequence.skimsequence to javafx.fxml;
    opens com.skimsequence.skimsequence.controllers to javafx.fxml;
    exports com.skimsequence.skimsequence;
    exports com.skimsequence.skimsequence.services;
    opens com.skimsequence.skimsequence.services to javafx.fxml;
}