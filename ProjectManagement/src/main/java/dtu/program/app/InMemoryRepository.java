package dtu.program.app;

import java.util.ArrayList;
import java.util.List;
import dtu.program.app.Employee;
import dtu.program.app.EmployeeRepository;

public class InMemoryRepository implements EmployeeRepository {	
	
	List<Employee> employees = new ArrayList<>();
	
	@Override
	public void addEmployee(Employee employee) {
		employees.add(employee);
	}
	
}
