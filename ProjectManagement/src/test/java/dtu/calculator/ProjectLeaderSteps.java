package dtu.calculator;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import dtu.program.app.Employee;
import dtu.program.app.Project;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ProjectLeaderSteps {
	Project project;
	Employee user;
	
	
	
	
	@Given("that the user with the name {string}")
	public void that_the_user_with_the_name(String userName) {
	    user = new Employee(userName);
		
	}

	@And("a project with project number of {string} does exists")
	public void a_project_with_project_number_of_does_exists(String projectID) {
	    assertThat(project.containsProject(projectID), is(equalTo(projectID)));
		
	}

	@And("there is no project leader assigned to that project")
	public void there_is_no_project_leader_assigned_to_that_project() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@And("the employee is not a project leader for that project")
	public void the_employee_is_not_a_project_leader_for_that_project() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@And("the employee is not a project leader for any other project")
	public void the_employee_is_not_a_project_leader_for_any_other_project() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("that employee is assigned to that project")
	public void that_employee_is_assigned_to_that_project() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("The employee with the name {string} is registered as the project leader for the project number {string}")
	public void the_employee_with_the_name_is_registered_as_the_project_leader_for_the_project_number(String string, String string2) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	
	
}
