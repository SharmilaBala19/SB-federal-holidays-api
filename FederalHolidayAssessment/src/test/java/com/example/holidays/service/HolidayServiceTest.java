package com.example.holidays.service;
import com.example.holidays.exception.BadRequestException;
import com.example.holidays.model.Holiday;
import com.example.holidays.repository.HolidayRepository;
import com.example.holidays.service.HolidayService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class HolidayServiceTest {

    @Mock
    private HolidayRepository repository;

    @InjectMocks
    private HolidayService holidayService;

    @Test
    void addHoliday_WithValidCountry_ShouldSave() {
        Holiday sample = new Holiday("Canada Day", LocalDate.of(2026, 7, 1), "CA");
        when(repository.save(any(Holiday.class))).thenReturn(sample);

        Holiday result = holidayService.addHoliday(sample);
        assertNotNull(result);
        assertEquals("CA", result.getCountryCode());
    }

    @Test
    void addHoliday_WithInvalidCountry_ShouldThrowException() {
        Holiday invalidSample = new Holiday("Bastille Day", LocalDate.of(2026, 7, 14), "FR");

        assertThrows(BadRequestException.class, () -> {
            holidayService.addHoliday(invalidSample);
        });
    }
}

