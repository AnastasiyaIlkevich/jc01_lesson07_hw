package com.sirin.home_work.lesson7;

import java.util.Arrays;
import java.util.Random;

public class Task01 {

	public static void main(String[] args) {

		/*
		 * Циклический сдвиг элементов массива Дан одномерный целочисленный массив A
		 * длиной N и число K. Реализуйте алгоритм циклического сдвига элементов массива
		 * на K позиций вправо. Элементы, выходящие за пределы массива, должны
		 * перемещаться в начало.
		 */

		int[] array;
		int lenght;
		int k;

		Random random = new Random();
		lenght = random.nextInt(100);
		array = new int[lenght];

		k = random.nextInt(lenght + 3 - 2);
		for (int i = 0; i < array.length; i++) {
			array[i] = random.nextInt(100);
		}

		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();

		System.out.println(k);

		int[] arrayTempSecond = new int[k];
		System.arraycopy(array, 0, arrayTempSecond, 0, k);
		//для проверки
//		for (int i = 0; i < arrayTempSecond.length; i++) {
//			System.out.print(arrayTempSecond[i] + " ");
//		}
//		System.out.println();

		int[] arrayTempFirst = new int[array.length - k];
		System.arraycopy(array, k, arrayTempFirst, 0, array.length - k);
		//для проверки
//		for (int i = 0; i < arrayTempFirst.length; i++) {
//			System.out.print(arrayTempFirst[i] + " ");
//		}
//		System.out.println();

		System.arraycopy(arrayTempFirst, 0, array, 0, arrayTempFirst.length);
		System.arraycopy(arrayTempSecond, 0, array, arrayTempFirst.length, arrayTempSecond.length);

		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}

	}

}
