package com.sirin.home_work.lesson7;

public class Task02 {

	public static void main(String[] args) {
		/*
		 * 2. Проверка массива на палиндром Дан массив символов A длиной N. Определите,
		 * является ли этот массив палиндромом (читается одинаково слева направо и
		 * справа налево).
		 */

		// надеюсь имелись введу char
		char[] arrayFirst = { 'a', 'b', 'c', 'b', 'a' };
		char[] arraySecond = { 'r', 'a', '6', '6', 'a', 'r' };

		printRezualt(isPalindrome(arrayFirst));
		printRezualt(isPalindrome(arraySecond));

	}

	public static void printRezualt(boolean a) {
		if (a) {
			System.out.println("Массив является палиндромом.");
		} else {
			System.out.println("Массив не является палиндромом.");
		}
	}

	public static boolean isPalindrome(char[] arr) {
		int leftChar = 0;
		int rightChar = arr.length - 1;

		while (leftChar < rightChar) {
			if (arr[leftChar] != arr[rightChar]) {
				return false;
			}
			leftChar++;
			rightChar--;
		}
		return true;
	}
}
