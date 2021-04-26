package dtu.calculator;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import dtu.program.app.EmployeeRepository;
import dtu.program.app.ExampleEmployeeRepository;
import dtu.program.app.Project;
import dtu.program.app.ProjectManagementApp;
import dtu.program.app.test;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ProjectSteps {
	ProjectManagementApp pma;
	String userName;
	Project project;
	
	public ProjectSteps(ProjectManagementApp pma, Project project) {
		this.pma = pma;
		this.project = project;
		
	}
	
	@Given("that the user is an employee with name {string} exists")
	public void that_the_user_is_an_employee_with_name_exists(String employeeName) {
		userName = employeeName;
		ExampleEmployeeRepository exampleDatabase = new ExampleEmployeeRepository();
		pma = new ProjectManagementApp(exampleDatabase);
		pma.addEmployee(employeeName);
		assertTrue(pma.containsEmployeeWithName(employeeName));
	}
	
	
	
	@When("that employee adds a project")
	public void that_employee_adds_a_project() {
		project = pma.createProjectByUser(userName);
	}

	@Then("the project with project number {string} is added")
	public void the_project_with_project_number_is_added(String projectName) {
	    equals(projectName);
	}
	
	////////////////////////////////////////////////////////////////////////
	
	
	
	
}
