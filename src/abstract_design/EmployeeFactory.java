package abstract_design;

public class EmployeeFactory {

	public static Employee getEmployee(EmployeeAbstractFactory factory) {
		return factory.createEmployee();
	}
}
