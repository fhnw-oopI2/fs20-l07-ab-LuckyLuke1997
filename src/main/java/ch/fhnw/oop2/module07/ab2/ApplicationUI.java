package ch.fhnw.oop2.module07.ab2;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.layout.VBox;

public class ApplicationUI extends VBox {

	private Slider slider;
	private Label label;

	public ApplicationUI() {
		initializeControls();
		layoutControls();
	}
	
	private void initializeControls() {
		slider = new Slider();
		label = new Label();
	}

	private void layoutControls() {
		
		slider.setMin(0);
		slider.setMax(10);
		slider.setValue(5);         
		slider.setShowTickLabels(true);
		slider.setShowTickMarks(true);        
		slider.setBlockIncrement(1);      
		slider.setPadding(new Insets(5, 20, 5, 20));
		slider.setMajorTickUnit(1f);
		slider.setSnapToTicks(true);
		
		slider.valueProperty().addListener(new ChangeListener<Number>() {
			public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
				label.setText(String.valueOf(newValue)); 
			}
		});
		
		label.setPadding(new Insets(50,10,25,10));
		label.setText("0");
		
		this.setAlignment(Pos.TOP_CENTER);
		this.getChildren().addAll(label, slider);
	}
}
