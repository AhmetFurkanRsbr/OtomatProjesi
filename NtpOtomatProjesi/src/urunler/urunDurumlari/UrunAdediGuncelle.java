package urunler.urunDurumlari;

import urunler.StoguBitmekUzereUrunler;
import urunler.UrunStokDurumu;
import urunler.Urunler;
import uyarilar.Uyari;
import uyarilar.Uyarilar;

//Ürün adedinin güncellendiği kısım
public class UrunAdediGuncelle extends Urunler {
    Uyarilar uyarilar1=new Uyarilar();
    StoguBitmekUzereUrunler stoguBitmekUzereUrunler1=new StoguBitmekUzereUrunler();
    //******************************************************************************************************
    //Özellik tanımlamaları
    String urun;
    private int mevcutAdet=0;
    //******************************************************************************************************
    //Metot tanımlamları

    public void urunStokAzalt(String urunAdi,int stokMiktari) {
        if (UrunStokDurumu.getUrunStok().containsValue(stokMiktari)) {

            if (stokMiktari > 0) {
                UrunStokDurumu.getUrunStok().put(urunAdi,stokMiktari - 1);
                System.out.println("Ürün stoktan düşüldü. Güncel stok miktarı: " + (stokMiktari - 1));

                if(UrunStokDurumu.getUrunStok().get(urunAdi)<=0){
                    uyarilar1.uyariOlustur(Uyari.arizaCesit.urunBitti,urunAdi,stokMiktari);
                    if( stoguBitmekUzereUrunler1.getStoguBitmekUzereOlanUrunlerMap().containsKey(urunAdi) && stoguBitmekUzereUrunler1.getStoguBitmekUzereOlanUrunlerMap().get(urunAdi)==0) {
                        stoguBitmekUzereUrunler1.getStoguBitmekUzereOlanUrunlerMap().remove(urunAdi);
                    }
                } else if (!(UrunStokDurumu.getUrunStok().get(urunAdi)<=0) && (UrunStokDurumu.getUrunStok().get(urunAdi)<5) ) {
                    uyarilar1.uyariOlustur(Uyari.arizaCesit.urunBitmekUzere,urunAdi,stokMiktari-1);
                    stoguBitmekUzereUrunler1.setStoguBitmekUzereOlanUrunler() ;
                }

            } else {
                System.out.println("Stokta yeterli miktarda ürün bulunmamaktadır.");

            }
        }

    }


    //******************************************************************************************************
    //Setter & Getter
    public int getMevcutAdet() {
        return mevcutAdet;
    }
    public void setMevcutAdet(int mevcutAdet) {
        this.mevcutAdet = mevcutAdet;
    }
    //******************************************************************************************************
}
