import java.util.Scanner;

public class BJ1110 {
	public static void main(String[] args) {

		int a, n1, n10, plus, b, i;
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		
		b=a;
		n1=a%10;
		n10=a/10;
		plus=n1+n10;
		a=n1*10+plus%10;
		i=1;
		
		
		while (a!=b) {
		 n1=a%10;
		 n10=a/10;
		 plus=n1+n10;
		 a=n1*10+plus%10;
		 ++i; 
		}
		
		System.out.print(i);
		
		
	}
}