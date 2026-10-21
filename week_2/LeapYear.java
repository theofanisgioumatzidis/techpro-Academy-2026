package week_2;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Give the year: ");
        int theInput = scanner.nextInt();

        boolean isLeap = false;

        if ( (theInput%4) != 0) {
            isLeap = true;
            if ( (theInput%100) != 0) {
                isLeap = false;
                if ((theInput%400) != 0) {
                    isLeap = true;
                }
            }

        } 
        if (isLeap) {
            System.out.println("Its leap");
        } else {
            System.out.println("Its not leap");
        }

        scanner.close();
    }
    
}
