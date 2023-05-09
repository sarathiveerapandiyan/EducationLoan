package com.hostel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
//@ComponentScan("module-service")
public class HostelAttendanceApplication {

	public static void main(String[] args) {
		SpringApplication.run(HostelAttendanceApplication.class, args);
	}

}
