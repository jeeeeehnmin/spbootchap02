package com.example;

import javax.inject.Inject;

import org.apache.tomcat.jdbc.pool.DataSource;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Chap02Application implements CommandLineRunner{

	@Inject
	DataSource ds;			//package 주의
	
	public static void main(String[] args) {
//		SpringApplication.run(Chap02Application.class, args);
		SpringApplication application = new SpringApplication(Chap02Application.class);
		
		/*
		 * application.properties 중 프로필 설정한 것 지정하기
		 *  >> 프로필 네이밍 규칙을 따라야 한다.
		 */
		application.setAdditionalProfiles("mysql");
//		application.setAdditionalProfiles("mysql-ec2");
//		application.setAdditionalProfiles("oracle");
		
		application.run(args);
	}

	@Override
	public void run(String... args) throws Exception {

		System.out.println("###");
		System.out.println("### " + ds.getDriverClassName());
		System.out.println("### " + ds.getUrl());
		System.out.println("###");
	}
}
