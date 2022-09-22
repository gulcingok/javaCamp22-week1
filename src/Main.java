public class Main {
    public static void main(String[] args) {

        /* arkadas sayilar

        int number1 = 220;
        int number2 = 284;
        int total1 = 0;
        int total2 = 0;

        int i;
        for(i = 1; i < number1; ++i) {
            if (number1 % i == 0) {
                total1 += i;
            }
        }

        for(i = 1; i < number2; ++i) {
            if (number2 % i == 0) {
                total2 += i;
            }
        }

        if (number1 == total2 && number2 == total1) {
            System.out.println("Sayılar arkadaş sayıdır.");
        } else {
            System.out.println("Sayılar arkadaş sayı değildir.");
        }


         */

        /* arraysDemo

        String ogrenci1 = "Engin";
        String ogrenci2 = "Derin";
        String ogrenci3 = "Salih";
        System.out.println(ogrenci1);
        System.out.println(ogrenci2);
        System.out.println(ogrenci3);
        System.out.println("-------------");
        String[] ogrenciler = new String[]{"Engin", "Derin", "Salih", "Gülçin", "Çağlar"};

        for(int i = 0; i < ogrenciler.length; ++i) {
            System.out.println(ogrenciler[i]);
        }

        String[] var9 = ogrenciler;
        int var6 = ogrenciler.length;

        for(int var7 = 0; var7 < var6; ++var7) {
            String ogrenci = var9[var7];
            System.out.println(ogrenci);
        }

         */

        /* conditionals

         int sayi = 20;
        if (sayi < 20) {
            System.out.println("Sayı 20 den küçüktür");
        } else if (sayi > 20) {
            System.out.println("Sayı 20 den küçük değildir");
        } else {
            System.out.println("Sayı 20 ye eşittir.");
        }

         */

        /* loopDemo

        int i;
        for(i = 2; i <= 10; i += 2) {
            System.out.println(i);
        }

        System.out.println("For Döngü Bitti");

        for(i = 1; i < 10; ++i) {
            System.out.println(i);
        }

        System.out.println("While Döngüsü Bitti");
        int j = 1;

        do {
            System.out.println(j);
            j += 2;
        } while(j < 10);

        System.out.println("D0-While Döngüsü Bitti");
         */

        /* miniProjeAsalSayi

        int number = 25;
        boolean isPrime = true;

        for(int i = 2; i < number; ++i) {
            if (number % i == 0) {
                isPrime = false;
            }
        }

        if (isPrime) {
            System.out.println("Sayı Asaldır.");
        } else {
            System.out.println("Sayı Asal Değildir.");
        }

         */

        /* mukemmelSayilar

         int number = 5;
        int total = 0;

        for(int i = 1; i < number; ++i) {
            if (number % i == 0) {
                total += i;
            }
        }

        if (total == number) {
            System.out.println("Mükemmel Sayıdır.");
        } else {
            System.out.println("Mükemmel Sayı Değildir.");
        }

         */

        /* multiDimensionalArrayDemo

        String[][] sehirler = new String[3][3];
        sehirler[0][0] = "İstanbul";
        sehirler[0][1] = "Bursa";
        sehirler[0][2] = "Bilecik";
        sehirler[1][0] = "Ankara";
        sehirler[1][1] = "Konya";
        sehirler[1][2] = "Kayseri";
        sehirler[2][0] = "Diyarbakır";
        sehirler[2][1] = "Şanlıurfa";
        sehirler[2][2] = "Gaziantep";

        for(int i = 0; i <= 2; ++i) {
            System.out.println("-------------");

            for(int j = 0; j <= 2; ++j) {
                System.out.println(sehirler[i][j]);
            }

         */

        /* reCapDemo1

        int sayi1 = 20;
        int sayi2 = 25;
        int sayi3 = 2;
        int enBuyuk = sayi1;
        if (sayi1 < sayi2) {
            enBuyuk = sayi2;
        }

        if (enBuyuk < sayi3) {
            enBuyuk = sayi3;
        }

        System.out.println("En Büyük =" + enBuyuk);

         */

        /* reCapDemo2

        double[] myList = new double[]{1.2, 6.3, 4.3, 5.6};
        double total = 0.0;
        double max = myList[0];
        double[] var6 = myList;
        int var7 = myList.length;

        for(int var8 = 0; var8 < var7; ++var8) {
            double number = var6[var8];
            if (max < number) {
                max = number;
            }

            total += number;
            System.out.println(number);
        }

        System.out.println("Toplam = " + total);
        System.out.println("En Büyük = " + max);
         */

        /* sayiBulma

        int[] sayilar = new int[]{1, 2, 5, 7, 9, 0};
        int aranacak = 5;
        boolean varMi = false;
        int[] var4 = sayilar;
        int var5 = sayilar.length;

        for(int var6 = 0; var6 < var5; ++var6) {
            int sayi = var4[var6];
            if (sayi == aranacak) {
                varMi = true;
                break;
            }
        }

        if (varMi) {
            System.out.println("Sayı Mevcuttur.");
        } else {
            System.out.println("Sayı Mevcut Değildir.");
        }
         */

        /* sesliHarfler

        char harf = 65;
        switch (harf) {
            case 65:
            case 73:
            case 79:
            case 85:
                System.out.println("Kalın Sesli Harf");
                break;
            default:
                System.out.println("İnce Sesli Harf");
        }

         */

        /* stringsDemo

        String mesaj = "    Bugün hava çok güzel.    ";
        System.out.println(mesaj);
        String yeniMesaj = mesaj.replace(' ', '-');
        System.out.println(yeniMesaj);
        System.out.println(mesaj.substring(2));
        String[] var3 = mesaj.split(" ");
        int var4 = var3.length;

        for(int var5 = 0; var5 < var4; ++var5) {
            String kelime = var3[var5];
            System.out.println(kelime);
        }

        System.out.println(mesaj.toLowerCase());
        System.out.println(mesaj.toUpperCase());
        System.out.println(mesaj.trim());

         */

        /* switchDemo

        char grade = 115;
        switch (grade) {
            case 65:
                System.out.println("Mükemmel : Geçtiniz");
                break;
            case 66:
                System.out.println("Çok Güzel : Geçtiniz");
                break;
            case 67:
                System.out.println("İyi : Geçtiniz");
                break;
            case 68:
                System.out.println("Fena Değil : Geçtiniz");
                break;
            case 69:
            default:
                System.out.println("Geçersiz not girdiniz.");
                break;
            case 70:
                System.out.println("Maalesef : Kaldınız");
        }

         */

        /* variables

        int ogrenciSayisi = 11;
        String mesaj = "Öğrenci Sayısı : ";
        System.out.println(mesaj + ogrenciSayisi);
        System.out.println("Öğrenci Sayım : 10");
        System.out.println("Öğrenci Sayım : 10");
        System.out.println("Öğrenci Sayım : 10");

         */
    }
}