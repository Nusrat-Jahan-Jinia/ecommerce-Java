package com.example.solver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class SolverApplication {

	public static void main(String[] args) {
		SpringApplication.run(SolverApplication.class, args);
	}

	@RestController
	@RequestMapping(path = "/")
	class DemoController{
		@RequestMapping(value = "/print/{msg}", method = RequestMethod.GET)
		public String print(@PathVariable(value = "") String msg){
			return "Hello world!" +msg;
		}
	}


}
