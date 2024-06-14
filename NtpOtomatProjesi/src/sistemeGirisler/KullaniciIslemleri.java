package sistemeGirisler;

import aktifKullanici.AktifKullanici;
import aktifKullanici.Kullanici;
import arayuzMenuleri.AnaMenu;
import arayuzMenuleri.Menu;
import arayuzMenuleri.SistemeGirisMenu;

import java.util.Map;
//Kullanıcı hesaplarının bilgileri ..
public class KullaniciIslemleri extends Menu {
    //******************************************************************************************************
    //Nesne oluşturmaları
    SistemdekiKullanicilar sistemdekiKullanicilar1 = new SistemdekiKullanicilar();
    //******************************************************************************************************
    //Özellik tanımlamaları
    public static boolean kullaniciAdiSifreEslestiMi = false;
    boolean kullaniciAdiDogrulandi = false;
    boolean sifreDogrulandi = false;
    static String  kullaniciAdi="" ;
    //******************************************************************************************************
    //Metot tanımlamaları

    public boolean kullaniciAdiSifreEslestiMi() {

        KullaniciIslemleri.kullaniciAdi = sistemdekiKullanicilar1.getKullaniciAdi();
        System.out.println("\n\t*> Kullanıcı Adı ve Şifre Sorgulama Başlatıldı\n");
        beklet();

        for (Map.Entry<String, String> kullanici : sistemdekiKullanicilar1.getKullanicilarMap().entrySet()) {

             if (kullanici.getKey().equals(kullaniciAdi)) {
                kullaniciAdiDogrulandi = true;
                System.out.println("\t*> KULLANICI ADI MEVCUT");
                beklet();
                if (kullanici.getValue().equals(sistemdekiKullanicilar1.getSifre())) {
                    sifreDogrulandi = true;
                    System.out.println("\t\t*> ŞİFRE EŞLEŞTİ");
                    kullaniciAdiSifreEslestiMi = true;

                        setKullaniciAdi(kullaniciAdi);
                        getKullaniciAdi();
                        Kullanici.setKullanici(kullaniciAdi);
                       AktifKullanici.setAktifKullaniciBelirle(kullaniciAdi);

                       sistemdekiKullanicilar1.kullanici1.setKullaniciGirisiYapildi(true);

                    break;
                }
            }
        }

        if (!kullaniciAdiDogrulandi) {
            System.out.println("\t !!! KULLANICI ADINIZ YANLIŞTIR !!!");
            kullaniciAdiSifreEslestiMi = false;
            beklet();

                AnaMenu anaMenu1=new  AnaMenu();
                anaMenu1.AnaMenuGoster();

        } else if (kullaniciAdiDogrulandi && !sifreDogrulandi) {
            System.out.println("\t !!! Şifreniz Kullanıcı Adınız ile Uyuşmadı !!!");
            kullaniciAdiSifreEslestiMi = false;
            beklet();
                AnaMenu anaMenu1=new  AnaMenu();
                anaMenu1.AnaMenuGoster();

        }


        beklet();
        return kullaniciAdiSifreEslestiMi;
    }

    //******************************************************************************************************

    //Setter & Getter
    public static String getKullaniciAdi() {
        return kullaniciAdi;
    }

    public static void setKullaniciAdi(String kullaniciAdi) {
        KullaniciIslemleri.kullaniciAdi = kullaniciAdi;
    }
    //******************************************************************************************************
}
