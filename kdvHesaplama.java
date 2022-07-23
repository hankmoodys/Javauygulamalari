import java.util.Scanner;

public class kdvHesaplama {
    public static void main(String[] args) {
        double tutar, kdvOran=0.18, kdvTutar, kdvliTutar;

        Scanner input = new Scanner(System.in);
        System.out.print("ücret tutarını giriniz");
        tutar=input.nextDouble();

        kdvTutar=tutar * kdvOran;
        kdvliTutar= tutar + kdvTutar;

        System.out.println("Kdv'siz Tutar : " + tutar);
        System.out.println("Kdv Oranı:" + tutar);
        System.out.print("Kdv Tutarı:" + kdvTutar);
        System.out.println("Kdv'li Tutar:" +kdvliTutar );


    }
}

