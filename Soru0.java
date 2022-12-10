import java.util.Scanner;

//ax²+bx+c şeklinde ikinci dereceden bir denklemin köklerini nasıl bulabiliriz?
public class Soru0 {
	public static void main(String[]args) {
		Scanner giris=new Scanner(System.in);
		double a,b,c,delta;
		System.out.print("a=");
		a=giris.nextInt();
		System.out.print("b=");
		b=giris.nextInt();
        System.out.print("c=");
        c=giris.nextInt();
        delta=(b*b)-4*a*c;
        if(delta<0) {
        	System.out.println("Kök yok");
        }
        	else if(delta==0) {
        		System.out.println("x1 ve x2="+(-b/(2*a)));
        	}
        	else {
        		System.out.println("x1="+(-b+Math.sqrt(delta))/(2*a));
        		System.out.println("x2="+(-b+Math.sqrt(delta))/(2*a));
        	}
        
		
	}
}
