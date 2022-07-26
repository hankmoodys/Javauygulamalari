import java.util.Scanner;

public class ucakBileti {
    public static void main(String[] args) {

        // Değişkenleri tanımla
        double biletFiyati = 0.0, mesafe, mesafeBasiUcret=0.10;
        int yas, yolculukTipi;
        boolean isHata=false;

        // Değişken Değerleri al
        Scanner sc = new Scanner(System.in);

        System.out.print("Mesafeyi Giriniz (Km) : ");
        mesafe = sc.nextDouble();

        System.out.print("Yaşınızı giriniz : ");
        yas = sc.nextInt();

        System.out.print("Yolculuk Tipini Giriniz (Tek Yön için: 1, Gidiş Dönüş için: 2): ");
        yolculukTipi = sc.nextInt();

        biletFiyati=mesafe*mesafeBasiUcret;

        // yolculuk tipine göre tutar hesapla
        switch (yolculukTipi){
            case 1:
                biletFiyati= biletFiyati;
                break;
            case 2:
                // Gidiş-Dönüş iki bilet olacağı için 2 ile çarpıldı ve %20 ((1-0.2)= 0.8) uygulandı.
                biletFiyati*=2*0.8;
                break;
            default:
                isHata=true;
        }

        if (!isHata){
            if (0<yas && yas<12){
                biletFiyati*=0.5;
                System.out.println("Bilet Fiyatınız: " + biletFiyati+" TL");
            } else if (12<=yas && yas<24) {
                biletFiyati*=0.9;
                System.out.println("Bilet Fiyatınız: " + biletFiyati+" TL");
            } else if (24<=yas && yas<65) {
                biletFiyati=biletFiyati;
                System.out.println("Bilet Fiyatınız: " + biletFiyati+" TL");
            }else if (yas>65) {
                biletFiyati*=0.7;
                System.out.println("Bilet Fiyatınız: " + biletFiyati+" TL");
            }else {
                System.out.println("Hatalı Veri Girdiniz");
            }
        }else {
            System.out.println("Hatalı Yolculuk Tipi Girdiniz. Lütfen 1 veya 2 Giriniz");
        }

    }
}
