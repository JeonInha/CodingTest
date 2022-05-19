import java.util.Scanner;

public class BJ10824 {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
	    String a, b, c, d;
		a=sc.next();
		b=sc.next();
		c=sc.next();
		d=sc.next();
		
		String ab=a+b;
		String cd=c+d;
		
		System.out.println(Integer.parseInt(ab)+Integer.parseInt(cd));
	}
}
		
		
								