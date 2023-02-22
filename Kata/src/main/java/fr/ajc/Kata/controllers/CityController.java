package fr.ajc.Kata.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import fr.ajc.Kata.City;

@RestController
@RequestMapping("/api")
public class CityController {

	
	@GetMapping
	@RequestMapping("/searchCity")
	public List<String> searchCityAPI(@RequestParam String text) {
		List<String> result = City.searchCities(text);
		return result;
		
	}
}
