import java.util.Scanner;

public class test{
	public static void main(String...args){
		Scanner scanner = new Scanner(System.in);
		System.out.print("Type your age: ");
		int age = scanner.nextInt();
		if (age >= 21) {
			System.out.println("You are an adult");
		} else if (age >= 18) {
			System.out.println("You are almost an adult");
		} else {
			System.err.println("You are a child");
		}
		System.out.println();
		scanner.close();
	}
}
