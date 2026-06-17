package com.example.holidays.repository;

import com.example.holidays.model.Holiday;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface HolidayRepository extends JpaRepository<Holiday, Long> {
    List<Holiday> findByCountryCode(String countryCode);
}
