import java.util.Scanner;

public class üslüsayiHesaplama {
    public static void main(String[] args) {
        int taban,us;
        int total=1;
        Scanner input=new Scanner(System.in);
        System.out.println("Ussu alinacak sayi:");
        taban=input.nextInt();
        System.out.println("Us olacak sayi:");
        us=input.nextInt();

        for(int i=1;i<=us;i++){
            total*=taban;
        }
        System.out.println("Sonuc:"+total);
    }
}