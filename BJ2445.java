import java.util.Scanner;

public class BJ2445 {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		
		
		for (int i=1; i<=x; i++) {
			for (int j=1; j<=i; j++) {
				System.out.print("*");
			}
			for (int j=x*2; j>i*2; j--) {
				System.out.print(" ");
			}
			for (int j=1; j<=i; j++) {
			System.out.print("*");
			}
		System.out.println();
		}
		for (int i=1; i<x; i++) {
			for (int j=x; j>i; j--) {
				System.out.print("*");
			}
			for (int j=1; j<=i*2; j++) {
				System.out.print(" ");
			}
			for (int j=x; j>i; j--) {
				System.out.print("*");
			}
		System.out.println();
		}
		
	}
}