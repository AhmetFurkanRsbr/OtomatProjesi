package urunler.yiyecek;

import arayuzMenuleri.Menu;
import urunler.UrunStokDurumu;

import java.util.ArrayList;
import java.util.Collection;
//BU SINIF AKTİF OLARAK KULLANILMIYOR ÜRÜN EKLEMEK İSTENİLDİĞİNDE BURDAN EKLENEBİLİR
public class Yiyecekler extends Menu {
    //******************************************************************************************************
    //Nesne oluşturmaları
    UrunStokDurumu urunStokDurumu1=new UrunStokDurumu();
    static Collection<String> yiyecekler = new ArrayList<>();
    //******************************************************************************************************
    //Setter & Getter
    public Collection<String> getYiyecekler() {

        yiyecekler.forEach(urun->{
            System.out.println(urun);
        });
        return yiyecekler;
    }

    public void setYiyecekler(String yiyecekler)
    {
        System.out.println("\n\t\t*> Yiyecekler menüsüne eklemek istediğiniz ürünün ismini yazınız");
        String yiyecek=secimMetin();
        Yiyecekler.yiyecekler.add(yiyecekler);
        System.out.print(yiyecek+" Ürününden kaç adet ekliyceksiniz");
        int stokSayisi = secim(60);
        urunStokDurumu1.setUrunStokSayisi(yiyecek,stokSayisi);

    }
    //******************************************************************************************************
}
