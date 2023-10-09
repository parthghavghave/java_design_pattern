package abstract_design;

public class AndroidDeveoper implements Employee{

	@Override
	public int Salary() {
		System.out.println("Getting Android developers salary");
		return 50000;
	}

	@Override
	public String name() {
		System.out.println("I am Android developer");
		return "Android developer";
	}

}
