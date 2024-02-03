package se.lnu.Exercise4;

import java.awt.Color;

import org.knowm.xchart.PieChart;
import org.knowm.xchart.PieChartBuilder;
import org.knowm.xchart.demo.charts.ExampleChart;

public class MyPieChart  implements ExampleChart<PieChart> {


	private Integer[] data;



	  public MyPieChart(Integer[] data) {
		setData(data);
	}



	public Integer[] getData() {
		return data;
	}



	public void setData(Integer[] data) {
		this.data = data;
	}




	  @Override
	  public PieChart getChart() {

	    // Create Chart
	    PieChart chart = new PieChartBuilder().width(800).height(600).title(getClass().getSimpleName()).build();

	    // Customize Chart
	    Color[] sliceColors = new Color[] { Color.blue, Color.yellow, Color.pink , Color.green, Color.red, Color.cyan, Color.gray, Color.magenta, Color.orange, Color.white };
	    chart.getStyler().setSeriesColors(sliceColors);

	    // Series
	    System.err.println(getData()[0]);
	    chart.addSeries("<10", getData()[0]/10);
	    chart.addSeries("<20", getData()[1]/10);
	    chart.addSeries("<30", getData()[2]/10);
	    chart.addSeries("<40", getData()[3]/10);
	    chart.addSeries("<50", getData()[4]/10);
	    chart.addSeries("<60", getData()[5]/10);
	    chart.addSeries("<70", getData()[6]/10);
	    chart.addSeries("<80", getData()[7]/10);
	    chart.addSeries("<90", getData()[8]/10);
	    chart.addSeries("<100", getData()[9]/10);

	    return chart;
	  }

    @Override
    public String getExampleChartName() {
        return "Pie";
    }
}
