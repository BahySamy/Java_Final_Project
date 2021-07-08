package com.example.demo.controller;

import org.apache.spark.sql.Dataset;
import org.apache.spark.sql.Row;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;

import static org.apache.spark.sql.functions.col;
import static org.apache.spark.sql.functions.desc;

@RestController
public class WuzzufController {
    WuzzufServiceDAO service = new WuzzufServiceDAO();
    @GetMapping("/show_first_records")
    public  String  show_first_records(){
        return service.ShowData();
    }

    @GetMapping("/show_structure")
    public  String  show_structure(){
        return service.structure();
    }


    @GetMapping("/show_summary")
    public  String  show_summary(){
        return service.summary();
    }


    @GetMapping("/show_top_companies")
    public  String  show_top_companies(){
        return service.JobsByCompany();
    }

    @GetMapping("/show_top_titles")
    public  String  show_top_titles(){
        return service.JobsByTitles();
    }

    @GetMapping("/show_top_areas")
    public  String  show_top_countries(){
        return service.JobsByAreas();
    }

    @GetMapping("/show_pie_chart")
    public  String  show_pie_chart() throws IOException {
        return service.getPieChartforCompany();
    }

    @GetMapping("/title_bar_chart")
    public  String  title_bar_chart() throws IOException {
        return service.TitlesBarChart();
    }

    @GetMapping("/location_bar_chart")
    public  String  location_bar_chart() throws IOException {
        return service.areasBarChart();
    }

    @GetMapping("/show_top_skills")
    public ResponseEntity<Object> show_top_skills() throws IOException {
        return service.skill();
    }

    @GetMapping("/show_YearsExp")
    public  String  show_YearsExp() throws IOException {
        return service.factYearsExp();
    }

    @GetMapping("/kMeans")
    public  String kMeans() throws IOException {
        return service.kMeans();
    }

}
