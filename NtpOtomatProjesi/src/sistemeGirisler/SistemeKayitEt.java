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
    private static String kullaniciYetki="";
    private boolean isKullaniciYetkiYanlis=true;

    //******************************************************************************************************
    //Metot tanımlamaları


    private void sistemeKayitEt() {


        System.out.print("\n" + menu1.bosluk + "*> Sisteme kayıt edeceğiniz kullanıcı adı : ");
        kullaniciAdi = menu1.secimMetin();
        System.out.print("\n" + menu1.bosluk + "*> Sisteme kayıt edeceğiniz şifre : ");
        sifre = menu1.secimMetin();

    do{
        System.out.print("\n" + menu1.bosluk + "*> Kayıt edilen kişinin yetkisi(Yönetici / Çalışan / Teknik Ekip) : ");
        kullaniciYetki = menu1.secimMetin();
        if(kullaniciYetki.equals("Yönetici") || kullaniciYetki.equals("Çalışan")  || kullaniciYetki.equals("Teknik Ekip") ){
            isKullaniciYetkiYanlis=false;
        }else{
            isKullaniciYetkiYanlis=true;
            System.out.print("\n\t" + menu1.bosluk + "*>  !! Kayıt edilen kişinin yetkisi yanlış girildi!! ");
        }
    }while(isKullaniciYetkiYanlis);

        sistemdekiKullanicilar1.getKullanicilarMap().putIfAbsent(kullaniciAdi,sifre);
        sistemdekiKullanicilar1.getKullanicilarYetkileriyleMap().putIfAbsent(kullaniciAdi,kullaniciYetki);
    }
    //******************************************************************************************************
    public void getSistemeKayitEt(String aktifKullanici){
        if(aktifKullanici.equals("Yönetici")){
            sistemeKayitEt();
        }else {
            System.out.println("Yetkiniz yoktur.");
        }

    }

}
