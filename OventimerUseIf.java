import java.util.Scanner;

public class OventimerUseIf {
	public static void main(String[] args) {
				
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int M = sc.nextInt();
		int RT = sc.nextInt();

		if ((M+(RT%60))>=60) {
			if ((H+RT/60+1)>23) {
				System.out.printf("%d %d", H+RT/60-23, M+RT%60-60);
			} else {
				System.out.printf("%d %d", H+RT/60+1, M+RT%60-60);
			}
		} else {
			if ((H+(RT/60))>23) {
				System.out.printf("%d %d", H+RT/60-24, M+RT%60);
			}else {
				System.out.printf("%d %d", H+RT/60, M+RT%60);
			}
		}

	}
}
