package corejava;

public class Factorial {

	public static void main(String[] args) {
		int factorialnumber = 6;
		long fact = 1;

		for (int i = 1; i <= factorialnumber; i++) {
			fact = fact * i;

		}
		System.out.println("Factorialof the numbers " + factorialnumber + "  " + "is:" + "" + " " + fact);
	}
}
