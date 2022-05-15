import java.util.Scanner;

public class bj11021 {
	public static void main(String args[]) {
		
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int i;
		
		for(i=1; i<x+1; i=i+1) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			System.out.println("Case #"+ i+ ": "+ (a+b));
		}
				
	}
	
}