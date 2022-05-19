import java.util.Scanner;

public class BJ1110 {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=a;
		a=(a/10+a%10+a%10*10);
		int n1=a/10;
		int n2=a%10;
		int i = 1;
		
		while (a!=b) {
			a=n2+n2*10+n1;
			n1=a/10;
			n2=a%10;
			i=i+1;
		}
		
		System.out.println(i); 
		
	}
}