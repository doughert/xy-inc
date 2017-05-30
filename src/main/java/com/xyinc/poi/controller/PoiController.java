package com.xyinc.poi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xyinc.poi.model.Poi;
import com.xyinc.poi.service.PoiService;

@RestController
@RequestMapping(value = "/poi")
public class PoiController {
	
	@Autowired
	private PoiService poiService;
	
	@GetMapping
	public Iterable<Poi> findAll() {
		return poiService.findAll();
	}

	@PostMapping
	public Poi save(@RequestBody Poi poi) {
		return poiService.save(poi);
	}

}
