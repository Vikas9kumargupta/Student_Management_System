package com.vikasLearning.student;

import com.vikasLearning.student.entity.Student;
import com.vikasLearning.student.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentManagementApplication implements CommandLineRunner {



	public static void main(String[] args) {
		SpringApplication.run(StudentManagementApplication.class, args);
	}

	@Autowired
	private StudentRepository studentRepository;
	@Override
	public void run(String... args) throws Exception {
//		Student student1 = new Student("Vikas","Gupta","+916394031829","vikasgup074@gmail.com");
//		studentRepository.save(student1);
//
//		Student student2 = new Student("Avinash","Rai","+916378904567","avirai78@gmail.com");
//		studentRepository.save(student2);
//
//		Student student3 = new Student("Tony","Stark","+918976874567","tonystark45@gmail.com");
//		studentRepository.save(student3);


	}
}
