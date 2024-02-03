package ne222hz_assign3.Exercise8;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.ComboBox;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class TinyPainter extends Application {
	private Rectangle rectangle;
	private Circle circle;
	private Line line;
	private double a;
	private double b;

	Pane root;
	ComboBox<String> shapesComboBox;
	ColorPicker colorPicker;
	ComboBox<Double> s;
	Scene scene;

	public void init() {
		root = new Pane();
		shapesComboBox = new ComboBox<>();
		colorPicker = new ColorPicker(Color.WHITE);
		s = new ComboBox<>();
		scene = new Scene(root, 900, 600);

	}

	@Override
	public void start(Stage primaryStage) {
		init();
		shapesComboBox.relocate(6, 6);
		shapesComboBox.getItems().addAll("Line", "Dot", "Rectangle", "Circle");
		shapesComboBox.setValue("Line");

		colorPicker.relocate(200, 5);
		s.relocate(125, 5);

		s.getItems().addAll(1.0, 8.0, 9.0, 10.0, 11.0, 12.0, 14.0, 16.0, 18.0, 20.0);
		s.setValue(1.0);

		root.setOnMousePressed(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent event) {
				a = event.getX();
				b = event.getY();
				if (shapesComboBox.getSelectionModel().getSelectedIndex() == 0) {
					Double lwidth = s.getSelectionModel().getSelectedItem();
					line = new Line();
					line.setStrokeWidth(lwidth);
					line.setStroke(colorPicker.getValue());
					line.relocate(a, b);
					root.getChildren().addAll(line);
				}
				if (shapesComboBox.getSelectionModel().getSelectedIndex() == 1) {
					Double dotsize = s.getSelectionModel().getSelectedItem();
					rectangle = new Rectangle(dotsize, dotsize);
					rectangle.setStrokeWidth(dotsize);
					rectangle.setFill(colorPicker.getValue());
					rectangle.relocate(a, b);
					root.getChildren().addAll(rectangle);
				}
				if (shapesComboBox.getSelectionModel().getSelectedIndex() == 2) {
					rectangle = new Rectangle();
					rectangle.setFill(colorPicker.getValue());
					rectangle.relocate(a, b);
					root.getChildren().addAll(rectangle);
				}
				if (shapesComboBox.getSelectionModel().getSelectedIndex() == 3) {
					circle = new Circle();
					circle.relocate(a, b);
					circle.setFill(colorPicker.getValue());
					root.getChildren().addAll(circle);
				}
			}
		});

		root.setOnMouseDragged(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent event) {
				if (shapesComboBox.getSelectionModel().getSelectedIndex() == 0) {
					line.setEndX(event.getX() - a);
					line.setEndY(event.getY() - b);
				} else {
					if (shapesComboBox.getSelectionModel().getSelectedIndex() == 2) {
						rectangle.setHeight(event.getX() - a);
						rectangle.setWidth(event.getY() - b);
					} else {
						if (shapesComboBox.getSelectionModel().getSelectedIndex() == 3) {
							circle.setRadius(event.getX() - a);
						}
					}
				}
			}
		});
		root.getChildren().addAll(shapesComboBox, s, colorPicker);

		scene.setFill(Color.WHITE);

		primaryStage.setTitle("Tiny Painter");
		primaryStage.setResizable(false);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}

}