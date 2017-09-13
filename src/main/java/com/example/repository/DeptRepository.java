package com.example.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.domain.Dept;
	
//																file,	primary key type	
public interface DeptRepository extends CrudRepository<Dept, Integer>{

	
}
