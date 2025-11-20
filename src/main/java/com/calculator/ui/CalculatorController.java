package com.calculator.ui;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import org.springframework.web.client.RestTemplate;

public class CalculatorController {

    @FXML private TextField numA;
    @FXML private TextField numB;
    @FXML private Label resultLabel;

    private final String BASE_URL = "http://54.234.17.60:8080/calc/";
    private final RestTemplate rest = new RestTemplate();

    @FXML
    private void add() {
        callApi("add");
    }

    @FXML
    private void sub() {
        callApi("sub");
    }

    @FXML
    private void mul() {
        callApi("mul");
    }

    @FXML
    private void div() {
        callApi("div");
    }

    private void callApi(String op) {
        try {
            double a = Double.parseDouble(numA.getText());
            double b = Double.parseDouble(numB.getText());

            String url = BASE_URL + op + "?a=" + a + "&b=" + b;

            Double response = rest.getForObject(url, Double.class);
            resultLabel.setText("Result: " + response);

        } catch (Exception e) {
            resultLabel.setText("Error: " + e.getMessage());
        }
    }
}
