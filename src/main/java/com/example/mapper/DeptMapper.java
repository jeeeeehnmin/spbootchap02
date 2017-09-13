package com.example.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.example.domain.Dept;

@Mapper
public interface DeptMapper {
/*
 * myBatis mapper = JPA repository
 * 
 * 개발자는 인터페이스만 작성하면 된다: 약속된 프로그래밍 방식
 * 프레임워크가 구현체를 작성함
 */
	
	@Select("select * from dept")
	public List<Dept> selectAll();
	
	/*
	 * query는 xml에 만들거나 annotation 사용
	 */
	
}
