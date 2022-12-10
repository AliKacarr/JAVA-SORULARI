
//1den n'e kadar olan sayıların toplamı
import java.util.Scanner;
public class Soru6 {

  public static void main(String[] args) {
      Scanner giris = new Scanner(System.in);
      System.out.print("Bir Sayı Girin:");

      int sayi = giris.nextInt();
      int toplam = 0;

      for(int i = 0; i < sayi; ++i)
      {
          toplam += i;
      }

      System.out.println("Sayıların Toplamı = " + toplam);
  } 
}