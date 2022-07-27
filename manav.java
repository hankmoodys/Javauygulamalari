import java.util.Scanner;

public class manav {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double armut =2.14 , elma = 3.67, domates = 1.11, muz = 0.95, patlican = 5, total;
        int armutKilo, elmaKilo, domatesKilo, muzKilo, patlicanKilo;

        System.out.print("Armut Kaç Kilo : ");
        armutKilo = scanner.nextInt();

        System.out.print("Elma Kaç Kilo : ");
        elmaKilo = scanner.nextInt();

        System.out.print("Domates Kaç Kilo : ");
        domatesKilo = scanner.nextInt();

        System.out.print("Muz Kaç Kilo : ");
        muzKilo = scanner.nextInt();

        System.out.print("Patlıcan Kaç Kilo : ");
        patlicanKilo = scanner.nextInt();

        total = armut * armutKilo + elma * elmaKilo + domates * domatesKilo + muz * muzKilo + patlican * patlicanKilo;

        System.out.println("Toplam Tutar : " + total + " TL");
    }
}