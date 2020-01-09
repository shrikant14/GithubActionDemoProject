package app;

public class Calculator {

	public Calculator() {
		System.out.println("BUILDING A CALCULATOR");
	}

	public int add(Integer... values) {
		int sum = 0;
		for (Integer val : values)
			sum = sum + val;
		return sum;
	}

}
