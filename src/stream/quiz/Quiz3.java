package stream.quiz;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
//패키지 여행을 떠나는 고객 정보를 저장하는 Customer 클래스를 만드세요
//속성: 이름,나이,여행비용
//
//여행 고객 리스트를 만들고, 고객을 추가하세요.
//(둘리, 40(세), 여행비용 100(만원)), (또치, 13(세), 여행비용 50(만원)), (도우너, 25(세), 여행비용 70(만원))
//
//고객 리스트를 사용하여 다음과 같은 정보를 출력하세요.
//- 고객의 명단
//- 여행의 총 비용
//- 20세 이상의 고객을 찾아서 이름을 출력
//
//== 고객 명단 ==
//둘리
//또치
//도우너
//총 여행 비용 :220
//== 20세 이상 고객 명단 ==
//도우너
//둘리
public class Quiz3 {
	public static void main(String[] args) {
		List<Order> list = new ArrayList<>();
		list.add(new Order(1001, 2022, 300));
		list.add(new Order(1002, 2022, 150));
		list.add(new Order(1003, 2022, 200));
		list.add(new Order(1004, 2023, 500));
		list.add(new Order(1005, 2023, 400));
		list.add(new Order(1006, 2023, 600));
		list.add(new Order(1007, 2023, 650));
		
		System.out.println("1");
		list.stream().map(o -> o.orderNo).forEach(s -> System.out.print(s + " "));
		System.out.println();

		System.out.println("2");
		IntStream sum = list.stream().filter(n -> n.year == 2022).mapToInt(o -> o.price);
		System.out.print("총 금액: " + sum.sum());
		System.out.println(", 거래건수: " + list.stream().filter(n -> n.year == 2022).count());
		System.out.println("3");
		IntStream sum1 = list.stream().filter(n -> n.year == 2023).mapToInt(o -> o.price);
		System.out.print("총 금액: " + sum1.sum());
		System.out.println(", 거래건수: " + list.stream().filter(n -> n.year == 2023).count());
	}
}

class Order {
	int orderNo;
	int year;
	int price;
	
	public Order(int orderNo, int year, int price) {
		this.orderNo = orderNo;
		this.year = year;
		this.price = price;
	}
}
