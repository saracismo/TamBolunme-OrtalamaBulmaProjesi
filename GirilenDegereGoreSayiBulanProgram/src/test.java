import java.util.Scanner;

public class test {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        int sayi=scan.nextInt();
        int sayac=0;
        int toplam=0;

        for (int i = 1; i <sayi ; i++) {

            if (i%3==0 && i%4==0){
                toplam+=i;
                sayac++;

            }
        }
        System.out.println("Gırdıgınız sayiya kadar 3 ve 4'e tam bolunen sayilarin toplami : "+toplam);

        if (sayac == 0) {
            System.out.println("Gırdıgınız sayiya kadar 3 ve 4'e tam bolunen bir sayi yok.");
        } else {
            double ortalama = (double) toplam / sayac;
            System.out.println("Gırdıgınız sayiya kadar 3 ve 4'e tam bolunen sayiların ortalamasi: " + ortalama);
        }


    }
}