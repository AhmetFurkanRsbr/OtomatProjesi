package sistemeGirisler;

import aktifKullanici.AktifKullanici;
import arayuzMenuleri.Menu;
//Sistemdeki kullanıcılardan birini silmek istenirse kullanıclak kısım.
//KULLANILMIYOR ŞUANDA EĞER KİŞİ SİLMEK İSTENİRSE KULLANILIR
public class SistemdenKullaniciSil extends Menu {
    SistemdekiKullanicilar sistemdekiKullanicilar1=new  SistemdekiKullanicilar();
    public void kullaniciSil(AktifKullanici aktifKullanici){
        if(aktifKullanici.equals("Yönetici")){
            System.out.println("\n\t------------------  Silmek istediğiniz kullanıcı hangisidir ?  ------------------");
            sistemdekiKullanicilar1.kullaniciGoster();
            System.out.print("SİLİNECEK KİŞİNİN KULLANICI ADI : ");
            String silinecekKisi=secimMetin();
            sistemdekiKullanicilar1.getKullanicilarMap().remove(silinecekKisi);
        }else {
            System.out.println("Silmek için yetkiniz yoktur.");
        }

    }
}
