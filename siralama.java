import java.util.Scanner;

public class siralama {
    public static void main(String[] args) {
        int a, b, c;
        Scanner input = new Scanner(System.in);
        System.out.println("First Number : ");
        a = input.nextInt();

        System.out.println("Second Number : ");
        b = input.nextInt();


        System.out.println("Third Number : ");
        c = input.nextInt();

        if ((a < b && a < c)) {
            if (b < c) {
                System.out.println("In order from smallest to largest : " + a + ", " + b + ", " + c + ".");
            } else {
                System.out.println("In order from smallest to largest : " + a + ", " + c + ", " + b + ".");
            }
        } else if ((b < a && b < c)) {
            if (a < c) {
                System.out.println("In order from smallest to largest : " + b + ", " + a + ", " + c + ".");
            } else {
                System.out.println("In order from smallest to largest : " + b + ", " + c + ", " + a + ".");
            }
        } else {
            if (a < b) {
                System.out.println("In order from smallest to largest : " + c + ", " + a + ", " + b + ".");
            } else {
                System.out.println("In order from smallest to largest : " + c + ", " + b + ", " + a + ".");
            }


        }

    }
}
