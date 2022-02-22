package com.codeclan.example.employeeData;

import com.codeclan.example.employeeData.models.Employee;
import com.codeclan.example.employeeData.repositories.EmployeeRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class EmployeeDataApplicationTests {

	@Autowired
	EmployeeRepository employeeRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void createEmployee(){
		Employee jack = new Employee("Jack", 32 ,"1234", "jack.sparrow@gmail.com");
		employeeRepository.save(jack);
	}

}
