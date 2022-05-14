import java.util.Scanner;

public class AlarmAppUseIf {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int M = sc.nextInt();
		if (M>=45) {
			int NM = M-45;
			int NH = H;
			System.out.printf("%d %d", NH, NM);
		} else if (M<45&&H>0) {
			int NM = M+15;
			int NH = H-1;
			System.out.printf("%d %d", NH, NM);
		} else {
			int NM = M+15;
			int NH = H+23;
			System.out.printf("%d %d", NH, NM);
		}

	    
	}
}
