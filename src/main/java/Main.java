import java.util.Scanner;

public class Main {
    static int addition(int a, int b){
        int result = a + b;
        System.out.println("Toplama : " + result);
        return result;
    }

    static int subtraction(int a, int b){
        int result = a - b;
        System.out.println("Çıkarma : " + result);
        return result;
    }

    static int multiplication(int a, int b){
        int result = a * b;
        System.out.println("Çarpma : " + result);
        return result;
    }

    static int division(int a, int b){
        if (b == 0) {
            System.out.println("İkinci sayı 0'dan farklı olmalı!");
            return 0;
        }
        int result = a / b;
        System.out.println("Bölme : " + result);
        return result;
    }
    static int power(int a, int b){
        int result = 1;
        for (int i = 1; i <= b ; i++) {
            result  *= a;
        }
        return result;
    }
    static int factorial(int a){
        int total = 1;
        for (int i = 1; i < a ; i++) {
            total += total * i;
        }
        System.out.println("5! = " + total);
        return total;
    }
    static int mod(int a, int b){
        return a % b;
    }
    static void calculateRectangle(int a, int b){
        System.out.println("Çevresı : " + (2 * (a + b)));
        System.out.println("Alanı : " + (a * b));
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int select;

        String menu =
                "1- Toplama İşlemi\n"
                        + "2- Çıkarma İşlemi\n"
                        + "3- Çarpma İşlemi\n"
                        + "4- Bölme işlemi\n"
                        + "5- Üslü Sayı Hesaplama\n"
                        + "6- Faktoriyel Hesaplama\n"
                        + "7- Mod Alma\n"
                        + "8- Dikdörtgen Alan ve Çevre Hesabı\n"
                        + "0- Çıkış yap\n";

        boolean run = true;
        while (run) {
            System.out.println(menu);
            System.out.print("Bir işlem seçiniz : ");

            if (input.hasNextInt()) {
                select = input.nextInt();
            } else {
                System.out.println("Geçersiz bir seçim yaptınız. Lütfen tekrar deneyin.");
                input.next(); // Hatalı girişi temizle
                continue;
            }

            int a = 0, b = 0;

            if (select == 0) {
                run = false;
                break;
            } else if (select == 6) {
                System.out.print("Faktoriyel sayısı : ");
                a = input.nextInt();
            } else {
                System.out.print("İlk sayı : ");
                a = input.nextInt();
                System.out.print("İkinci sayı : ");
                b = input.nextInt();
            }

            switch (select) {
                case 1:
                    addition(a, b);
                    break;
                case 2:
                    subtraction(a, b);
                    break;
                case 3:
                    multiplication(a, b);
                    break;
                case 4:
                    division(a, b);
                    break;
                case 5:
                    System.out.println("Üs Hesabı = " + power(a, b));
                    break;
                case 6:
                    factorial(a);
                    break;
                case 7:
                    System.out.println("Mod İşlemi = " + mod(a, b));
                    break;
                case 8:
                    calculateRectangle(a,b);
                    break;
                default:
                    System.out.println("Geçersiz bir seçim yaptınız. Lütfen tekrar deneyin.");
                    break;
            }
        }
        System.out.println("Çıkış yaptınız!");
    }
}
