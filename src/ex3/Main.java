package ex3;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        String stringToCheck ;
        while (true){
            System.out.println("enter a string to start, :q to quit");
            stringToCheck = scanner.nextLine();
            if (stringToCheck.equals(":q")){
                break;
            }
            String[] result = stringToCheck.split("");
            System.out.println(Arrays.toString(result));
        }

    }

}
