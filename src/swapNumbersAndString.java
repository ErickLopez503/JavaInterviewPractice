
public class swapNumbersAndString {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		
//		a=a+b;
//		b=a-b;
//		a=a-b;
		
		a=a+b;
		b=a-b;
		a=a-b;
		 
		System.out.println("a = "+ a);
		System.out.println("b = "+ b);
		
		
		String x="Hello";
		String y="Welcome";
		
//		x=x+y;
//		y=x.substring(0, x.length()-y.length());
//		x=x.substring(y.length());
		
		x=x+y;
		y=x.substring(0, x.length()-y.length());
		x=x.substring(y.length());
		
		System.out.println("x = "+ x);
		System.out.println("y = "+ y);
		
	}
}
