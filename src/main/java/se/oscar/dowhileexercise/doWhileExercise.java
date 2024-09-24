package se.oscar.dowhileexercise;

import java.util.Scanner;

public class doWhileExercise {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String response;
        do {
            System.out.println("Vill du fortsätta? (ja/nej)");
            response = scan.next();
        } while (response.equals("ja"));
        System.out.println("Avslutad");
    }
}
