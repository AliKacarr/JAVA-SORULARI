import java.util.Scanner;

//Kullanıcının girdiği sayıların en büyüğünü bulma
public class Soru2 {
public static void main(String[]args) {
	Scanner giris=new Scanner(System.in);
	System.out.println("Kaç sayı gireceksiniz?");
	int enbüyük=0;
	int a=giris.nextInt();
	int dizi[]=new int[a];
	for(int i=0; i<a;i++) {
		System.out.print("Dizinin "+(i+1)+" elemanını giriniz=");
		dizi [i]=giris.nextInt();
		if (dizi[i]>enbüyük) {
			enbüyük= dizi[i];
		}
		
	}
	System.out.println("Dizinin en büyük elemanı="+enbüyük );
}
}
