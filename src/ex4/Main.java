package ex4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a number to start the countdown");
        int countdown =Integer.parseInt(scanner.nextLine());
        for (int i = countdown; i > 0 ; i--) {
            System.out.println(i);
        }
    }
}
