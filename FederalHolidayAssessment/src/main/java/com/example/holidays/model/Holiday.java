package com.example.holidays.model;
import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "holidays")
public class Holiday {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private LocalDate holidayDate;

    @Column(nullable = false)
    private String countryCode; // e.g., "US", "CA"

    // Getters, Setters, and Constructors
    public Holiday() {}

    public Holiday(String name, LocalDate holidayDate, String countryCode) {
        this.name = name;
        this.holidayDate = holidayDate;
        this.countryCode = countryCode.toUpperCase();
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public LocalDate getHolidayDate() { return holidayDate; }
    public void setHolidayDate(LocalDate holidayDate) { this.holidayDate = holidayDate; }
    public String getCountryCode() { return countryCode; }
    public void setCountryCode(String countryCode) { this.countryCode = countryCode.toUpperCase(); }
}
