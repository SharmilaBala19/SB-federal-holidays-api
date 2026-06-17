package com.example.holidays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {
        "com.example.holidays"})
public class FederalHolidayAssessmentApplication {

    public static void main(String[] args) {
        SpringApplication.run(FederalHolidayAssessmentApplication.class, args);
    }

}
