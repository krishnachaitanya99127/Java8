package com.java8;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;

public class DateTimeDemo 
{
	
	public static void main(String[] args)
	{
		//LocalDate d = LocalDate.now();
		LocalDate d = LocalDate.of(1993,Month.AUGUST,9);
		System.out.println(d);
		LocalTime t = LocalTime.now();
		System.out.println(t);
	}

}
