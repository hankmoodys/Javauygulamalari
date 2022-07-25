import java.util.Scanner;

public class sinifiGecme {
    public static void main(String[] args) {
        int mat,fizik,turkce,kimya,muzik;
        Scanner input = new Scanner(System.in);

        System.out.print("Matematik notunuz :");
        mat= input.nextInt();

        System.out.print("Türkçe notunuz : ");
        turkce=input.nextInt();

        System.out.print("fizik notunuz :");
        fizik=input.nextInt();

        System.out.print("Kimya notunuz : ");
        kimya=input.nextInt();

        System.out.print("Müzik Notunuz :");
        muzik=input.nextInt();

        double avarage = (mat +fizik + turkce + kimya + muzik ) /5;

        if (avarage <= 55) {
            System.out.println("Sınıfta kaldınız");


        } else {
            System.out.println("Sınıfı Geçtiniz Tebrikler ! ");

        }
        System.out.println("Ortalamanız :" + avarage);



    }
}
