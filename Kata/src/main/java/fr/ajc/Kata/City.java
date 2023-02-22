package fr.ajc.Kata;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class City {
	private static List<String> cities = Arrays.asList("Paris", "Budapest", "Skopje", "Rotterdam", "Valencia",
			"Vancouver", "Amsterdam", "Vienna", "Sydney", "New York City", "London", "Bangkok", "Hong Kong", "Dubai",
			"Rome", "Istanbul");

	public static List<String> searchCities(String text) {
		List<String> result = new ArrayList<>();
		if (text.length() < 2) {
			return result;
		} else {
			for (String city : cities) {
				if (city.toLowerCase().contains(text.toLowerCase()))
					result.add(city);
			}

			return result;
		}
	}

}
