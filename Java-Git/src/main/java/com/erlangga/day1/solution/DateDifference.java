package com.erlangga.day1.solution;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DateDifference {
	public static long getDaysBetween(LocalDate date1, LocalDate date2) {
    return date1.until(date2, ChronoUnit.DAYS);
  }
}
