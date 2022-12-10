//Dışardan girilen iki sayının EBOB VE EKOK unu nasıl hesaplarız?
import java.util.Scanner;
public class Soru3 {
public static void main(String[]args){
	Scanner giris=new Scanner(System.in);
	System.out.print("Birinci sayıyı giriniz=");
	int sayı1=giris.nextInt();
	System.out.print("İkinci sayıyı giriniz=");
	int sayı2=giris.nextInt();
	System.out.println(sayı1+" ve "+sayı2+" sayılarının EBOB u= "+Ebob(sayı1, sayı2));
	System.out.println(sayı1+"ve"+sayı2+" sayılarının EKOK u= "+Ekok(sayı1, sayı2));
	}
public static int Ebob(int a,int b) {
	int ebob=1;
	for(int i=1;i<=a && i<=b;++i)
	{
	if(a%i==0 && b%i==0)
		ebob=i;
	}
	return ebob;
}
public static int Ekok (int a,int b) {
	int ebob=1,ekok;
	for(int i=1; i<=a && i<=b; ++i)
	{
		if (a%i==0 && b%i==0)
			ebob=i;
	}
	ekok=(a*b)/ebob;
	return ekok;
	}
}