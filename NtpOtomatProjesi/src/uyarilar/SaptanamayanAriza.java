package uyarilar;

//Saptanamayan sebeplerden oluşan hataların bulunduğu kısım
public class SaptanamayanAriza extends Uyarilar implements Uyari {

     public static void saptanamayanArizaOlustur(){
        saptanamayanArizaList1.add(arizaCesit.belirsiz);
    }

    @Override
    public void uyariGonder(Uyari.arizaCesit cesit, Uyari adet) {
        System.out.println(" OTOMATTA SEBEBİ BİLİNMEYEN BİR ARIZA MEVCUTTUR : !!-> Arıza Çeşidi : " + cesit);
    }
}
