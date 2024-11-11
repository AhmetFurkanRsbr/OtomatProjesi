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

         if(sistemdekiKullanicilar.getKullanicilarMap().containsKey(kullaniciAdi) && sifre.equals(sistemdekiKullanicilar.getKullanicilarMap().get(kullaniciAdi))){
            System.out.println("\t\t-> "+kullaniciAdi+" <- SİSTEME "+yeniKullanici.getKullanici()+" OLARAK GİRİŞ YAPTI");
         }

         else{
            System.out.println("\t\t!!! KULLANICI ADI YADA ŞİFRE YÖNETİCİ İLE UYUŞMUYOR !!!");
         }
      }
    }
   //******************************************************************************************************
}
