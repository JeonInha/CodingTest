//첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제
import java.util.Scanner;

public class bj2438 {
	public static void main(String args[]) {
		
		
		int x;
		int i;
		int j;
		
		Scanner sc = new Scanner(System.in);
		x=sc.nextInt();
		
		for (i=1; i<x+1; i=i+1) {
			for (j=1; j<i+1; j=j+1) {
				System.out.print("*");
		    }
			System.out.println();
		}
	}
}
		