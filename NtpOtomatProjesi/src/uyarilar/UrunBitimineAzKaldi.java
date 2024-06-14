package uyarilar;
import urunler.StoguBitmekUzereUrunler;

//Ürün stoğunun az kalmasından dolayı oluşan uyarı
public class UrunBitimineAzKaldi extends Uyarilar implements Uyari {
    StoguBitmekUzereUrunler stoguBitmekUzereUrunler1= new StoguBitmekUzereUrunler();

    private  void urunBitimineAzKaldi(String urun,int stokMiktari){
        stoguBitmekUzereUrunler1.setStoguBitmekUzereOlanUrunler();
        System.out.println("!!!  Teknik Ekip YE BİLDİRİM GÖNDERİLDİ  !!!");
        System.out.println(urun+"Ürününden"+ stokMiktari +"adet mevcuttur  ve stoğu bitmek üzeredir");
        uyarilarList1.add(arizaCesit.urunBitmekUzere);
    }
    public void getUrunBitimineAzKaldi(String urun,int stokMiktari){
        urunBitimineAzKaldi(urun,stokMiktari);
    }

    @Override
    public void uyariGonder(Uyari.arizaCesit cesit, Uyari adet) {
        System.out.println(" ÜRÜN BİTMEK ÜZERE OTAMATA ÜRÜNÜ EKLEYİNİZ : !!-> Arıza Çeşidi : " + cesit);
    }
}
