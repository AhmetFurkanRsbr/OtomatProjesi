package yonetim;

import sistemeGirisler.SistemdekiKullanicilar;

import java.util.HashMap;
import java.util.Map;

//Yönetici yetkisine sahip kişinin giriş ypması
public class Yonetici extends Yonetim{

   //******************************************************************************************************
   //Nesne oluşturmaları
   Map<String,String> kullnicilarinGoruntusuMap = new HashMap<>();
   SistemdekiKullanicilar sistemdekiKullanicilar =new SistemdekiKullanicilar();
   //******************************************************************************************************
   //Metot tanımlamaları
   public Yonetici(String kullaniciAdi,String sifre){    // (YAPICI METOT)
      yeniKullanici.setKullanici("Yönetici");
      this.kullaniciAdi=kullaniciAdi;

      if(!this.kullaniciAdi.equals("")){
         kullaniciAdiVar=true;
         if(kullaniciAdi.equals("yonetici1") && sifre.equals("asd123")){
            System.out.println("\t\t-> yonetici_123 <- SİSTEME "+yeniKullanici.getKullanici()+" OLARAK GİRİŞ YAPTI");
         }
         else if(kullaniciAdi.equals("yonetici2") && sifre.equals("asd1234") ){
            System.out.println("\t\t-> yonetici2 <- SİSTEME "+yeniKullanici.getKullanici()+" OLARAK GİRİŞ YAPTI");
         }
         else{

            System.out.println("\t\t!!! KULLANICI ADI YADA ŞİFRE YÖNETİCİ İLE UYUŞMUYOR !!!");
         }
      }
    }
   //******************************************************************************************************
}
