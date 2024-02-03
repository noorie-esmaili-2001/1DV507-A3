package se.lnu.Exercise4;

import org.knowm.xchart.CategoryChart;
import org.knowm.xchart.CategoryChartBuilder;
import org.knowm.xchart.demo.charts.ExampleChart;
import org.knowm.xchart.style.Styler.LegendPosition;

import java.util.Arrays;
import java.util.List;

public class MyBarChart implements ExampleChart<CategoryChart> {

    private Integer[] data;

    public MyBarChart(Integer[] data) {
        setData(data);
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
                List.of(new String[]{"<10", "<20", "<30", "<40", "<50", "<60", "<70", "<80", "<90", "<100"}),
                Arrays.asList(getData()));

        return chart;
    }

    @Override
    public String getExampleChartName() {
        return "Bar";
    }

}
