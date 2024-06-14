package urunler.tatli;

import arayuzMenuleri.Menu;
import urunler.UrunStokDurumu;


import java.util.ArrayList;
import java.util.Collection;
//Tatlıların bulunduğu kısım
public class Tatlilar extends Menu {
    //******************************************************************************************************
    //Nesne oluşturmaları
    UrunStokDurumu urunStokDurumu1=new UrunStokDurumu();
    static Collection<String> tatlilar = new ArrayList<>();
    //******************************************************************************************************
    //Setter & Getter
    public Collection<String> getTatlilar() {

        tatlilar.forEach(urun->{
            System.out.println(urun);
        });
        return tatlilar;
    }

    public void setTatlilar(String tatlilar)
    {
        System.out.println("\n\t\t*> Yiyecekler menüsüne eklemek istediğiniz ürünün ismini yazınız");
        String tatli=secimMetin();
        Tatlilar.tatlilar.add(tatlilar);
        System.out.print(tatli+" Ürününden kaç adet ekliyceksiniz");
        int stokSayisi = secim(60);
        urunStokDurumu1.setUrunStokSayisi(tatlilar,stokSayisi);

    }
    //******************************************************************************************************
}
