package aktifKullanici;

import sistemeGirisler.SistemdekiKullanicilar;
import java.util.Map;

public class AktifKullanici extends Kullanici {
   //Sisteme giriş yapan kullanıcının bilgilerini sisteme yönlendirme işlemleri
    private static String kullaniciYetki="null";

    private static void aktifKullaniciBelirle(String kullaniciAdi){

        for (Map.Entry<String,String> anlikKullanici:SistemdekiKullanicilar.getKullanicilarYetkileriyleMap().entrySet()) {
           if(anlikKullanici.getKey().equals(kullaniciAdi)){
               kullaniciYetki = anlikKullanici.getValue();
               setKullanici(kullaniciYetki);
           }
        }

    }
    //Setter
    public static void setAktifKullaniciBelirle(String KullaniciAdi){
       aktifKullaniciBelirle(KullaniciAdi);
    }

    //******************************************************************************************************
}
