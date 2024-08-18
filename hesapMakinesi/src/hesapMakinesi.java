import java.util.Arrays;
import java.util.Scanner;

public class hesapMakinesi {

    public static void main(String[] args){
        int[] sayilar = sayilariAl(10);  // 10 adet sayıyı al
        sirala(sayilar);  // Sayıları sırala
        ekranaYaz(sayilar);  // Sıralı sayıları ekrana yaz

        // Basit hesap makinesi işlemleri
        int x = sayiAl();
        int y = sayiAl();
        String islem = islemAl();
        double sonuc = hesapla(x, y, islem);
        System.out.println("Sonuç: " + sonuc);
    }

    // 10 adet tam sayıyı kullanıcıdan al
    private static int[] sayilariAl(int adet) {
        Scanner sc = new Scanner(System.in);
        int[] sayilar = new int[adet];
        for (int i = 0; i < adet; i++) {
            System.out.println((i + 1) + ". sayıyı girin:");
            sayilar[i] = sc.nextInt();
        }
        return sayilar;
    }

    // Sayıları küçükten büyüğe sırala
    private static void sirala(int[] sayilar) {
        Arrays.sort(sayilar);
    }

    // Sıralanmış sayıları ekrana yazdır
    private static void ekranaYaz(int[] sayilar) {
        System.out.println("Sıralanmış sayılar:");
        for (int sayi : sayilar) {
            System.out.println(sayi);
        }
    }

    // Hesap makinesi işlemleri
    private static double hesapla(int x, int y, String islem) {
        switch (islem) {
            case "+":
                return x + y;
            case "-":
                return x - y;
            case "*":
                return x * y;
            case "/":
                if (y != 0) {
                    return ((double) x) / y;
                } else {
                    System.out.println("Bölme işleminde bölen 0 olamaz!");
                    return 0;
                }
            default:
                System.out.println("Yanlış işlem girildi!");
                return 0;
        }
    }

    private static String islemAl() {
        Scanner sc = new Scanner(System.in);
        System.out.println("/// BİR İŞLEM GİR :::: +,-,*,/ ::::///");
        return sc.nextLine();
    }

    private static int sayiAl() {
        Scanner sc = new Scanner(System.in);
        System.out.println("/// BİR SAYI GİR ///");
        return sc.nextInt();
    }
}
