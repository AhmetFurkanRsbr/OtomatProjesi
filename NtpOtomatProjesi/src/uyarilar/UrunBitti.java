package uyarilar;

//Ürün stoğu bitmesinden kaynaklı uyarı
public class UrunBitti extends Uyarilar implements Uyari{

    public static  String urunBittiUyari(String urun){
        System.out.println("Teknik Ekip KİŞİSİNE \"!! ÜRÜN BİTTİ !! \"BİLDİRİMİ GÖNDERİLDİ ");
        uyarilarList1.add(arizaCesit.urunBitti);
          return urun;
    }

    @Override
    public void uyariGonder(arizaCesit cesit, Uyari adet) {
        System.out.println(" ÜRÜN BİTMİŞTİR  OTAMATA ÜRÜNÜ EKLEYİNİZ : !!-> Arıza Çeşidi : " + cesit);
    }
}
