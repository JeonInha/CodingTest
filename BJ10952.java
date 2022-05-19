import java.util.Scanner;

public class BJ10952 {
public static void main(String [] args) {
	
	int a, b, i;
	
	Scanner sc=new Scanner(System.in);
	
	a=sc.nextInt();
	b=sc.nextInt();
	
	while (true) {
	
	if (a!=0||b!=0) {
		System.out.println(a+b);
		a=sc.nextInt();
	    b=sc.nextInt();
	} else {
		return;
	}
	}
}
}


		