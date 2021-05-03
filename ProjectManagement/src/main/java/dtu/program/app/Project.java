package dtu.program.app;

public class Project {

	String projectID;
	
	public Project(int løbenummer) {
		
		if(løbenummer < 10) {
			this.projectID = "21000" + løbenummer;
		} else if(løbenummer >= 10 && løbenummer < 100) {
			this.projectID = "2100" + løbenummer;
		} else if(løbenummer >= 100 && løbenummer < 1000) {
			this.projectID = "210" + løbenummer;
		} else {
			this.projectID = "21" + løbenummer;
		}
		
		
	}
	
	public boolean containsProject(String projectID) {
		
		return true;
	}

	public String getProjectId() {
		return projectID;
	}

}
