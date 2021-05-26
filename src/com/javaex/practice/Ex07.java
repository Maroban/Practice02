package com.javaex.practice;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("첫 번째 숫자: ");
		int num01 = sc.nextInt();
		System.out.print("두 번째 숫자: ");
		int num02 = sc.nextInt();

		if (num01 > num02) {
			System.out.println("몫: " + (num01 / num02));
			System.out.println("나머지: " + (num01 % num02));
		} else {
			System.out.println("몫: " + (num02 / num01));
			System.out.println("나머지: " + (num02 % num01));
		}

		sc.close();

	}

}
