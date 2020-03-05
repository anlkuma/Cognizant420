package com.cts.project.Company.dao;

import org.springframework.data.repository.CrudRepository;

import com.cts.project.Company.pojos.Company;

public interface CompanyRepository extends CrudRepository<Company, String> {

	

}
