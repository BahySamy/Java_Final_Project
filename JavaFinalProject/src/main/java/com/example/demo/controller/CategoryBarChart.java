package com.example.demo.controller;

import org.knowm.xchart.BitmapEncoder;
import org.knowm.xchart.CategoryChart;
import org.knowm.xchart.CategoryChartBuilder;
import org.knowm.xchart.style.Styler;

import java.util.List;

public class CategoryBarChart {

    public static CategoryChart barChart(String name , String x_title, List<String> feature, List<Long> counts) {

        // Create Chart
        CategoryChart chart =
                new CategoryChartBuilder()
                        .width(900)
                        .height(600)
                        .title("chart")
                        .xAxisTitle(x_title)
                        .yAxisTitle("Counts")
                        .build();

        // Customize Chart
        chart.getStyler().setXAxisLabelRotation(45);
        chart.getStyler().setLegendPosition(Styler.LegendPosition.InsideNW);
        //chart.getStyler().setLabelsVisible(false);
        chart.getStyler().setPlotGridLinesVisible(false);

        chart.addSeries( name,feature, counts);


        return chart;
    }
}