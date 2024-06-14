package urunler.urunDurumlari;

import urunler.UrunStokDurumu;
import urunler.Urunler;

import java.util.Map;

//Otomattaki ürünleri gösteren kısım
public  class UrunleriGoster extends Urunler {
    //******************************************************************************************************
    //Metot tanımlamaları

    public void urunleriGoster() {
        int sayac=1;
        System.out.println("\n-------------------------  ÜRÜNLER GÖSTERİLİYOR  -------------------------\n");
        for (Map.Entry<String,Integer> urun : UrunStokDurumu.getUrunStok().entrySet()) {
            System.out.println("\t\t"+sayac + "> " + urun.getKey() );
            sayac++;
        }
        System.out.println("\n--------------------------------------------------------------------------\n");
    }
}
