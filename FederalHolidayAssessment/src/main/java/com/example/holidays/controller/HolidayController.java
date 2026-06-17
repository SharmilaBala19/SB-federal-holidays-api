package com.example.holidays.controller;

import com.example.holidays.model.Holiday;
import com.example.holidays.service.HolidayService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@RestController
@RequestMapping("/api/holidays")
public class HolidayController {

    private final HolidayService service;

    public HolidayController(HolidayService service) {
        this.service = service;
    }

    // 1. ADD a holiday
    @PostMapping
    public ResponseEntity<Holiday> createHoliday(@RequestBody Holiday holiday) {
        return new ResponseEntity<>(service.addHoliday(holiday), HttpStatus.CREATED);
    }

    // 2. LIST holidays by country
    @GetMapping("/{countryCode}")
    public ResponseEntity<List<Holiday>> getHolidays(@PathVariable String countryCode) {
        return ResponseEntity.ok(service.getHolidaysByCountry(countryCode));
    }

    // 3. UPDATE a holiday
    @PutMapping("/{id}")
    public ResponseEntity<Holiday> updateHoliday(@PathVariable Long id, @RequestBody Holiday holiday) {
        return ResponseEntity.ok(service.updateHoliday(id, holiday));
    }

    // 4. UPLOAD bulk holidays via file
    @PostMapping("/upload")
    public ResponseEntity<List<Holiday>> uploadFile(@RequestParam("file") MultipartFile file) {
        return new ResponseEntity<>(service.uploadHolidaysCsv(file), HttpStatus.CREATED);
    }
}
