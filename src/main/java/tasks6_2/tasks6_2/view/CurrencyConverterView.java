// view/CurrencyConverterView.java
package tasks6_2.tasks6_2.view;

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class CurrencyConverterView {
    private TextField amountInput;
    private TextField resultOutput;
    private ComboBox currencyFrom;
    private ComboBox currencyTo;
    private Button convertButton;
    private Label instructions;

    public void start(Stage stage) {
        BorderPane root = new BorderPane();

        // Instructions at the top
        instructions = new Label("Enter an amount, select currencies, and press Convert.");
        root.setTop(instructions);
        BorderPane.setMargin(instructions, new Insets(10));

        // Center grid for fields
        GridPane grid = new GridPane();
        grid.setPadding(new Insets(20));
        grid.setVgap(15);
        grid.setHgap(10);

        Label fromLabel = new Label("From Currency:");
        Label toLabel = new Label("To Currency:");
        Label amountLabel = new Label("Amount:");
        Label resultLabel = new Label("Converted Amount:");

        amountInput = new TextField();
        resultOutput = new TextField();
        resultOutput.setEditable(false);

        currencyFrom = new ComboBox();
        currencyTo = new ComboBox();

        grid.add(amountLabel, 0, 0);
        grid.add(amountInput, 1, 0);
        grid.add(fromLabel, 0, 1);
        grid.add(currencyFrom, 1, 1);
        grid.add(toLabel, 0, 2);
        grid.add(currencyTo, 1, 2);
        grid.add(resultLabel, 0, 3);
        grid.add(resultOutput, 1, 3);

        root.setCenter(grid);

        // Button at the bottom
        convertButton = new Button("Convert");
        BorderPane.setMargin(convertButton, new Insets(10));
        root.setBottom(convertButton);

        Scene scene = new Scene(root, 400, 300);
        scene.getStylesheets().add("style.css");

        stage.setScene(scene);
        stage.setTitle("Currency Converter");
        stage.show();
    }

    // Getters for controller
    public TextField getAmountInput() { return amountInput; }
    public TextField getResultOutput() { return resultOutput; }
    public ComboBox getCurrencyFrom() { return currencyFrom; }
    public ComboBox getCurrencyTo() { return currencyTo; }
    public Button getConvertButton() { return convertButton; }
}
