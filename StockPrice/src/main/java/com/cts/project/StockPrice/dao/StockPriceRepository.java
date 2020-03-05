package com.cts.project.StockPrice.dao;

import org.springframework.data.repository.CrudRepository;

import com.cts.project.StockPrice.pojos.StockPrice;

public interface StockPriceRepository extends CrudRepository<StockPrice, String> {

	

}
