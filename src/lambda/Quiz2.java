package lambda;

public class Quiz2 {

	public static void main(String[] args) {
		MyNumber num = new MyNumberImpl();
		
		MyNumber num3 = new MyNumber() {
			public int max(int x, int y) {
				return ((x > y) ? x : y);
			}
		};		
		MyNumber num2 = (x, y)-> 
		((x > y) ? x : y);
		
		System.out.println(num.max(5, 10));
		System.out.println(num2.max(10,5));
		System.out.println(num3.max(120,51));
	}
}


interface MyNumber {
	int max(int x, int y);
}

class MyNumberImpl implements MyNumber {

	@Override
	public int max(int x, int y) {
		return (x > y) ? x : y;
	}
	
}