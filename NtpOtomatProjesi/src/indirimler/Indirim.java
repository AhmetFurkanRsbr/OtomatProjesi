package indirimler;

import aktifKullanici.Kullanici;

import static arayuzMenuleri.Menu.getOdenecekUcret;
import static arayuzMenuleri.Menu.setOdenecekUcret;
//Giriş yapan kullanıcıya özgü indirim işlemleri
public class Indirim {
    public static void indirimUygula(){

        if(Kullanici.getKullanici().equals("Yönetici")){
            setOdenecekUcret(0);
        } else if (Kullanici.getKullanici().equals("Çalışan") || Kullanici.getKullanici().equals("Teknik Ekip" )) {
            setOdenecekUcret(getOdenecekUcret() / 2);
        }else {
            setOdenecekUcret(getOdenecekUcret());
        }
    }
}
