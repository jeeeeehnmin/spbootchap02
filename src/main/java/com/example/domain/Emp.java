package com.example.domain;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Emp {

	@Id
	private Integer empno;
	@Column(length=10, nullable=false)
	private String ename;
	@Column(length=1)
	private char gender;
	@Column(length=9)
	private String job;
	@Column(precision=4)
	private Integer mgr;
	private Date hiredate;
	@Column(precision=7, scale=2)
	private BigDecimal sal;
	@Column(precision=7, scale=2)
	private BigDecimal comm;
	@Column(precision=2)
	private Integer deptno;

}
