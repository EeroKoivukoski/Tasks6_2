package tasks6_2.tasks6_2.controller;

import javafx.scene.control.Alert;
import tasks6_2.tasks6_2.model.Currency;
import tasks6_2.tasks6_2.model.CurrencyModel;
import tasks6_2.tasks6_2.view.CurrencyConverterView;

public record CurrencyConverterController(CurrencyModel model, CurrencyConverterView view) {
    public CurrencyConverterController(CurrencyModel model, CurrencyConverterView view) {
        this.model = model;
        this.view = view;

        view.getCurrencyFrom().getItems().addAll(model.getCurrencies());
        view.getCurrencyTo().getItems().addAll(model.getCurrencies());

        view.getCurrencyFrom().getSelectionModel().selectFirst();
        view.getCurrencyTo().getSelectionModel().select(1);

        view.getConvertButton().setOnAction(e -> convert());
    }

    private void convert() {
        try {
            double amount = Double.parseDouble(view.getAmountInput().getText());
            Currency from = (Currency) view.getCurrencyFrom().getValue();
            Currency to = (Currency) view.getCurrencyTo().getValue();

            double result = model.convert(amount, from, to);
            view.getResultOutput().setText(String.format("%.2f", result));

        } catch (NumberFormatException ex) {
            showError("Invalid input. Please enter a numeric value.");
        } catch (Exception ex) {
            showError("An error occurred: " + ex.getMessage());
        }
    }

    private void showError(String message) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setHeaderText("Conversion Error");
        alert.setContentText(message);
        alert.showAndWait();
    }
}
