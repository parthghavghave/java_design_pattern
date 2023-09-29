package factory;

public class BEDeveloper implements Employee{

	@Override
	public int Salary() {
		System.out.println("Getting BE developers salary");
		return 70000;
	}

}
