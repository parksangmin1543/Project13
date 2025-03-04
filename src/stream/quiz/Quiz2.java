package stream.quiz;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Quiz2 {
	public static void main(String[] args) {
		String[] arr = {"aaa","aaa", "b", "b", "cccc"};
		Stream<String> stream = Stream.of(arr);
		Stream<String> stream1 = Arrays.stream(arr);
		Stream<String> stream2 = Arrays.stream(arr);
		Stream<String> stream3 = Arrays.stream(arr);
		
		System.out.println("1");
		System.out.println(stream.filter(n -> n.length() > 2).count());

		System.out.println("2");
		IntStream intStream = stream1.mapToInt(n -> n.length());
		System.out.println(intStream.sum());
		
		System.out.println("3");
		IntStream intStream1 = stream2.mapToInt(n -> n.length());
		System.out.println(intStream1.min().getAsInt());
		
		System.out.println("4");
		System.out.println(stream3.distinct().collect(Collectors.toList()));
	}
}
