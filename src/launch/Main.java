package launch;

import javafx.application.Application;
import javafx.stage.Stage;
import presentationCreateCustomer.PrimaryStage;


public class Main extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage arg0) throws Exception {
		new UpdateInterestRate().start();
		new PrimaryStage();
	}

	
}
