package uyarilar;

import kasa.AnlikKasaDurumu;

import java.util.ArrayList;
import java.util.List;

//Uyarıların oluşturulduğu kısım
public class Uyarilar {
 public static    List<Uyari.arizaCesit> uyarilarList1 = new ArrayList<>();
public static List<Uyari.arizaCesit> saptanamayanArizaList1 = new ArrayList<>();

    boolean uyariOlusturuldu=false;

    public  boolean uyariOlustur(Uyari.arizaCesit cesit){
        if(uyariOlusturulduMu(cesit)) {

            if (cesit == Uyari.arizaCesit.belirsiz) {//+
                SaptanamayanAriza.saptanamayanArizaOlustur();
            }
            uyariOlusturuldu = uyariOlusturulduMu(cesit);
        }

        return uyariOlusturuldu;
    }
    public  boolean uyariOlustur(Uyari.arizaCesit cesit,int kasaDurumu){
        if(uyariOlusturulduMu(cesit)) {

            if (cesit == Uyari.arizaCesit.parasal) {//+
                ParasalUyari.parasalUyariGonder(Uyari.arizaCesit.parasal,kasaDurumu);
            }
            uyariOlusturuldu = uyariOlusturulduMu(cesit);
        }

        return uyariOlusturuldu;
    }

    public boolean uyariOlusturulduMu(Uyari.arizaCesit cesit){
        if(cesit == Uyari.arizaCesit.yok){
            uyariOlusturuldu=false;
        } else{
            uyariOlusturuldu=true;
        }
         return uyariOlusturuldu;
    }

    public boolean uyariOlustur(Uyari.arizaCesit cesit, String urun, int anlikAdet) {

        if(uyariOlusturulduMu(cesit)) {

            if (cesit == Uyari.arizaCesit.urunBitti) {//+

                UrunBitti.urunBittiUyari(urun);

            } else if (cesit == Uyari.arizaCesit.urunBitmekUzere) {//+
                UrunBitimineAzKaldi  urunBitimineAzKaldi1=new UrunBitimineAzKaldi();
                urunBitimineAzKaldi1.getUrunBitimineAzKaldi(urun,anlikAdet);

            }

            uyariOlusturuldu = uyariOlusturulduMu(cesit);
        }
        return uyariOlusturuldu;
    }

}
