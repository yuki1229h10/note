package use;

import used.Calculator;
import used.SubCalc;

public class Call {

	public static void main(String[] args) {
		Calculator calculator = new SubCalc();

		Integer result = calculator.calc(10, 5);

		System.out.println(result);

	}
}
