package com.example.repository;

import static org.junit.Assert.*;

import java.util.List;
import java.util.function.Consumer;

import javax.inject.Inject;

import static org.hamcrest.CoreMatchers.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.domain.Dept;

@RunWith(SpringRunner.class)
@SpringBootTest
//@ActiveProfiles("oracle")
@ActiveProfiles("mysql")
//@ActiveProfiles("mysql-ec2")
public class DeptRepositoryTest {

	@Inject
	DeptRepository deptRepository;
	
	@Test
	public void testFindAll() {
		System.out.println(deptRepository.getClass());
		
		deptRepository.findAll().forEach(e ->{
			System.out.println(e);
		});
		
	}

}
