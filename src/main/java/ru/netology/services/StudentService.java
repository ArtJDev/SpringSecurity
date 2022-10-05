package ru.netology.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.netology.models.Student;
import ru.netology.repositories.StudentRepository;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

	@Autowired
	private StudentRepository studentRepository;
	
	
	public List<Student> getAll() {
		return (List<Student>) studentRepository.findAll();
	}

	
	public Optional<Student> getOne(Integer Id) {
		return studentRepository.findById(Id);
	}

	public void addNew(Student student) {
		studentRepository.save(student);
	}
	
	public void update(Student student) {
		studentRepository.save(student);
	}
	
	public void delete(Integer Id) {
		studentRepository.deleteById(Id);
	}

}
