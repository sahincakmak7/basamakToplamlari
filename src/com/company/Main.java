package com.company;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number;
        int result = 0;
        int digit ;
        System.out.print("Sayı giriniz :");
        Scanner input = new Scanner(System.in);
        number = input.nextInt();


        while (number != 0) {
            digit = number % 10;
            number /=  10;
            result += digit;
            System.out.println(digit);


        }
        System.out.println("Basamak toplamları: " + result);
    }
}