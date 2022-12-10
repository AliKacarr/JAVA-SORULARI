//Metindeki kelime sayısını bulma
import java.util.Scanner;

public class Soru7 {

    public static int kelime_Sayisi(String a){
    int kelimeSayısı=0;
    for (int i = 0; i <=a.length()-1; i++) {
        if(a.charAt(i)==' '){
            kelimeSayısı++;}
    }
    return kelimeSayısı+1;
}
    
    public static void main(String[] args) {
    Scanner giris=new Scanner(System.in);
    System.out.println("Bir metin giriniz");
    String metin=giris.nextLine();
    System.out.println("Girilen metin="+metin);
    System.out.println("Girilen metin toplam '"+ kelime_Sayisi(metin)+"' adet kelimeden oluşmaktadır.");
    
   
    }
    
}