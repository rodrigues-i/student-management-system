package net.javaguides.sms;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentManagementApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		Student student1 = new Student("Anna", "Baerbock", "anna@email.com");
//		studentRepository.save(student1);
//
//		Student student2 = new Student("Mathew", "Collims", "collims@email.com");
//		studentRepository.save(student2);
//
//		Student student3 = new Student("Pedro", "Carvalho", "pedro@email.com");
//		studentRepository.save(student3);
	}
}