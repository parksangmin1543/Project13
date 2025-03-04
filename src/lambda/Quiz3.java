package lambda;

public class Quiz3 {

	public static void main(String[] args) {
		StringConverter num = new StringConverterImpl();
		
		StringConverter num3 = new StringConverter() {
			public String convert(String str) {
				return str.toUpperCase();
			}
		};		
		StringConverter num2 = (str)-> str.toUpperCase();
		
		System.out.println(num.convert("Hello, World!"));
		System.out.println(num2.convert("Hello, World!"));
		System.out.println(num3.convert("Hello, World!"));
	}
}


interface StringConverter {
	String convert(String str);
}

class StringConverterImpl implements StringConverter {

	@Override
	public String convert(String str) {
		return str.toUpperCase();
	}
	
}