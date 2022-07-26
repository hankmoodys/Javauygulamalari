import java.util.Scanner;

public class ciftSayi {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = keyboard.nextInt();
        keyboard.close();
        int total = 0, average;
        int i, counter = 0;
        for (i = 1; i < number; i++) {
            if((i % 3 == 0) && (i % 4 == 0)){
                total = total + i;
                counter++;
                System.out.print(i + " - ");
            }
        }
        average = total / counter;
        System.out.print("Average is : " + average + "\nThe i: " + i + "\nTotal: " + total + "\nCounter: " + counter);
    }
}