package edu.ap.spring;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ExamApplication {
	
	@Bean
    public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
		return (args) -> {};
    }
	
	public static void main(String[] args) {
		SpringApplication.run(ExamApplication.class, args);
		
		Exam exam = new Exam();
		
		int[] getallen = {1,2,3,4,5,6,7,8,9,10};
		exam.getPrimes(getallen);
		
	}
}