package com.xyinc.poi.service.impl;

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
	public Iterable<Poi> findAll() {
		return repository.findAll();
	}

	@Override
	@Transactional(rollbackOn = Exception.class)
	public Poi save(Poi poi) {
		return repository.save(poi);
	}

}
