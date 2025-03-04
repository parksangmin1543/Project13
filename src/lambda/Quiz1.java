package lambda;

public class Quiz1 {

	public static void main(String[] args) {
		Hello num1 = new HelloImpl();
		
		Hello num2 = new Hello() {
			public void helloPrint() {
				System.out.println("안녕하세요! 익명");
			}
		};		
		Hello num3 = ()-> 
		System.out.println("안녕하세요! 람다식");
		
		num1.helloPrint();
		num2.helloPrint();
		num3.helloPrint();
	}
}


interface Hello {
	void helloPrint();
}

class HelloImpl implements Hello {

	@Override
	public void helloPrint() {
		System.out.println("안녕하세요! 구현 -> 인스턴스");
	}
	
}