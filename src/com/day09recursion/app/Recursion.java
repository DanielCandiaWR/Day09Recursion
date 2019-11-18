package com.day09recursion.app;
import java.util.Scanner;
/*
 * HackerRank 30 Days of Code
 * ========== Day 09 Recursion ===========
 * Write a factorial function that takes a positive integer, N as a parameter and prints the result of N! (N factorial).
 */
public class Recursion {

	static int factorial(int n) {
        int factorial = 1;
        for(int i=n;i>0;i--){
            factorial *= i;
        }
        return factorial;
	}
	private static final Scanner scanner = new Scanner(System.in);
	public static void main(String[] args){
	        int n = scanner.nextInt();
	        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

	        int result = factorial(n);
	        System.out.println(result);
	        scanner.close();
	}
}
