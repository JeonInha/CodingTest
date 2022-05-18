import java.util.Scanner;

public class BJ10871 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int a;
		//입력받은 정수
		int i;
		//반복문용
		int N = in.nextInt();
		//정수 갯수
		int x = in.nextInt();
		//값의 크기
		
		for (i=0; i<N; i=i+1) {
		  a = in.nextInt();
		  if (a<x) {
		  System.out.print(a+" ");
		  } 
		}
	}
}