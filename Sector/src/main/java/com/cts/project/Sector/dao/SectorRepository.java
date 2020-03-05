package com.cts.project.Sector.dao;

import org.springframework.data.repository.CrudRepository;

import com.cts.project.Sector.pojos.Sector;


public interface SectorRepository extends CrudRepository<Sector, Integer> {

	Iterable<Sector> findAll();

}
