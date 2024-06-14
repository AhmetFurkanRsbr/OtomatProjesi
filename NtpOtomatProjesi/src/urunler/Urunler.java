package urunler;

import java.util.*;

public class Urunler {
    //******************************************************************************************************
    // Nesne oluşturmaları
    public Scanner urunSecimi=new Scanner(System.in);
    static Map<String,Integer> urunListesi =new HashMap<>();
    static Map<String,Integer> iceceklerKoleksiyonu =new HashMap<>();
    static Map<String,Integer> yiyeceklerKoleksiyonu =new HashMap<>();
    static Map<String,Integer> tatlilarKoleksiyonu =new HashMap<>();
    //******************************************************************************************************
    //Özellik tanımları
    private static String urunTipi="null";
    private static int urunStokSayisi=0;
    private  boolean urunStogu=false;

    //******************************************************************************************************
// ÜRÜNLERE EKLEME İŞLEMİ -METOT ile:

    public  void urunListesi(){

    iceceklerKoleksiyonu.put("ESPRESSO",10);
    iceceklerKoleksiyonu.put("TÜRK KAVHESİ",9);
    iceceklerKoleksiyonu.put("LATTE",0);
    iceceklerKoleksiyonu.put("ÇAY",1);
    iceceklerKoleksiyonu.put("ICE MOCHA",5);
    iceceklerKoleksiyonu.put("FRAPPE",17);
    iceceklerKoleksiyonu.put("COLD BREW",7);
    iceceklerKoleksiyonu.put("KAYISI MEYVE SUYU",8);
    iceceklerKoleksiyonu.put("KARIŞIK MEYVE SUYU",6);
    iceceklerKoleksiyonu.put("VİŞNE MEYVE SUYU",4);
    iceceklerKoleksiyonu.put("RED BULL",3);
    iceceklerKoleksiyonu.put("MONSTER",20);
    iceceklerKoleksiyonu.put("SU",50);

    yiyeceklerKoleksiyonu.put("ZEYTİNLİ SANDAVİÇ",5);
    yiyeceklerKoleksiyonu.put("KAŞARLI SANDAVİÇ",4);
    yiyeceklerKoleksiyonu.put("SALAMLI SANDAVİÇ",3);
    yiyeceklerKoleksiyonu.put("PEYNİRLİ SANDAVİÇ",2);
    yiyeceklerKoleksiyonu.put("KAŞARLI TOST",8);
    yiyeceklerKoleksiyonu.put("SUCUKLU TOST",13);
    yiyeceklerKoleksiyonu.put("MARGARİTA PİZZA",9);
    yiyeceklerKoleksiyonu.put("PEPPERONİ PİZZA",1);
    yiyeceklerKoleksiyonu.put("NUGGET SANDAVİÇ",10);
    yiyeceklerKoleksiyonu.put("PATETES & NUGGET SANDAVİÇ",6);

    tatlilarKoleksiyonu.put("EKLER",30);
    tatlilarKoleksiyonu.put("PROFİTEROL",20);
    tatlilarKoleksiyonu.put("ÇİKOLATALI PASTA",10);
    tatlilarKoleksiyonu.put("SÜTLAÇ",5);
    tatlilarKoleksiyonu.put("KAZANDİBİ",8);

    urunListesi.putAll(iceceklerKoleksiyonu);
    urunListesi.putAll(yiyeceklerKoleksiyonu);
    urunListesi.putAll(tatlilarKoleksiyonu);


}


    //******************************************************************************************************
    //Getter & Setter
    public String getUrunTipi() {
        return Urunler.urunTipi;
    }

    public void setUrunTipi(String urunTipi) {
        Urunler.urunTipi = urunTipi;
    }

    public boolean isUrunStogu() {
        return urunStogu;
    }

    public void setUrunStogu(boolean urunStogu) {
        this.urunStogu = urunStogu;
    }

    public static Map<String,Integer> getUrunListesi() {
        return urunListesi;
    }
    public void setUrunListesi(Map<String,Integer> urunListesi) {
        Urunler.urunListesi = urunListesi;
    }

    public Map<String,Integer> getIcecekKoleksiyonu() {

        return iceceklerKoleksiyonu;
    }

    public void setIcecekKoleksiyonu(String icecek) {
        Urunler.urunTipi = icecek;
    }

    public Map<String,Integer> getYiyecekKoleksiyonu() {

        return yiyeceklerKoleksiyonu;
    }

    public void setYiyecekKoleksiyonu(String yiyecek) {
        Urunler.urunTipi = yiyecek;
    }

    public Map<String,Integer> getTatliKoleksiyonu() {

        return tatlilarKoleksiyonu;
    }

    public void setTatliKoleksiyonu(String tatli) {
        Urunler.urunTipi = tatli;
    }

    public static int getUrunStokSayisi() {
        return urunStokSayisi;
    }

    public static void setUrunStokSayisi(int urunStokSayisi) {
        Urunler.urunStokSayisi = urunStokSayisi;
    }


    //******************************************************************************************************
}
