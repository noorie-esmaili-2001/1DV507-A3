package se.lnu.Exercise4;

import java.util.ArrayList;

import org.knowm.xchart.SwingWrapper;
import org.knowm.xchart.XYChart;
import org.knowm.xchart.XYChartBuilder;
import org.knowm.xchart.XYSeries.XYSeriesRenderStyle;
import org.knowm.xchart.style.Styler.LegendPosition;

public class SinMain {

	public static void main(String[] args) {
		// Create and Customize Chart
		XYChart chart = new XYChartBuilder().width(800).height(600).build();
		chart.getStyler().setDefaultSeriesRenderStyle(XYSeriesRenderStyle.Scatter);
		chart.getStyler().setChartTitleVisible(false);
		chart.getStyler().setLegendPosition(LegendPosition.InsideSW);
		chart.getStyler().setMarkerSize(2);

		// Generate data
		ArrayList<Double> xData = new ArrayList<>();
		ArrayList<Double> yData = new ArrayList<>();
		double size = 2 * Math.PI;
		for (double i = 0.0; i <= size; i = i + 0.0001) {
			xData.add(i);
			yData.add((1 + i / Math.PI) * Math.cos(i) * Math.cos(40 * i));
		}

		// Display scatter plot
		chart.addSeries("Plotting the curve", xData, yData);
		new SwingWrapper<>(chart).displayChart();
	}

}
