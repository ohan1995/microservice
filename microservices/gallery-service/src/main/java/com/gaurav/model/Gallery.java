package com.gaurav.model;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Gallery {
	
	private String id;
	private List<Object> images;
	
	public Gallery(String galleryId) {
		this.id = galleryId;
	}
}
