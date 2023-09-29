package factory;

public class EmployeeFactory {
	
	public static Employee getEmployee(String empType) {
		if(empType.trim().equalsIgnoreCase("fe")) {
			return new FEDeveoper();
		}
		else if(empType.trim().equalsIgnoreCase("be")) {
			return new BEDeveloper();
		}
		return null;
	}

}
