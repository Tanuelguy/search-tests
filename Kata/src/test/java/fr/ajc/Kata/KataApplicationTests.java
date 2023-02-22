package fr.ajc.Kata;

import static org.junit.jupiter.api.Assertions.assertTrue;

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
}
