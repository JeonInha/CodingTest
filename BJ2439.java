import java.util.Scanner;

public class BJ2439 {
	public static void main(String args[]) {
		
		
		int x;
		int i;
		int j;
		int re;
		
		Scanner sc = new Scanner(System.in);
		x=sc.nextInt();
		
		for (i=1; i<x+1; i=i+1) {
			for (re=x; re>i; re=re-1) {
				System.out.print(" ");
		    }
			for (j=1; j<i+1; j=j+1) {
			System.out.print("*");
			}
			System.out.println();
		}
	}
}