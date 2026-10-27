import java.util.Scanner;

public class threeNumbers {

    public static void main(String[] args) {
        
        
        int a = 1;
        int b = 2;
        int c = 3;

        int max = a;

        if (max < b) {
            max = b;
        }

        if (max < c) {
            max = c;
        }

        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[3];
        System.out.print("Give the first number: ");
        numbers[0] = scanner.nextInt();
        System.out.print("Give the second number: ");
        numbers[1] = scanner.nextInt();
        System.out.print("Give the third number: ");
        numbers[2] = scanner.nextInt();
        
        int max_2 = numbers[0];
        for (int i=1; i<3; i++) {
            if (max_2 < )
        }

        System.out.println("The largest number is: " + max);

        scanner.close();
    }
}