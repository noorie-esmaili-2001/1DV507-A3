package ne222hz_assign3.Exercise4;

import java.util.Arrays;

import org.knowm.xchart.CategoryChart;
import org.knowm.xchart.CategoryChartBuilder;
import org.knowm.xchart.demo.charts.ExampleChart;
import org.knowm.xchart.style.Styler.LegendPosition;

public class MyBarChart implements ExampleChart<CategoryChart> {

	private Integer[] data;

	public MyBarChart(Integer[] data) {
		this.data = data;
	}

	public Integer[] getData() {
		return data;
	}

	public void setData(Integer[] data) {
		this.data = data;
	}

	@Override
	public CategoryChart getChart() {

		// Create Chart
		CategoryChart chart = new CategoryChartBuilder().width(800).height(600).title("Integer Bar Chart")
				.xAxisTitle("Intervals").yAxisTitle("Count").build();

		// Customize Chart
		chart.getStyler().setLegendPosition(LegendPosition.InsideNW);
		chart.getStyler().setHasAnnotations(true);

		// Series
		chart.addSeries("Integer Intervals",
				Arrays.asList(new String[] { "<10", "<20", "<30", "<40", "<50", "<60", "<70", "<80", "<90", "<100" }),
				Arrays.asList(data));

		return chart;
	}

}
