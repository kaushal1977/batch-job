package com.kfinatech.batch.ingestion.returns;

import org.springframework.boot.SpringApplication;

public class TestReturnsApplication {

	public static void main(String[] args) {
		SpringApplication.from(ReturnsApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
