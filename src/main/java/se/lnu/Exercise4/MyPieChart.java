package ne222hz_assign3.Exercise4;

import java.awt.Color;

import org.knowm.xchart.PieChart;
import org.knowm.xchart.PieChartBuilder;
import org.knowm.xchart.demo.charts.ExampleChart;

public class MyPieChart  implements ExampleChart<PieChart> {
	 

	private Integer[] data;
	

	 
	  public MyPieChart(Integer[] data) {
		this.data = data;
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
	    System.err.println(data[0]);
	    chart.addSeries("<10", data[0]/10);
	    chart.addSeries("<20", data[1]/10);
	    chart.addSeries("<30", data[2]/10);
	    chart.addSeries("<40", data[3]/10);
	    chart.addSeries("<50", data[4]/10);
	    chart.addSeries("<60", data[5]/10);
	    chart.addSeries("<70", data[6]/10);
	    chart.addSeries("<80", data[7]/10);
	    chart.addSeries("<90", data[8]/10);
	    chart.addSeries("<100", data[9]/10);

	    return chart;
	  }
}
