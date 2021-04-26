package dtu.calculator;

import dtu.program.app.Employee;
import dtu.program.app.ProjectManagementApp;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EmployeeSteps {
	
	Employee employee;
	ProjectManagementApp pma;
	
	
	@Given("that there is an employee with name {string}")
	public void that_there_is_an_employee_with_name(String name) {
	    employee = new Employee(name);
	    
	}

	@When("the employee is added to the app")
	public void the_employee_is_added_to_the_app() {
		pma.addEmployee(employee);
		
	}

	@Then("the employee with name {string} is contained in the app")
	public void the_employee_with_name_is_contained_in_the_app(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	
}
