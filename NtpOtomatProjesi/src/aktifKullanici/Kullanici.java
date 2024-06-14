package aktifKullanici;

public class Kullanici {
    //******************************************************************************************************
    //Nesne oluşturmaları
    private static String kullanici ="YOK";
    boolean kullaniciGirisiYapildi=false;


    //******************************************************************************************************
    //Setter & Getter

    public void setKullaniciGirisiYapildi(boolean kullaniciGirisiYapildi) {
        this.kullaniciGirisiYapildi = kullaniciGirisiYapildi;
    }
    public static void setKullanici(String kullanici) {

        Kullanici.kullanici = kullanici;
    }

    public static String getKullanici() {

        return Kullanici.kullanici;
    }
    //******************************************************************************************************
}
