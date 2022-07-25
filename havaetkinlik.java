import java.util.Scanner;

public class havaetkinlik {
    public static void main(String[] args) {

        
        int heat;

        Scanner inp=new Scanner(System.in);
        System.out.println("Enter the temperature:");
        heat= inp.nextInt();

        if (heat<5){
            System.out.println("You can ski.");
        } else if (heat<=25) {
            if (heat>= 5 &&heat<=10){
                System.out.println("You can go to the cinema.");
            }
            if (heat>10&&heat<=15){
                System.out.println("You can do picnic or go to the cinema.");
            }
            if (heat>15){
                System.out.println("You can do picnic.");
            }
        }else {
            System.out.println("You can swim.");
        }
    }
}