package Hung.dev;
import java.util.Scanner;
public class Cau2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 1 ;
		float tong = 0 ;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap so n");
		n = scanner.nextInt();
		for (int i = 1; i <= n; i++) {
            tong += (float) 1/i;
        }
		System.out.println("Tong la: " + tong );
	}
	  
	

}
