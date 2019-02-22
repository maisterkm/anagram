package ua.com.foxminded;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Anagram anagram = new Anagram();
        System.out.println("Enter the string: ");
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        System.out.println(inputString + " => " + anagram.makeAnagram(inputString));
    }

}
