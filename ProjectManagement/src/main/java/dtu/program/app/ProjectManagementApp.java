package dtu.program.app;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.BooleanSupplier;

public class ProjectManagementApp {

	//ProjectManagementApp har en database med Employee
	ExampleEmployeeRepository exampleDatabase;
	ArrayList<String> employees = new ArrayList<String>();
	ArrayList<String> projectList = new ArrayList<String>();
	Employee employee;
	EmployeeRepository employeeRepository;
	
	 
	public ProjectManagementApp(ExampleEmployeeRepository exampleDatabase) {
		this.exampleDatabase = exampleDatabase;
		
	}

	public boolean containsEmployeeWithName(String string) {
		return employees.contains(string);
	}

	public Project createProjectByUser(String userName) {
		// TODO Auto-generated method stub
		return null;
	}

	public void addEmployee(Employee name) {
		employeeRepository.addEmployee(name);
		
	}

	public boolean containsProjectWithName(Project project) {
		return projectList.contains(project);
	}
	
	
}
