import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
            int sayi;
            int adet =0;
            int total =0;

            Scanner inp = new Scanner(System.in);

            System.out.print("Lütfen bir tam sayı giriniz: ");
            sayi = inp.nextInt();

            for (int x = 1; x <sayi ; x++) {

                if (x % 3 == 0 && x % 4 == 0){
                    total=x;
                    adet++;

            }
        }
                    System.out.println("Sayı Toplamınız: " +total);

                    if (adet == 0) {
                    System.out.println("3 ve 4'e tam bölünen bir sayı yok.");
                    } else {
                    double ortalama = (double) total / adet;
                    System.out.println("SayIların ortalamasi: " + ortalama);
        }


    }
}