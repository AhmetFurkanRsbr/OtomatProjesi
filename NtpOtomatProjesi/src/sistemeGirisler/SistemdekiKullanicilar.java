package sistemeGirisler;

import aktifKullanici.Kullanici;
import arayuzMenuleri.Menu;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
//Sisteme kayıtlı olan kullanıcıların şifreleri,kullanıcı adları,yetkileri..
public class SistemdekiKullanicilar extends Menu{
    //******************************************************************************************************
    //Nesne oluşturmaları
    Kullanici kullanici1 =new Kullanici();
    //******************************************************************************************************
    //Map tanımlamaları
    private static  Map <String,String> kullanicilarMap =new HashMap<>();
    private static  Map <String,String> kullanicilarYetkileriyleMap =new HashMap<>();

    //******************************************************************************************************
    //Özellik Tanımlamaları
    private  static String kullaniciKonumu="";
    private  static String kullaniciAdi="";
    private  static String sifre="";

    //******************************************************************************************************
    //Metot tanımlamaları
    public static void sistemeKullanicilariYukle(){
    kullanicilarMap.put("yonetici1","asd123");
    kullanicilarMap.put("yonetici2","asd1234");
    kullanicilarMap.put("ahmet_frk","453frkn");
    kullanicilarMap.put("kerim43","63krm");
    kullanicilarMap.put("2mhmt5","25mehmet_");
    kullanicilarMap.put("osmn5","os_man52");
    kullanicilarMap.put("melek32","324mlk");
    kullanicilarMap.put("ipek2","ipk_2");
    kullanicilarMap.put("sevval_yldrm","svl132");


    kullanicilarYetkileriyleMap.put("yonetici1","Yönetici");
    kullanicilarYetkileriyleMap.put("yonetici2","Yönetici");
    kullanicilarYetkileriyleMap.put("ahmet_frk","Çalışan");
    kullanicilarYetkileriyleMap.put("kerim43","Teknik Ekip");
    kullanicilarYetkileriyleMap.put("2mhmt5","Çalışan");
    kullanicilarYetkileriyleMap.put("osmn5","Çalışan");
    kullanicilarYetkileriyleMap.put("melek32","Teknik Ekip");
    kullanicilarYetkileriyleMap.put("ipek2","Çalışan");
    kullanicilarYetkileriyleMap.put("sevval_yldrm","Teknik Ekip");

}

    private void kullaniciVeYetkileriGoster(){
        sistemeKullanicilariYukle();
        System.out.println("\n\n\t**************  SİSTEME KAYITLI KULLANICILAR LİSTELENİYOR  **************");
        System.out.println(bosluk+bosluk+"\t/././././././././././././././././././././");

        System.out.println(bosluk +"-----------------------------------------------------------------");
        SistemdekiKullanicilar.kullanicilarYetkileriyleMap.forEach((kullaniciAdi, kullaniciKonumu) -> {
            System.out.println(bosluk +" Kullanıcı-Adı : "+kullaniciAdi+" -> Yetki durumu : "+kullaniciKonumu);
        });
        System.out.println(bosluk +"-----------------------------------------------------------------\n");
        System.out.println(bosluk +"*> Kullannıcılar yetkileyile yöneticiye gösterildi.");

    }
    public void kullaniciGoster() {
        int sayac=1;
        sistemeKullanicilariYukle();
        System.out.println("\n"+bosluk +"*> Kullanıcılar sisteme yüklendi.");
        System.out.println("-------------------------------------------------------");
        SistemdekiKullanicilar.kullanicilarMap.forEach((kullaniciAdi, sifre) -> {
            System.out.println(" Kullanıcı-Adı : "+kullaniciAdi);
        });
        System.out.println("-------------------------------------------------------");
        System.out.println(bosluk +"*> Kullarnıcılar sisteme gösterildi.");
    }
    //******************************************************************************************************
    //Setter & Getter

    public void setKullanicilarMap(String kullaniciAdi,String sifre) {

        kullanicilarMap.put(kullaniciAdi,sifre);
    }

    public Map<String, String> getKullanicilarMap() {
        return kullanicilarMap;
    }

    public void getkullaniciVeYetkileriGoster(String yetkiDurumu){
         kullaniciKonumu = kullanici1.getKullanici();

        if(yetkiDurumu.equals("Yönetici")){
            kullaniciVeYetkileriGoster();
        } else if (!yetkiDurumu.equals("Yönetici")){

            System.out.println("\n" +bosluk+"*> KULLANICI LİSTESİNİ GÖRMEK İÇİN YÖNETİCİ GİRİŞİ YAPMALISINIZ");
            System.out.println("Aktif kullanıcı : " + kullaniciKonumu);
        }
    }
    public static void setKullaniciAdi(String kullaniciAdi) {
        SistemdekiKullanicilar.kullaniciAdi = kullaniciAdi;
    }
    public  String getSifre() {
        return sifre;
    }

    public static void setSifre(String sifre) {
        SistemdekiKullanicilar.sifre = sifre;
    }

    public  String getKullaniciAdi() {
        return kullaniciAdi;
    }
    public static Map<String, String> getKullanicilarYetkileriyleMap() {
        return kullanicilarYetkileriyleMap;
    }

    public static void setKullanicilarYetkileriyleMap(Map<String, String> kullanicilarYetkileriyleMap) {
        SistemdekiKullanicilar.kullanicilarYetkileriyleMap = kullanicilarYetkileriyleMap;
    }
//******************************************************************************************************
}

