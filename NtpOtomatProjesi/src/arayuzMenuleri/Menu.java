package arayuzMenuleri;

import aktifKullanici.AktifKullanici;
import aktifKullanici.Kullanici;
import sistemeGirisler.KullaniciIslemleri;
import urunler.UrunStokDurumu;
import urunler.Urunler;
import urunler.icecek.Icecekler;


import java.util.Scanner;
//Menülerde kullanılacak olan belli başlı kalıplar.
public class Menu {
    //******************************************************************************************************
    //Nesne oluşturmaları
    SistemeGirisMenu sistemeGirisMenu1 =new SistemeGirisMenu();
    Scanner scanner= new Scanner(System.in);         //Kullanıcıdan input almak için tanımlanmış scanner.

    //******************************************************************************************************
    //Özellik tanımlamalır
    static String  istenilenUrun="null";
    static int odenecekUcret=0;
    public int secimSonucu=0;
    byte hataliSecim=0;
    public static int sonrakiGiris=0;
    int  kullaniciGirisiYapildi=0;

    public String bosluk="\t\t";     //bosluk adında 2 tab boşluk tutan string bir değişken  tanımlanıyor estetik için kullanılıyor.
    public void temizle(){for (int i = 0; i < 50; ++i) System.out.println();}

    //******************************************************************************************************

    //Metot tanımlamaları
    public String secimMetin(){            //secim adında byte türünden seçimi kullanıcıdan alan metot.
        String cevap="";

        try{
            cevap = scanner.nextLine();

        }catch (Exception hata){
            System.out.println("!! Hatalı Seçim !!");
            System.out.println("Lütfen Tekrar Seçim Yapınız : ");
            System.out.println("Lütfen Tekrar Seçim Yapınız : ");

        }
        return  cevap;
    }

    public void beklet(){                   //Programı  belli durumlarda bekletmek için beklet isimli metot.
        int beklemeSuresiMilisaniye = 2000; // 2000 milisaniye = 2 saniye

        try {
            // Belirtilen süre boyunca programı beklet
            Thread.sleep(beklemeSuresiMilisaniye);              //bekletme metotunun işi yapan kısmı.
        } catch (InterruptedException e) {
            System.out.println("Bir hata oluştu: " + e.getMessage());
        }
    }

    public int secim(int limit){            //secim adında byte türünden seçimi kullanıcıdan alan metot.
        secimSonucu = 0;
        try {
            secimSonucu = Integer.parseInt(scanner.nextLine());
              if(secimSonucu>limit){
                  System.out.println("\n\t\t!! HATALI SEÇİM !! --> Seçim aralığında değilsiniz.");
                  System.out.print(" *> Yeni seçim : ");
                  secim(limit);
              }
        } catch (NumberFormatException e) {
            System.out.println("\n\t\t!! HATALI SEÇİM !! --> Lütfen sayı giriniz .");
            System.out.print(" *> Yeni seçim : ");
                secim(limit);
        }

        return secimSonucu;
    }

    public void yonlendirme(){



        System.out.println("\n\n\n\t**************  Sisteme Giriş Yapacak mısınız ?  **************");
        System.out.print(bosluk + "*> Evet için -> 1 / Hayır için -> 0) : ");

        secim(1);

        if(secimSonucu==1){
            System.out.println(bosluk+bosluk+"->Seçim sonucunuz : " + secimSonucu+"\n");
            System.out.println("\n\t/./././ Sisteme Giriş Ekranına Gönderiliyorsunuz /./././");
            beklet();

            sistemeGirisMenu1.SistemeGirisMenusu();
            kullaniciGirisiYapildi=1;
            hataliSecim=0;

        }
        else if(secimSonucu==0) {
            System.out.println(bosluk+bosluk+"->Seçim sonucunuz : " + secimSonucu+"\n");
            System.out.println(bosluk+"\t!!! SİSTEME GİRİŞ YAPILMADI !!!");
            System.out.println(bosluk+"Otomat Ekranına Gönderiliyorsunuz......");
            beklet();

            kullaniciGirisiYapildi=0;
            KullaniciIslemleri.setKullaniciAdi("null");
            setIstenilenUrun("null");
            Kullanici.setKullanici("YOK");
            AktifKullanici.setAktifKullaniciBelirle("null");
            hataliSecim=0;
        }
        else {
            System.out.println("\n\t\t!! HATALI SEÇİM !! --> 0 YADA 1 den Birini SEÇİNİZ : ");
            hataliSecim=1;

                yonlendirme();
        }
        beklet();
    }

    //******************************************************************************************************
    //Setter & Getter
    public void setIstenilenUrun(String istenilenUrun) {
        Menu.istenilenUrun = istenilenUrun;
    }
    public String getIstenilenUrun() {
        return istenilenUrun;
    }

    public static int getOdenecekUcret() {
        return odenecekUcret;
    }

    public static void setOdenecekUcret(int odenecekUcret) {
        Menu.odenecekUcret = odenecekUcret;
    }

    //******************************************************************************************************

}
