import java.util.Scanner;

public class BJ2588 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        String b = sc.next();
        char n100 = b.charAt(0);
        char n10 = b.charAt(1);
        char n1 =  b.charAt(2);
        
        int i1=Character.getNumericValue(n1);
        int i10=Character.getNumericValue(n10);
        int i100=Character.getNumericValue(n100);
        
        

       System.out.println(a * i1);
        System.out.println(a * i10);
        System.out.println(a * i100);
        System.out.println(a * i1 + a * i10 * 10 + a * i100 * 100);

    }
}
