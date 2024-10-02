package com.apiconnect.sample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SampleApplication.class, args);

	}

	@CrossOrigin
	@GetMapping("/oddeven")
	public String oddEven(@RequestParam int num){
		 OddEvenService oddEvenService=new OddEvenService();
		 return oddEvenService.checkOddEven(num);
	}

}
