package com.example.demo;

import com.example.demo.entities.Student;
import com.example.demo.interfaces.IStudentRepository;
import com.example.demo.repositories.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.sql.SQLOutput;
import java.util.List;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}


	@Bean
	public CommandLineRunner commandLineRunner(StudentRepository studentRepository) {
		return runner -> {
			//sabeStudent(new Student("primeiro nome teste","segundo nome teste", "email teste"), studentRepository);
			//getStudent(1, studentRepository);
			//getAllStudent(studentRepository);
			//getByLastName("se", studentRepository);
			//updateStudent(1, studentRepository);
			deleteById(1, studentRepository);

		};
	}

	private void sabeStudent(Student student, StudentRepository studentRepository) {
		studentRepository.save(student);
	}

	private void getStudent(int id, StudentRepository studentRepository) {
		Student student = studentRepository.findById(id);

		System.out.println(student);
	}

	private void getAllStudent(StudentRepository studentRepository) {
		List<Student> students = studentRepository.findAll();

				students.forEach(s -> {
					System.out.println(s);
				});
	}

	private void getByLastName(String lastName, StudentRepository studentRepository){
		List<Student> students = studentRepository.findByLastName(lastName);

		students.forEach(s -> {
			System.out.println(s);
		});
	}

	private void updateStudent(int id, StudentRepository studentRepository) {
		Student student = new Student("Jefte", "Goes",  "email.com");

		studentRepository.update(id, student);
	}

	private void deleteById(int id, StudentRepository studentRepository) {
		studentRepository.deleteById(id);
	}

}
