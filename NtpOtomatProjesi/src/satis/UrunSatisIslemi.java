package satis;

import aktifKullanici.Kullanici;
import arayuzMenuleri.Menu;
import kasa.AnlikKasaDurumu;
import urunAlimYonelimleri.GunlukAlinanUrunSayisi;
import urunAlimYonelimleri.GunlukUrunAlimDurumlari;
//Ürünün satış işleminin gerçekleştiği kısım
public class UrunSatisIslemi extends Menu {
    //******************************************************************************************************
    //Nesne oluşturmaları
    AnlikKasaDurumu anlikKasaDurumu1 =new AnlikKasaDurumu();
    GunlukAlinanUrunSayisi gunlukAlinanUrunSayisi1=new GunlukAlinanUrunSayisi();
    //******************************************************************************************************
    //Metot tanımlamaları
    public  void urunSatisiniGerceklestir(String urun,String urunuAlanYetki,String kullaniciAdi,int odenecekTutar){
       anlikKasaDurumu1.kasaDurumuGuncelle(odenecekTutar);
        System.out.println("\n\n\n"+bosluk+bosluk+" --> Alınan ürün :" + urun +" ->Alınan ücret : "+odenecekTutar);
       beklet();
       GunlukUrunAlimDurumlari.setUrunAlimDurumuMap(kullaniciAdi, Kullanici.getKullanici(),urun,odenecekTutar);
       gunlukAlinanUrunSayisi1.setGunlukAlinanUrunSayisiMap(urun);
        System.out.println("\n****************************-----------------------****************************\n"+bosluk+bosluk+bosluk + "Ürün alım işleminiz sonlandı " + "\n****************************-----------------------****************************\n");

    }
    //******************************************************************************************************
}
