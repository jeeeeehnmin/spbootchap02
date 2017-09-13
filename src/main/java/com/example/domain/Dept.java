package com.example.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Dept {
	
/*
 * 데이터 보관 객체(entity)
 * myBatis * = JPA entity = java object = RDBMS table
 * 
 * @Entity : 객체를 하나의 테이블로 대응시킨다.
 * @Id : primary key 지정
 */
	
	@Id
	@Column(precision=2)
	private Integer deptno;
	@Column(length=14, nullable=false)
	private String dname;
	@Column(length=13)
	private String loc;
	
}
