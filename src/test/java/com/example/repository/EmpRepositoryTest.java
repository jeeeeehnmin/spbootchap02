package com.example.repository;

import static org.junit.Assert.*;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
//@ActiveProfiles("oracle")
//@ActiveProfiles("mysql")
@ActiveProfiles("mysql-ec2")
public class EmpRepositoryTest {

	@Inject
	EmpRepository empRepository;
	
	@Test
	public void testFindAll() {

		System.out.println(empRepository.getClass());
		
		empRepository.findAll().forEach(e -> {
			System.out.println(e);
		});
	
	}

}
