package com.binlist.rest.util;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Utils {

	public static String getDateFormat(String format) {

		LocalDateTime now = LocalDateTime.now();

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern(format);

		return now.format(formatter);
	}
	
	private Utils() {
		throw new IllegalStateException("Utils class");
	}

}
