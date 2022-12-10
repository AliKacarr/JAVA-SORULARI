import java.util.Scanner;

//Bir sayının asal çarpanlarını ekrana bir kez yazdıran kod.
public class Soru1 {
public static void main(String[]args) {
	Scanner giriScanner=new Scanner(System.in);
	System.out.print("Asal çarpanları bulunacak sayıyı giriniz=");
	int n=giriScanner.nextInt();
	int i=1;
	do {
		do{
		i++;	
			
		}while(n%i!=0);
   do {
	   n=n/i;
   }while(n%i==0);
	   System.out.print(i+" ");
	}while(n!=1);
	
}
}
