package com.javaex.practice;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("숫자 3개를 입력해주세요.");
		System.out.print("숫자1: ");
		int num01 = sc.nextInt();
		System.out.print("숫자2: ");
		int num02 = sc.nextInt();
		System.out.print("숫자3: ");
		int num03 = sc.nextInt();

		if (num01 < num02 && num01 < num03) {
			System.out.println("가장 작은 수는 " + num01 + " 입니다.");
		} else if (num02 < num01 && num02 < num03) {
			System.out.println("가장 작은 수는 " + num02 + " 입니다.");
		} else {
			System.out.println("가장 작은 수는 " + num03 + " 입니다.");
		}

		sc.close();

	}

}
