package com.xyinc.poi.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xyinc.poi.model.Poi;
import com.xyinc.poi.repository.PoiRepository;
import com.xyinc.poi.service.PoiService;

@Service
public class PoiServiceImpl implements PoiService {

	@Autowired
	private PoiRepository repository;

	@Override
	@Transactional
	public Iterable<Poi> findAll() {
		return repository.findAll();
	}

	@Override
	@Transactional(rollbackOn = Exception.class)
	public Poi save(Poi poi) {
		return repository.save(poi);
	}

	@Override
	@Transactional
	public Iterable<Poi> listByProximity(Integer coordinateX, Integer coordinateY, Integer maxDistance) {

		double coordinateXDouble = (double) coordinateX.intValue();
		double coordinateYDouble = (double) coordinateY.intValue();
		double maxDistanceDouble = (double) maxDistance.intValue();

		Iterable<Poi> pois = repository.findAll();

		List<Poi> result = new ArrayList<Poi>();

		for (Poi poi : pois) {

			double poiCoordinateX = (double) poi.getCoordinateX();
			double poiCoordinateY = (double) poi.getCoordinateY();

			Double distance = Math.hypot(poiCoordinateX - coordinateXDouble, poiCoordinateY - coordinateYDouble);

			if (distance <= maxDistanceDouble) {
				result.add(poi);
			}

		}
		return result;
	}

}
