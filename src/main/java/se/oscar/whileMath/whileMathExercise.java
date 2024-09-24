package se.oscar.whileMath;

import java.util.Scanner;

public class whileMathExercise {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sum = 0;
        int answer;
        do {
            System.out.println("Mata in ett tal");
            answer = scan.nextInt();
            sum += answer;
        } while (answer >= 0);
        System.out.println("Sum: " + sum);
    }
}
