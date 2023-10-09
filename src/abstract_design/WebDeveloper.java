package abstract_design;

public class WebDeveloper implements Employee{

	@Override
	public int Salary() {
		System.out.println("Getting Web developers salary");
		return 70000;
	}

	@Override
	public String name() {
		System.out.println("I am Web developer");
		return "Web developer";
	}
}
