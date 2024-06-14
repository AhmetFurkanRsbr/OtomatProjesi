package uyarilar;

//Parasal sebeplerden oluşan uyarılar
public class ParasalUyari extends Uyarilar implements Uyari {

    Uyarilar uyarilar1=new Uyarilar();

    public static void parasalUyariGonder(Uyari.arizaCesit cesit,int anlikKasaDurumu) {
        System.out.println(" PARASAL BİR SORUN MEVCUTTUR ");
        System.out.println("!!! OTOMATA YAKIN OLAN GÜVENLİĞE BİLDİRİM GÖNDERİLDİ !!!");
        System.out.println(" KASADAKİ PARA : "+anlikKasaDurumu);
        uyarilarList1.add(cesit);
    }

    @Override
    public void uyariGonder(Uyari.arizaCesit cesit, Uyari adet) {
        System.out.println(" OTAMATTA PARASAL BİR ARIZA MEVCUTTUR : !!-> Arıza Çeşidi : " + cesit);
    }
}
