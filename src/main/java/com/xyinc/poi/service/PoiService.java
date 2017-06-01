package com.xyinc.poi.service;

import com.xyinc.poi.model.Poi;

public interface PoiService {

	Iterable<Poi> findAll();

	Poi save(Poi user);

	Iterable<Poi> listByProximity(Integer coordinateX, Integer coordinateY, Integer maxDistance);

}
