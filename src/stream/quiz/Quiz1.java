package stream.quiz;

import java.util.Arrays;
import java.util.stream.Stream;

public class Quiz1 {
	public static void main(String[] args) {
		String[] arr = {"file1.txt","file2.pdf", "file3.txt", "file4.img", "file5.txt", "file6.img"};

		Stream<String> stream = Arrays.stream(arr);
		Stream<String> stream1 = Arrays.stream(arr);
		Stream<String> stream2 = Arrays.stream(arr);
		Stream<String> stream3 = Arrays.stream(arr);
		Stream<String> stream4 = Arrays.stream(arr);
		
		System.out.println("1");
//		System.out.println(stream.filter(n -> n.contains(".txt")).toList());
		System.out.println(stream.filter(n -> n.endsWith(".txt")).toList());
//		stream.filter(n -> n.contains(".txt")).forEach(n -> System.out.print(n + " "));

		System.out.println();
		System.out.println("2");
		System.out.println(stream1.filter(n -> n.contains(".txt")).count());
		System.out.println(stream2.filter(n -> n.contains(".pdf")).count());
		System.out.println(stream3.filter(n -> n.contains(".img")).count());
		
		System.out.println("3");
//		System.out.println(stream4.map(n -> n.substring(6)).distinct().toList());
//		stream4.map(n -> n.substring(6)).distinct().forEach(n -> System.out.print(n + " "));
		stream4.map(n -> {
			String[] str = n.split("\\.");
			return str[1];
		}).distinct().forEach(n -> System.out.print(n + " "));
	}
}
