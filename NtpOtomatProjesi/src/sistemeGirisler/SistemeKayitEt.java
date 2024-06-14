package sistemeGirisler;

import aktifKullanici.AktifKullanici;
import arayuzMenuleri.Menu;
//Sisteme bir kullanıcıyı kayıt etmek istenirse kullanılcak kısım
//KULLANILMIYOR ŞUANDA SİSTEME KULLANICI KAYIT EDİLMEK İSTENDİĞİNDE KULLANILICAK
public class SistemeKayitEt {
    //******************************************************************************************************
    //Nesne oluşturmaları
    Menu menu1 =new Menu();
    SistemdekiKullanicilar sistemdekiKullanicilar1 = new SistemdekiKullanicilar();
    //******************************************************************************************************
    //Özellik tanımlamaları
    private static String kullaniciAdi="";
    private static String sifre="";

    //******************************************************************************************************
    //Metot tanımlamaları


    private void sistemeKayitEt(){


        System.out.print("\n"+menu1.bosluk+"*> Sisteme kayıt edeceğiniz kullanıcı adı : ");
        kullaniciAdi = menu1.secimMetin();
        System.out.print("\n"+menu1.bosluk+"*> Sisteme kayıt edeceğiniz şifre : ");
        sifre =menu1.secimMetin();
        sistemdekiKullanicilar1.setKullanicilarMap(kullaniciAdi,sifre);
    }
    //******************************************************************************************************
    public void getSistemeKayitEt(AktifKullanici aktifKullanici){
        if(aktifKullanici.equals("Yönetici")){
            sistemeKayitEt();
        }else {
            System.out.println("Yetkiniz yoktur.");
        }

    }

}
