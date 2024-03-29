package fr.ajc.Kata;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class KataApplicationTests {

	@Test
	@DisplayName(value="Test recherche city avec un string trop court, doit retourner une liste vide")
	void searchCityWithTooShortStringShouldReturnEmpty() {
		List<String> result = City.searchCities("v");
		assertTrue(result.isEmpty());
	}
	@Test
	@DisplayName(value="Test recherche city avec \"Va\", doit retourner Valencia et Vancouver")
	public void searchCityWithVaString() {
	    List<String> result = City.searchCities("Va");
	    assertEquals(result.size(), 2);
	    assertTrue(result.containsAll(Arrays.asList("Valencia", "Vancouver")));
	}
	@Test
	@DisplayName(value="Test recherche city avec \"va\", doit également retourner Valencia et Vancouver")
	public void searchCityWithVaLowerString() {
	    List<String> result = City.searchCities("va");
	    assertEquals(result.size(), 2);
	    assertTrue(result.containsAll(Arrays.asList("Valencia", "Vancouver")));
	}
	@Test
	@DisplayName(value="Test recherche city avec \"ape\", doit retourner Budapest")
	void searchCityWithapeStringShouldReturnBudapest() {
		List<String> result = City.searchCities("ape");
		assertTrue(result.containsAll(Arrays.asList("Budapest")));
	}
	@Test
	@DisplayName(value="Test recherche city avec \"*\", doit retourner toutes les villes")
	public void searchCityWithAsterisk() {
	    List<String> result = City.searchCities("*");
	    assertEquals(result.size(), 16);
	    assertTrue(result.containsAll(Arrays.asList("Paris", "Budapest", "Skopje", "Rotterdam", "Valencia", "Vancouver",
	            "Amsterdam", "Vienna", "Sydney", "New York City", "London", "Bangkok", "Hong Kong", "Dubai", "Rome", "Istanbul")));
	}
}
