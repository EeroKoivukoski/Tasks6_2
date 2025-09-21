package tasks6_2.tasks6_2;
import javafx.application.Application;
import javafx.stage.Stage;
import tasks6_2.tasks6_2.model.CurrencyModel;
import tasks6_2.tasks6_2.view.CurrencyConverterView;
import tasks6_2.tasks6_2.controller.CurrencyConverterController;

public class Main extends Application {
    private static String[] args;

    @Override
    public void start(Stage stage) {
        CurrencyModel model = new CurrencyModel();
        CurrencyConverterView view = new CurrencyConverterView();
        view.start(stage);
        new CurrencyConverterController(model, view);
    }

    public static void main(String[] args) {
        launch();
    }
}
