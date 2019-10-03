package me.kalaiselvan.java8.datetimedemo;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;

public class DateTimeDemo1 {

	public static void main(String[] args) {
		LocalDate date1 = LocalDate.now();
		System.out.println("Local Date --> " + date1);
		
		LocalDate date2 = LocalDate.of(1992, Month.FEBRUARY, 13);
		System.out.println("Custom Date --> " + date2);
		
		LocalTime time1 = LocalTime.now();
		System.out.println("Local Time --> " + time1);
		
		LocalTime time2 = LocalTime.of(23, 30, 30);
		System.out.println("Custom Time -->" + time2);
		
		// Gives date and time in GMT
		Instant i = Instant.now();
		System.out.println("Instant time - GMT --> " + i);
		
		LocalTime time3 = LocalTime.now(ZoneId.of("Asia/Kolkata"));
		System.out.println("Time in India --> " + time3);
		
		// Gives both date and time
		LocalDateTime datetime = LocalDateTime.now();
		System.out.println("Local date and time --> " + datetime);
	}
}
