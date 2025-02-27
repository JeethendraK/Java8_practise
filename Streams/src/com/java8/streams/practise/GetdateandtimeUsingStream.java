package com.java8.streams.practise;

import java.time.LocalDate;

public class GetdateandtimeUsingStream {

	public static void main(String[] args) {
		// Used LocalDate API to get the date
		System.out.println("Current Local Date: " + LocalDate.now());
		// Used LocalTime API to get the time
		System.out.println("Current Local Time: " + java.time.LocalTime.now());

		// Used LocalDateTime API to get both date and time
		System.out.println("Current Local Date and Time: " + java.time.LocalDateTime.now());

	}

}
