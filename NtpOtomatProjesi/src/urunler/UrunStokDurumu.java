package urunler;

import kasa.AnlikKasaDurumu;
import uyarilar.UrunBitti;
import uyarilar.Uyari;
import uyarilar.Uyarilar;

import java.util.HashMap;
import java.util.Map;

public class UrunStokDurumu extends Urunler {

    //******************************************************************************************************
    //Nesne oluşturmaları
    static private  Map<String,Integer> urunStok = new HashMap<>();
    StoguBitmekUzereUrunler stoguBitmekUzereUrunler1= new StoguBitmekUzereUrunler();
    Uyarilar uyarilar1=new Uyarilar();
    //******************************************************************************************************
    //Özellik tanımlamları
    private static boolean urunStokDurum=false;
    int stokMiktari=0;
    //******************************************************************************************************
    //Metot tanımlamaları
    public  void stoklaraEkle(){
        setUrunStokSayisi("ESPRESSO",50);
        setUrunStokSayisi("NUGGET SANDAVİÇ",10);
        setUrunStokSayisi("KAZANDİBİ",8);
        setUrunStokSayisi("KAYISI MEYVE SUYU",8);
        setUrunStokSayisi("VİŞNE MEYVE SUYU",4);
        setUrunStokSayisi("ZEYTİNLİ SANDAVİÇ",5);
        setUrunStokSayisi("TÜRK KAVHESİ",9);
        setUrunStokSayisi("KAŞARLI SANDAVİÇ",4);
        setUrunStokSayisi("COLD BREW",7);
        setUrunStokSayisi("PROFİTEROL",20);
        setUrunStokSayisi("ICE MOCHA",5);
        setUrunStokSayisi("ÇİKOLATALI PASTA",10);
        setUrunStokSayisi("KAŞARLI TOST",8);
        setUrunStokSayisi("SÜTLAÇ",5);
        setUrunStokSayisi("SU",50);
        setUrunStokSayisi("FRAPPE",17);
        setUrunStokSayisi("KARIŞIK MEYVE SUYU",6);
        setUrunStokSayisi("MARGARİTA PİZZA",9);
        setUrunStokSayisi("PEPPERONİ PİZZA",1);
        setUrunStokSayisi("SALAMLI SANDAVİÇ",3);
        setUrunStokSayisi("PEYNİRLİ SANDAVİÇ",2);
        setUrunStokSayisi("RED BULL",3);
        setUrunStokSayisi("MONSTER",20);
        setUrunStokSayisi("EKLER",30);
        setUrunStokSayisi("LATTE",0);
        setUrunStokSayisi("ÇAY",1);
        setUrunStokSayisi("SUCUKLU TOST",13);
        setUrunStokSayisi("PATETES & NUGGET SANDAVİÇ",6);

    }


    public void stoklariGoster() {
        int sayac=1;
        System.out.println("\n-------------------------  ÜRÜN STOKLARI GÖSTERİLİYOR  -------------------------\n");
        for (Map.Entry<String,Integer> urun : urunStok.entrySet()) {
            System.out.println("\t\t"+sayac + "> " + urun.getKey() + "  -> " + urun.getValue()+" Adet mevuct" );
        sayac++;
        }
        System.out.println("\n--------------------------------------------------------------------------\n");
    }

    private boolean urunStokDurumSorgula(String urun){
        urunListesi();

        urunListesi=getUrunListesi();

        getUrunStokSayisi(urun);

        if(urunListesi.containsKey(urun)){

            stokMiktari=getUrunStokSayisi(urun);

            if(stokMiktari>0){

                System.out.println("\n\n\t *>Ürün stokta mevcut ve stok miktarı: " + stokMiktari );
                 urunStokDurum=true;
            } else{
                System.out.println("Ürünün stoğu bulunmuyor.");
                urunStokDurum=false;
                uyarilar1.uyariOlustur(Uyari.arizaCesit.urunBitti,urun,stokMiktari);

            }

        }else{
            System.out.println("Belirtilen ürün stokta bulunmuyor.");
            urunStokDurum=false;
        }

        return urunStokDurum;
    }
    //******************************************************************************************************
    //Setter & Getter

    public static Map<String, Integer> getUrunStok() {
        return urunStok;
    }

    public static void setUrunStok(Map<String, Integer> urunStok) {
        UrunStokDurumu.urunStok = urunStok;
    }
    public boolean getUrunStokDurumSorgula(String urun) {

        urunStokDurumSorgula(urun);
        return urunStokDurum;
    }

    public boolean getUrunStokDurum() {
        return urunStokDurum;
    }

    public void setUrunStokDurum(String urun,boolean urunStokDurum) {
        Urunler urunler1= new Urunler();

    }
    public void setUrunStokSayisi(String urun,int stokSayisi) {

        if (urunStok.containsKey(urun)) {
            int eskiStokSayisi=urunStok.get(urun);
            int guncelStokSayisi= eskiStokSayisi + stokSayisi;
            urunStok.put(urun,guncelStokSayisi ); // Eğer ürün varsa stok sayısını güncelle
            System.out.println(urun + " ürününün stok sayısı güncellendi: " + guncelStokSayisi);
        } else {
            urunStok.put(urun, stokSayisi); // Eğer ürün yoksa yeni ürünü ekle
            System.out.println(urun + " ürünü stoklara eklendi: " + stokSayisi);
        }

    }
    public int getUrunStokSayisi(String urunIsmi){
        for (Map.Entry<String,Integer> urun : urunStok.entrySet()) {
                if(urun.getKey().equals(urunIsmi)){
                    stokMiktari=urun.getValue();
                }
        }

        return stokMiktari;
    }
    //******************************************************************************************************
}
