
//Hesap makinesi
import java.util.Scanner;
public class Soru9 {
	public static void main(String args[]) {
		Scanner giris=new Scanner(System.in);
     int sayı1,sayı2,işlem;
     System.out.print("Birinci sayıyı giriniz=");
     sayı1=giris.nextInt();
     System.out.print("toplama için 1 çıkarma için 2 çarpma için 3 bölme için 4 yazınız=");
     işlem=giris.nextInt();
     System.out.print("İkinci sayıyı giriniz=");
     sayı2=giris.nextInt();
  if(işlem==1) {
 	 System.out.println(sayı1+sayı2);
  }
  else if (işlem==2) {
		System.out.println(sayı1-sayı2);
	}
	else if(işlem==3) {
		System.out.println(sayı1*sayı2);
	}
	else if(işlem==4) {
	 System.out.println(sayı1/sayı2);
	}
	else {
		System.out.println("Tanımlanmamış işlem");
	}
	}
}
