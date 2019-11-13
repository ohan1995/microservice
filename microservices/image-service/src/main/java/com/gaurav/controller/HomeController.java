package com.gaurav.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gaurav.model.Image;

@RestController
@RequestMapping("/")
public class HomeController {
	
	
	
	@RequestMapping("/images")
	public List<Image> getImages(){
		List<Image> images = Arrays.asList(
				new Image(1,"Treehouse of Horror V","https://www.imdb.com/title/tt0096697/mediaviewer/rm3842005760"),
				new Image(2, "The Town", "https://www.imdb.com/title/tt0096697/mediaviewer/rm3698134272")
				);
		return images;
	}
}
