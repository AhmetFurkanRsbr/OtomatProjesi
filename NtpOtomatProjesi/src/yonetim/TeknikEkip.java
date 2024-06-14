package yonetim;

import aktifKullanici.AktifKullanici;

//Teknik ekip yetkisine sahip kişinin girişi
public class TeknikEkip extends Yonetim {
    public TeknikEkip(String teknikEkipKullaniciAd){
        yeniKullanici.setKullanici("Teknik Ekip");
        kullaniciAdi=teknikEkipKullaniciAd;

        if(!this.kullaniciAdi.equals("")){
            kullaniciAdiVar=true;
        } else if (AktifKullanici.getKullanici().equals("Teknik Ekip")) {
            System.out.println("Teknik ekip giriş yapmıştır.");
        }
    }
}
