package fr.ajc.Kata.controllers;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest
@AutoConfigureMockMvc
public class CityControllerTest {

    @Autowired
    private MockMvc mockMvc;
	
	@Test
	public void getCtiySearchVaShouldReturnAListofString() throws Exception{
	    String searchText = "va";
		this.mockMvc.perform(get("/api/searchCity").param("text",searchText))
		.andExpect(status().isOk())
		.andExpect(content().contentType(MediaType.APPLICATION_JSON))
		.andExpect(jsonPath("$").isArray())
		.andExpect(content().json("[\"Valencia\", \"Vancouver\"]"));
		
	}
    
	@Test
	public void getCtiySearchShouldReturnAnEmptyListofString() throws Exception{
	    String searchText = "v";
		this.mockMvc.perform(get("/api/searchCity").param("text",searchText))
		.andDo(print())
		.andExpect(status().isOk())
		.andExpect(content().contentType(MediaType.APPLICATION_JSON))
		.andExpect(jsonPath("$").isArray())
		.andExpect(content().json("[]"));
	}
}
