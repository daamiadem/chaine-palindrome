package com.example.palaindrome;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class PalaindromeApplication {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez une chaîne : ");
        String input = scanner.nextLine();
        if (isPalindrome(input)) {
            System.out.println(input + " est un palindrome.");
        } else {
            System.out.println(input + " n'est pas un palindrome.");
        }
        scanner.close();
    }

    public static boolean isPalindrome(String str) {
        str = str.toLowerCase();
        int start = 0;
        int end = str.length() - 1;
        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false; // pas un palindrome
            }
            start++;
            end--;
        }
        return true; // est un palindrome
    }
}
