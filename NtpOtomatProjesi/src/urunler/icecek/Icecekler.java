package urunler.icecek;

import arayuzMenuleri.Menu;
import urunler.UrunStokDurumu;


import java.util.ArrayList;
import java.util.Collection;

//İçecek ürünü eklemek istendiğinde kullanılır,şuan kullanılmıyor yeni ürün eklemediğimiz için
public  class Icecekler  extends Menu {
    //******************************************************************************************************
    //Nesne oluşturmaları
    static Collection<String> icecekler = new ArrayList<>();
    UrunStokDurumu urunStokDurumu1=new UrunStokDurumu();

    //******************************************************************************************************
    //Setter & Getter
    public static Collection<String> getIcecekler() {

        icecekler.forEach(urun->{
            System.out.println(urun);
        });
        return icecekler;
    }

    public  void setIcecekler(String icecekler)
    {
        System.out.println("\n\t\t*> Yiyecekler menüsüne eklemek istediğiniz ürünün ismini yazınız");
        String tatli=secimMetin();
        Icecekler.icecekler.add(icecekler);
        System.out.print(tatli+" Ürününden kaç adet ekliyceksiniz");
        int stokSayisi = secim(60);
        urunStokDurumu1.setUrunStokSayisi(icecekler,stokSayisi);

    }


    //******************************************************************************************************
}
