package com.example.holidays.service;

import com.opencsv.bean.CsvBindByName;

public class CsvHolidayMapping {
    @CsvBindByName(column = "name")
    private String name;
    @CsvBindByName(column = "date")
    private String date; // YYYY-MM-DD
    @CsvBindByName(column = "countryCode")
    private String countryCode;

    // Getters and Setters
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getDate() { return date; }
    public void setDate(String date) { this.date = date; }
    public String getCountryCode() { return countryCode; }
    public void setCountryCode(String countryCode) { this.countryCode = countryCode; }
}
