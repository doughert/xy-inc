package com.xyinc.poi.service;

import com.xyinc.poi.model.Poi;

public interface PoiService {

	public Iterable<Poi> findAll();

	public Poi save(Poi user);

}
