package com.luv2code.cruddemo;

import com.luv2code.cruddemo.dao.StudentDAO;
import com.luv2code.cruddemo.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CruddemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CruddemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(StudentDAO studentDAO) {
		return runner -> {
			//createStudent(studentDAO);
			createMultipleStudents(studentDAO);
		};
	}

	private void createMultipleStudents(StudentDAO studentDAO) {
		System.out.println("Creating Multiple Students");
		Student tempStudent1 = new Student("Mark", "Rubo", "Mark@avengers.org");
		Student tempStudent2 = new Student("Scarlet", "Johanson", "Scarlet@avengers.org");
		Student tempStudent3 = new Student("Ryan", "Reynolds", "Ryan@avengers.org");

		studentDAO.save(tempStudent1);
		studentDAO.save(tempStudent2);
		studentDAO.save(tempStudent3);

		// save the objects
	}

	private void createStudent(StudentDAO studentDAO) {
		// Create the student object
		System.out.println("Creating new student Object...");
		Student tempStudent = new Student("Chris", "Pratt", "starlord@avengers.org");

		// save the student object
		System.out.println("Creating new student...");
		studentDAO.save(tempStudent);

		//display the id of the student object
		System.out.println("Saved Student with ID: " + tempStudent.getId());
	}

}
