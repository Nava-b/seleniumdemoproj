package corejava;

public class MathBasic {

	public MathBasic() {

	}

	/*
	 * public static void main(String[] args) {
	 * 
	 * 
	 * 
	 * Math obj=new Math(); int e=obj.add(10, 20); int f=obj.substract(20, 10); int
	 * i=obj.division(10, 2);
	 * 
	 * System.out.println("Addtion of two numbers is:" + e);
	 * System.out.println("substraction of two numbers is: " +f);
	 * System.out.println("division of two numbers is: " +i);
	 * 
	 * }
	 */

	public int add(int a, int b) {

		return a + b;
	}

	public int substract(int x, int y) {
		int z = x - y;
		return z;
	}

	public int division(int d, int g) {
		int h = d / g;
		return h;

	}
	
	protected int add(int[] values) {
//		private int add(int a, int b, int c)
		
			int len = values.length;
			System.out.println("Array lenght is: " + len);
			
			int z=0;
			
			if(len>0) {
				
				for(int x=0; x<len; x++) {
					
					z=z+values[x];
				
				}
			
			}
			return z;
		}
	
}
