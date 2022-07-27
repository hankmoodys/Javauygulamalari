import java.util.Scanner;

public class hesaplama {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        double boy, vucutKitleIndeksi;
        int kilo;

        System.out.print("Lütfen Boyunuzu (metre cinsinde) giriniz : ");
        boy = scanner.nextDouble();
        System.out.print("Lütfen Kilonuzu Giriniz : ");
        kilo = scanner.nextInt();

        vucutKitleIndeksi = kilo / (boy * boy);

        System.out.println("Vücut Kitle İndeksiniz : " + vucutKitleIndeksi);

    }
}