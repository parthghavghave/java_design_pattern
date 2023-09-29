package factory;

public class FEDeveoper implements Employee{

	@Override
	public int Salary() {
		System.out.println("Getting FE developers salary");
		return 50000;
	}

}
