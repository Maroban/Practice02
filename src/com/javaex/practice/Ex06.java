package com.javaex.practice;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("숫자 2개를 입력해주세요.");
		System.out.print("숫자1: ");
		int num01 = sc.nextInt();
		System.out.print("숫자2: ");
		int num02 = sc.nextInt();

		if (num01 > num02) {
			System.out.println("큰 수: " + num01 + "     작은 수: " + num02);
		} else {
			System.out.println("큰 수: " + num02 + "     작은 수: " + num01 + " 입니다.");
		}

		sc.close();

	}

}
