package com.example.demo.controller;

public class Pojo {
    private String Title;
    private String Company;
    private String Location;
    private String Type;
    private String Level;
    private String YeasExp;
    private String Country;
    private String Skills;

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getCompany() {
        return Company;
    }

    public void setCompany(String company) {
        Company = company;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String location) {
        Location = location;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public String getLevel() {
        return Level;
    }

    public void setLevel(String level) {
        Level = level;
    }

    public String getYeasExp() {
        return YeasExp;
    }

    public void setYeasExp(String yeasExp) {
        YeasExp = yeasExp;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }

    public String getSkills() {
        return Skills;
    }

    public void setSkills(String skills) {
        Skills = skills;
    }

    public Pojo(String title, String company, String location, String type, String level, String yeasExp, String country, String skills) {
        Title = title;
        Company = company;
        Location = location;
        Type = type;
        Level = level;
        YeasExp = yeasExp;
        Country = country;
        Skills = skills;
    }

    @Override
    public String toString() {
        return "Pojo{" +
                "Title='" + Title + '\'' +
                ", Company='" + Company + '\'' +
                ", Location='" + Location + '\'' +
                ", Type='" + Type + '\'' +
                ", Level='" + Level + '\'' +
                ", YeasExp='" + YeasExp + '\'' +
                ", Country='" + Country + '\'' +
                ", Skills='" + Skills + '\'' +
                '}';
    }
}
