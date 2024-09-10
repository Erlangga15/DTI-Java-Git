package com.erlangga.day6;

import java.util.Arrays;
import java.util.Scanner;
public class RotateArray {
		private final Scanner scanner;

		public RotateArray(Scanner scanner) {
				this.scanner = scanner;
		}

		public int[] inputArray() {
				System.out.print("Enter the size of the array: ");
				int size = scanner.nextInt();
				int[] array = new int[size];
				System.out.println("Enter the elements of the array:");
				for (int i = 0; i < size; i++) {
					array[i] = scanner.nextInt();
				}
				return array;
		}

		public int inputRotation() {
			System.out.print("Enter the number of rotation: ");
			int rotation = scanner.nextInt();
			return rotation;
		}

		public int[] Rotate() {	
				int[] array = inputArray();
				int rotation = inputRotation();

				int[] result = new int[array.length];
				for (int i = 0; i < array.length; i++) {
					result[(i + array.length - rotation) % array.length] = array[i];
				}
				return result;
		}

		public void printRotateArray() {
				System.out.println("The array after rotation: " + Arrays.toString(Rotate()));
		}
}
