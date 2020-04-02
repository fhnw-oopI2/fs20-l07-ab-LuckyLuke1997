package ch.fhnw.oop2.module07.ab1;

import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;

public class ApplicationUI extends GridPane {

	private Button button;
	public static int count = 1;
	public static int count2 = 0;
	public static int count3 = 0;

	public ApplicationUI() {
		initializeControls();
		layoutControls();
	}

	private void initializeControls() {
		button = new Button("Add Label");
		button.setOnAction(event -> addLabel());
	}

	private void layoutControls() {
		this.getChildren().add(button);
//		this.setGridLinesVisible(true);
		this.setPadding(new Insets(10, 10, 10, 10));
	}

	private void addLabel() {
		count3++;
		if (count <= 7) {
			this.add(new Label("Label_" + count3), count, count2);
			this.setHgap(10);
			this.setVgap(10);
			this.setPadding(new Insets(10, 10, 10, 10));
			count++;
		} else {
			count2++;
			count = 0;
			this.add(new Label("Label_" + count3), count, count2);
			this.setHgap(10);
			this.setVgap(10);
			this.setPadding(new Insets(10, 10, 10, 10));
			count++;
		}
	}
}
