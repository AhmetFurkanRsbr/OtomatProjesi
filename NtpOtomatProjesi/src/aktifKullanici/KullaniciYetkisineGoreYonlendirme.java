package aktifKullanici;

import arayuzMenuleri.TeknikEkipMenu;
import arayuzMenuleri.YoneticiMenu;

public class KullaniciYetkisineGoreYonlendirme {
    //******************************************************************************************************
    //Nesne oluşturmaları
    YoneticiMenu yoneticiMenu1 = new YoneticiMenu();
    TeknikEkipMenu teknikEkipMenu1 = new TeknikEkipMenu();
    //******************************************************************************************************
    //Metot tanımlamaları
    public void kullaniciYetkisineGoreMenuyeYonlendir(){
    //Giriş yapan kullanıcının yetkisine göre ona özel olan menüye yönlendirilmesi işlemleri

        switch (Kullanici.getKullanici()){
            case "Yönetici":
                yoneticiMenu1.yoneticiMenusu();
                break ;

            case "Teknik Ekip":
                teknikEkipMenu1.teknikEkipMenusu();
                break;

            default:
                break;

        }
    }
    //******************************************************************************************************
}
