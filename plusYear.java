import java.util.Scanner;
public class plusYear {

    public static void main(String[] args) {
        int year;
        Scanner inp = new Scanner(System.in);

        System.out.print("Yıl Giriniz :");
        year = inp.nextInt();

        if (year % 4 == 0 || year % 400 == 0) {
            System.out.println( year + "   Bir artık yıldır   ");
        }else {
            System.out.println(year + "  Bir artık yıl değildir  ");
        }
    }
}