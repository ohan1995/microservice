package com.gaurav.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.gaurav.model.Gallery;


@RestController
@RequestMapping("/gallery")
public class HomeController {
	
	@Autowired
	RestTemplate restTemplate;
	
	@Autowired
	Environment environment;
	
	@RequestMapping("/home")
	public String home() {
		return "Hello from Gallery Service running at port: " + environment.getProperty("server.port");
	}
	
	@RequestMapping("/{id}")
	public Gallery getGallery(@PathVariable final String id) {
		
		Gallery gallery = new Gallery();
		gallery.setId(id);

		
		@SuppressWarnings("unchecked")
		List<Object> images = restTemplate.getForObject("http://localhost:8200/images", List.class);
		gallery.setImages(images);
	
		return gallery;
	}
}
