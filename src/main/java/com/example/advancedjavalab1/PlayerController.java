package com.example.advancedjavalab1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class PlayerController {

    @FXML
    private Label finalLabel;

    @FXML
    private TextField playerNameTextField;

    @FXML
    private ComboBox<?> playerTypeComboBox;

    @FXML
    private ComboBox<?> positionComboBox;

    @FXML
    private ComboBox<?> teamComboBox;

    @FXML
    void savePlayer(ActionEvent event) {

    }

}

