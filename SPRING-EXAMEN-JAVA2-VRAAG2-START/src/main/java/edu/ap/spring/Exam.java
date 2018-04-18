package edu.ap.spring;

import java.awt.Point;
import java.util.*;
import org.springframework.stereotype.Component;

@Component
public class Exam {
	
	// Maak gebruik van lambdas en streams om een array met alle
	// priemgetallen terug te geven
	// 2 punten
	public int[] getPrimes(int[] numbers) {
		return numbers;
	}
	
	// Maak gebruik van lambdas en streams alle lowercase characters
	// te tellen in de gegeven string
	// 1 punt
	public int countLowercaseCharacters(String string) {
		int count = 0;
		for (int i = 0; i < string.length(); i++) {
			char c = string.charAt(i);
	        if (Character.isLowerCase(c)) {
	            count++;
	        }
		}
		return count;
	}
	
	// Maak gebruik van lambdas en streams om de som van alle
	// x-coordinaten uit de lijst van points te berekenen
	// 1 punt
	public int sumOfX(List<Point> points) {
		int count = 0;
		for (Point point : points) {
			count+= point.getX();
		}
		return count;
	}
	
	// Maak gebruik van lambdas en streams om een comma-separated
	// string te maken die alle x-coordinaten bevat die groter of gelijk 
	// zijn aan twee
	// 2 punten
	public String getXOverTwo(List<Point> points) {
		String result = "";
		for (Point point : points) {
			if (point.getX() >= 2) {
				result += point.getX()+ ", ";
			}
		}
		return result;
		
	}
}
