package stream.quiz;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Quiz4 {
	public static void main(String[] args) {
		List<Customer> list = new ArrayList<>();
		list.add(new Customer("둘리", 40, 100));
		list.add(new Customer("또치", 13, 50));
		list.add(new Customer("도우너", 25, 70));
		
		System.out.println("1");
		list.stream().map(o -> o.name).forEach(s -> System.out.print(s + " "));
		IntStream sum = list.stream().mapToInt(c -> c.price);
		System.out.println();
		System.out.println(sum.sum());
		list.stream().filter(n -> n.age >= 20).forEach(s -> System.out.print(s.name + " "));
		System.out.println();

		System.out.println("2");
//		IntStream sum1 = list.stream().filter(n -> n.age == 2022).mapToInt(o -> o.price);
//		System.out.print("총 금액: " + sum.sum());
//		System.out.println(", 거래건수: " + list.stream().filter(n -> n.age == 2022).count());
//		System.out.println("3");
//		IntStream sum2 = list.stream().filter(n -> n.age == 2023).mapToInt(o -> o.price);
//		System.out.print("총 금액: " + sum1.sum());
//		System.out.println(", 거래건수: " + list.stream().filter(n -> n.age == 2023).count());
	}
}

class Customer {
	String name;
	int age;
	int price;
	
	public Customer(String name, int age, int price) {
		this.name = name;
		this.age = age;
		this.price = price;
	}
}