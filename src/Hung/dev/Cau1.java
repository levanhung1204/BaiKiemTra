package Hung.dev;
import java.util.Scanner;
public class Cau1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a ;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap a");
		a = scanner.nextInt();
		int b ;
		System.out.println("Nhap b");
		b = scanner.nextInt();
		int tong = a + b;
		int hieu = a - b;
		int tich = a * b;
		int thuong = a / b;
		System.out.println("Tong hai so la: " + tong);
		System.out.println("Hieu hai so la: " + hieu);
		System.out.println("Tich hai so la: " + tich);
		System.out.println("Thuong hai so la: " + thuong);
		

	}

}
