package dtu.program.app;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.BooleanSupplier;
import dtu.program.app.Employee;

public class ProjectManagementApp {

	//ProjectManagementApp har en database med Employee
	ExampleEmployeeRepository exampleDatabase;
	ArrayList<String> employees = new ArrayList<String>();
	ArrayList<Project> projectList = new ArrayList<Project>();
	Employee employee;
	int løbenummer = -1;
	

	public ProjectManagementApp(ExampleEmployeeRepository exampleDatabase) {
		this.exampleDatabase = exampleDatabase;
		
		
	}

	public boolean containsEmployeeWithName(String string) {
		return employees.contains(string);
	}
	
	

	public Project createProjectByUser(String userName) {
		løbenummer++;
		Project newProject = new Project(løbenummer);
		projectList.add(newProject);
		return newProject;
		
	}

	public void addEmployee(String name) {
		employees.add(name);
		
	}

	//public boolean containsProjectWithName(Project project) {
	//	return projectList.contains(project);
	//}

	public boolean containsProject(String projectID) {
		System.out.println("projectId: "+ projectID);
		for(int i = 0; i<projectList.size(); i++) {
			System.out.println("projectId in list: "+ projectList.get(i).getProjectId());
			if(projectID.equals(projectList.get(i).getProjectId())) {
				return true;
			}
		}
		return false;
	}

	public Project getProject() {
		return projectList.get(løbenummer);
		
	}
	
	
}
