package ne222hz_assign3.Exercise4;

import java.io.IOException;

import org.knowm.xchart.CategoryChart;
import org.knowm.xchart.PieChart;
import org.knowm.xchart.SwingWrapper;
import org.knowm.xchart.demo.charts.ExampleChart;

public class PieBarChart {

	public static void main(String[] args) {
		String path = "C:\\Users\\noori\\Downloads\\integers\\integers.dat";
		try {
			Integer[] dt = MyDataChart.reading(path);

			ExampleChart<CategoryChart> exampleChart;

			exampleChart = new MyBarChart(dt);
			CategoryChart chart = exampleChart.getChart();
			new SwingWrapper<CategoryChart>(chart).displayChart();

			ExampleChart<PieChart> exampleChart2 = new MyPieChart(dt);
			PieChart chart2 = exampleChart2.getChart();
			new SwingWrapper<PieChart>(chart2).displayChart();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
