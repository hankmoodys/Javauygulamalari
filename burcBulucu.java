import java.util.Scanner;

public class burcBulucu {
    public static void main(String[] args) {
        int day, month;
        String burc = "";
        boolean isError = false;
        Scanner input = new Scanner(System.in);

        System.out.print("Lutfen Dogdugunuz Gunu Rakamlar Ile Yaziniz : ");
        day = input.nextInt();
        System.out.print("Lutfen Dogdugunuz Ay'i Rakam Ile Giriniz : ");
        month = input.nextInt();
        if (month == 1) {
            if (day >= 1 && day < 32) {
                if (day < 22) {
                    burc = "Oglak";
                } else {
                    burc = "Kova";

                }
            } else {
                isError = true;
            }


        } else if (month == 2) {

            if (day >= 1 && day < 29) {
                if (day < 20) {
                    burc = "Kova";
                } else {
                    burc = "Balik";
                }
            } else {
                isError = true;
            }
        } else if (month == 3) {
            if (day > 0 && day < 32) {
                if (day < 21) {
                    burc = "Balik";
                } else {
                    burc = "Koc";
                }
            } else {
                isError = true;
            }
        } else if (month == 4) {
            if (day >= 1 && day <= 30) {
                if (day <= 20) {
                    burc = "Koc";
                } else {
                    burc = "Boga";
                }
            } else {
                isError = true;
            }
        } else if (month == 5) {
            if (day >= 1 && day <= 31) {
                if (day <= 21) {
                    burc = "Boga";
                } else {
                    burc = "Ikizler";
                }
            } else {
                isError = true;
            }
        } else if (month == 6) {
            if (day >= 1 && day <= 30) {
                if (day < 23) {
                    burc = "Ikizler";
                } else {
                    burc = "Yengec";
                }
            } else {
                isError = true;
            }
        } else if (month == 7) {
            if (day >= 1 && day <= 31) {
                if (day < 23) {
                    burc = "Yengec";
                } else {
                    burc = "Aslan";
                }
            } else {
                isError = true;
            }
        } else if (month == 8) {
            if (day >= 1 && day <= 31) {
                if (day < 23) {
                    burc = "Aslan";
                } else {
                    burc = "Basak";
                }
            } else {
                isError = true;
            }

        } else if (month == 9) {
            if (day >= 1 && day <= 30) {
                if (day <= 22) {
                    burc = "Basak";
                } else {
                    burc = "Terazi";
                }
            } else {
                isError = true;
            }

        } else if (month == 10) {
            if (day >= 1 && day <= 31) {
                if (day <= 22) {
                    burc = "Terazi";
                } else {
                    burc = "Akrep";
                }
            } else {
                isError = true;
            }

        } else if (month == 11) {
            if (day >= 1 && day <= 30) {
                if (day <= 21) {
                    burc = "Akrep";
                } else {
                    burc = "Yay";
                }
            } else {
                isError = true;
            }

        } else if (month == 12) {
            if (day >= 1 && day <= 31) {
                if (day <= 21) {
                    burc = "Yay";
                } else {
                    burc = "Oglak";
                }
            } else {
                isError = true;
            }

        }
        if (isError) {
            System.out.print("Hatali Veri Girdiniz, Tekrar Deneyiniz. ");
        } else {
            System.out.print("Girdiginiz Verilere Gore Burcunuz : " + burc);
        }


    }
}