package ch.fhnw.oop2.module07.ab3;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.geometry.Insets;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;

import javafx.scene.layout.VBox;
import javafx.util.StringConverter;
import javafx.util.converter.NumberStringConverter;

public class ApplicationUI extends VBox {

	private Slider slider;
	private TextField textField;
	IntegerProperty sliderValue = new SimpleIntegerProperty(5);

	public ApplicationUI() {
		initializeControls();
		layoutControls();
	}

	private void initializeControls() {
		slider = new Slider();
		textField = new TextField();
	}

	private void layoutControls() {

		slider.setMin(0);
		slider.setMax(10);
		slider.setValue(5);
		slider.setShowTickLabels(true);
		slider.setShowTickMarks(true);
		slider.setBlockIncrement(10);
		slider.setPadding(new Insets(20, 0, 0, 0));
		slider.setMajorTickUnit(1f);

		textField.setMinWidth(120);

		slider.valueProperty().addListener(new ChangeListener<Number>() {
			public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
				textField.setText("" + newValue);
			}
		});

		StringConverter<Number> converter = new NumberStringConverter();
		textField.textProperty().bindBidirectional(slider.valueProperty(), converter);

		this.setPadding(new Insets(20, 20, 10, 20));
		this.getChildren().addAll(textField, slider);
	}

}
