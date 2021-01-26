package corejava;

public class Mathoperations {

	public static void main(String[] args) {
		MathBasic obj = new MathBasic();
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		String c = args[2];

		System.out.println("a is: " + a);
		System.out.println("b is: " + b);
		System.out.println("c is: " + c);
		
		if (c.equals("add")) {
			int w = obj.add(a, b);
			System.out.println("add of 2 numbers is: " + w);
		}
		else if (c.equals("sub")) {
			int v = obj.substract(a, b);
			System.out.println("substact of 2 numbers is: " + v);
		}
		else if (c.equals("div")) {
			int j = obj.division(a, b);
			System.out.println("division of two numbers is: " + j);
		}
		
	}

	// System.out.println("add of 2 numbers is: " +w);
	// System.out.println("substact of 2 numbers is: " +v);
	// System.out.println("division of two numbers is: " +j);

}
