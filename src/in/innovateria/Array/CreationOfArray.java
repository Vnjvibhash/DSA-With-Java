package in.innovateria.Array;

import java.util.Scanner;

public class CreationOfArray {

	public static void input(int arr[], int size) {
		Scanner sc = new Scanner(System.in);
		for (int j = 0; j < size; ++j) {
			System.out.println("Enter the " + (j + 1) + "th element:");
			arr[j] = sc.nextInt();
		}
		sc.close();
	}

	public static void output(int arr[], int size) {
		System.out.println("Final Array is:");
		for (int j = 0; j < size; ++j) {
			System.out.print(arr[j] + " ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[100];
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter the Size of Array: ");
		int size = sc.nextInt();
		input(arr, size);

		output(arr, size);
		sc.close();

	}

}
