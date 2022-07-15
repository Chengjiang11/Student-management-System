package net.javaguides.sms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import net.javaguides.sms.entity.Student;
import net.javaguides.sms.repository.StudentRepository;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner{
     
	@Autowired
	private StudentRepository studentRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
//		
//		Student n1=new Student("Tony","Cheng","C@gmail");
//		
//		studentRepository.save(n1);
//		
//		Student n2=new Student("Bony","Cheng","C@gmail");
//			
//		studentRepository.save(n2);
//		
//		Student n3=new Student("Mony","Cheng","C@gmail");
//		
//		studentRepository.save(n3);
	}

}
