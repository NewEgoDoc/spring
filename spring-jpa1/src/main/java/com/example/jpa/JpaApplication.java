package com.example.jpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JpaApplication {

	//	public Hibernate5Module hibernate5Module() {
	//		Hibernate5Module hibernate5Module = new Hibernate5Module();
	//
	//		// 강제 지연로딩 설정
	//		hibernate5Module.configure(Hibernate5Module.Feature.FORCE_LAZY_LOADING, true);
	//
	//		return hibernate5Module;
	//	}

	public static void main(String[] args) {
		SpringApplication.run(JpaApplication.class, args);
	}

}
