import java.util.*;

public class BJ2444 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("======별 찍기 7=======");
		System.out.print("원하는 줄 수를 입력: ");
		int x=sc.nextInt();
		
		for (int i=1; i<=x; i++) {
			for (int j=x; j>i; j--) {
			System.out.print(" ");
			}

			for (int j=1; j<=i*2-1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
			
		for (int i=1; i<=x-1; i++) {
			for (int j=1; j<=i; j++) {
				System.out.print(" ");
			}

			for (int j=(x-1)*2-1; j>=i*2-1; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
			
		
	}
}