import java.util.Scanner;

public class BJ10951 {
public static void main(String [] args) {
	
	int a, b;
	
	Scanner sc=new Scanner(System.in);
	
	a=sc.nextInt();
	b=sc.nextInt();
	
	while (sc.hasNext()) {
	
		System.out.println(a+b);
		a=sc.nextInt();
	    b=sc.nextInt();
  }
}
}
