package com.example.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.example.domain.Emp;

@Mapper
public interface EmpMapper {

	@Select("select * from emp")
	public List<Emp> selectAll();
	
	/*
	 * mybatis는 쿼리 기반이라 쿼리가 반드시 있어야 한다.
	 */
	
}
