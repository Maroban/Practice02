package com.javaex.practice;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("키와 몸무게를 입력해주세요.");
		System.out.print("키: ");
		int tall = sc.nextInt();
		System.out.print("몸무게: ");
		int wei = sc.nextInt();

		double swei = (tall - 100) * 0.9;

		if (swei == wei) {
			System.out.println("표준 입니다.");
			System.out.println("표준체중: " + swei);
		} else if (swei < wei) {
			System.out.println("과체중 입니다.");
			System.out.println("표준체중: " + swei);
		} else {
			System.out.println("저체중 입니다.");
			System.out.println("표준체중: " + swei);
		}

		sc.close();

	}

}
