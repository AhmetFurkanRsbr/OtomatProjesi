package main;

import arayuzMenuleri.AnaMenu;
import sistemeGirisler.SistemdekiKullanicilar;
import urunler.UrunStokDurumu;
//Main metodu. Programın çalıştığı kısım
public class Main {
    public static void main(String[] args) {
        //******************************************************************************************************
        //Nesne üretimleri:
        AnaMenu anaMenu1=new AnaMenu();

        UrunStokDurumu urunStokDurumu1=new UrunStokDurumu();

        //******************************************************************************************************
        SistemdekiKullanicilar.sistemeKullanicilariYukle();//Sisteme kayıtlı olan kullanıcıları ekler
        urunStokDurumu1.stoklaraEkle();     //Sisteme kayıtlı ürünleri yükler
        anaMenu1.temizle();          //50 satır boşluk vererek ekranı temizlemiş olur

        anaMenu1.AnaMenuGoster();   //Asıl Kodun çalıştığı kısım

        //******************************************************************************************************

    }
    
}
