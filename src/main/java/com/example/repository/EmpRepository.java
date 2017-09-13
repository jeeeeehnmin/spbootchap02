package com.example.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.domain.Emp;

public interface EmpRepository extends CrudRepository<Emp, Integer>{

}
