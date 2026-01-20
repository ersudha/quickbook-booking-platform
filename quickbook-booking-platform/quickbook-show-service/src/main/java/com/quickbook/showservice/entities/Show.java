package com.quickbook.showservice.entities;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;

public class Show {
    private Long id;
    private Long movieId;
    private Long screenId;
    private LocalDate showDate;
    private LocalTime startTime;
    private BigDecimal basePrice;
}
