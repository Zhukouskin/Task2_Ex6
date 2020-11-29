package Task2Ex6;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	System.out.println("Введите число от 1 до 999 :");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.print(a);
        int b = a % 100;
        int c = a % 10;
        if (b == 1 || c == 1) {
            System.out.println(" рубль.");
        }
        else if (b < 5 && b > 1 || c > 1 && c < 5) {
            System.out.println(" рубля.");
        }
        else if (b < 20 && b > 10 || c > 5 && c < 10) {
            System.out.println (" рублей.");
        }


    }



}
