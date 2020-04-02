package ch.fhnw.oop2.module07.ab1;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.Parent;

public class Starter extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {

		Parent rootPane = new ApplicationUI();
		Scene scene = new Scene(rootPane);

		primaryStage.setTitle("Arbeitsblatt (1)");
		primaryStage.setScene(scene);
		primaryStage.setWidth(500);
		primaryStage.setHeight(340);
		primaryStage.show();
	}

	public static void main(String[] args) {
		Application.launch(args);
	}

}
