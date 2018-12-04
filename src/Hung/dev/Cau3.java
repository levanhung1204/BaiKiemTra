package Hung.dev;

import java.util.Scanner;

public class Cau3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap size cua mang " );
		int size = scanner.nextInt();
		int arr[] = new int[size];
		
		NhapMang(arr);
		InMang(arr);
		MaxMang(arr);
	}
	private static void NhapMang(int[] arr) {
		Scanner scanner = new Scanner(System.in);
		for(int i=0 ; i < arr.length; i++) {
		  System.out.println("arr[" + i +"]=");
		  arr[i] = scanner.nextInt();
		}
	}
	private static void InMang(int[] arr) {
		Scanner scanner = new Scanner(System.in);
		for(int i=0 ; i < arr.length; i++) {
			System.out.println("arr[" + i +"]=" + arr[i]);
        }
	}
	private static void MaxMang(int[] arr) {
		int max = arr[0];
		for(int i=0 ; i < arr.length ; i++) {
	    	if (arr[i]> max) {
				max = arr[i];
			}
    	}
		System.out.println("Phan tu lon nhat la : " + max);
	}
}


	

