package arayuzMenuleri;

import aktifKullanici.Kullanici;
import aktifKullanici.KullaniciYetkisineGoreYonlendirme;
import satis.UrunSatisIslemi;
import sistemeGirisler.KullaniciIslemleri;
import sistemeGirisler.SistemdekiKullanicilar;
import urunMenuleri.IcecekMenu;
import urunMenuleri.TatliMenu;
import urunMenuleri.YiyecekMenu;
import urunler.UrunStokDurumu;
import urunler.urunDurumlari.UrunAdediGuncelle;
import uyarilar.UrunBitti;
import uyarilar.Uyari;
import uyarilar.Uyarilar;
import yonetim.TeknikEkip;
import yonetim.Yonetici;
import yonetim.Yonetim;

public class AnaMenu extends Menu {
    //******************************************************************************************************
    //Nesne oluşturmaları
    SistemdekiKullanicilar sistemdekiKullanicilar1 =new SistemdekiKullanicilar();
    KullaniciYetkisineGoreYonlendirme kullaniciYetkisineGoreYonlendirme1=new KullaniciYetkisineGoreYonlendirme();

    KullaniciIslemleri kullaniciIslemleri1= new KullaniciIslemleri();
    public IcecekMenu menu1 = new IcecekMenu();
    YiyecekMenu menu2=new YiyecekMenu();
    TatliMenu menu3= new TatliMenu();
    UrunStokDurumu urunStokDurumu1= new UrunStokDurumu();
    UrunSatisIslemi urunSatisIslemi =new UrunSatisIslemi();
    Uyarilar uyarilar1= new Uyarilar();
    UrunAdediGuncelle urunAdediGuncelle1= new UrunAdediGuncelle();


    //******************************************************************************************************

    //Özellik tanımları
    int alisTercihi=0;
    static boolean  urunStokDurumu =false;
    static String kullaniciAdi="null";
    static int satinAlimi=-1;
    //******************************************************************************************************

    //Metot tanımları
    public void AnaMenuGoster(){

            temizle();//Ekranı 50 satır aşağı kaydırır üsteki görüntüleri görünürden yok etmiş olur.
            yonlendirme();//Sistemin anasayfasına yönlendirir ordaki adımlar ile yönlendirme devam eder.

            if(kullaniciGirisiYapildi==1){
                kullaniciIslemleri1.kullaniciAdiSifreEslestiMi();
                kullaniciAdi=KullaniciIslemleri.getKullaniciAdi();

                System.out.println("\n\t *> KULLANICI YETKİSİ  : "+Kullanici.getKullanici());
                if(Kullanici.getKullanici().equals("Teknik Ekip")){

                    TeknikEkip yetkili2 =new TeknikEkip(kullaniciAdi);
                } else if (Kullanici.getKullanici().equals("Yönetici")) {
                    Yonetici yetkili1 =new Yonetici(kullaniciAdi, sistemdekiKullanicilar1.getSifre());

                }
                beklet();
                kullaniciYetkisineGoreYonlendirme1.kullaniciYetkisineGoreMenuyeYonlendir();

            }
            else {
                kullaniciAdi=KullaniciIslemleri.getKullaniciAdi();
            }



        do {
            System.out.println("\n\n\n\t************** Otomat Sistemine Hoşgeldiniz **************");
            System.out.println("\n" + bosluk + "-> İçecek almak için '1' i tuşlayınız");
            System.out.println(bosluk + "-> Yiyecek almak için '2' yi tuşlayınız");
            System.out.println(bosluk + "-> Tatlı almak için '3' ü tuşlayınız");
            System.out.println(bosluk + "-> Ana menüye dönmek için '4' ü tuşlayınız");
            if(kullaniciGirisiYapildi==1 && (Kullanici.getKullanici().equals("Yönetici") || Kullanici.getKullanici().equals("Teknik Ekip") )){
                System.out.println(bosluk + "-> Sistemi kapatmak için '5' i tuşlayınız");
                System.out.println(bosluk + "-> Yetki Ekranınıza Gitmek için '6'yı  tuşlayınız\n");
                System.out.print(bosluk+"*> Seçiminiz : ");
                secim(6);
            } else{
                System.out.print("\n"+bosluk+"*> Seçiminiz : ");
                secim(4);
            }

            switch (secimSonucu) {
                case 1:
                    temizle();
                    System.out.println("\n"+bosluk + "*>Hangi tür içeceği istiyorsunuz?");
                    menu1.icecekMenusu();
                    sonrakiGiris =0;
                    break;
                case 2:
                    temizle();
                    System.out.println(bosluk + "*>Hangi tür Yiyeceği istiyorsunuz?");
                    menu2.yiyecekMenusu();
                    sonrakiGiris =0;
                    break;
                case 3:
                    temizle();
                    System.out.println(bosluk + "*>Hangi tür Tatlıyı istiyorsunuz?");
                    menu3.tatliMenusu();
                    sonrakiGiris =0;
                    break;

                case 4://Sistemden çıkış
                    temizle();
                    System.out.println("\n\n"+bosluk + "/./././././ ANAMENÜYE DÖNÜLÜYOR /./././././");
                    Kullanici.setKullanici("YOK");
                    kullaniciIslemleri1.setIstenilenUrun("");
                    kullaniciGirisiYapildi=0;

                    AnaMenuGoster();
                    break;


                case 5://Sistemden çıkış
                    temizle();
                    System.out.println(bosluk + "/./././././ SİSTEM KAPATILIYOR /./././././");
                    System.exit(1);
                    break;
                case 6:
                    kullaniciYetkisineGoreYonlendirme1.kullaniciYetkisineGoreMenuyeYonlendir();

                    break;
                default:         //Menüdeki seçeneklerden başka bir seçenek seçilirse(1,2,3,4 dışında).
                    do {
                        System.out.println(bosluk + "!!!  Hatalı secim işlemi yaptınız  !!!");
                        System.out.println(bosluk + bosluk + "Tekrar seçim yapınız");
                        beklet();    //Ekrandaki hata mesajlarının okunması için bir süre bekletildi.
                        if(kullaniciGirisiYapildi==1){
                            secim(5);
                        } else {secim(4);}
                    } while (!(1 <= secimSonucu || secimSonucu  <= 5));
            }

            beklet();//Belilri bir süre ekranda bekletme komutunun olduğu metotun çağrılması

            if(Menu.sonrakiGiris!=1){

                if(!getIstenilenUrun().equals("null")){
                    temizle();
                    System.out.println(bosluk + "*> Seçtiğiniz ürün : " + getIstenilenUrun());

                    beklet();
                    System.out.println("\n****************************-----------------------****************************\n");
                    System.out.println(bosluk+"-->"+getIstenilenUrun()+" Ürünün Stok Bilgisi Sorgulanıyor");
                    System.out.println("\n****************************-----------------------****************************\n");
                    beklet();


                    urunStokDurumu = urunStokDurumu1.getUrunStokDurumSorgula(istenilenUrun);
                    secimSonucu=1;

                    if (urunStokDurumu) {
                        System.out.println("\n****************************-----------------------****************************\n");
                        System.out.println(bosluk + "-->" + getIstenilenUrun() + " Ürünün Stoğu Mevcuttur");
                        System.out.println(bosluk + "-->" + getIstenilenUrun() + " Ürünü Verilmeye Hazırlanıyor.......");
                        System.out.println("\n****************************-----------------------****************************\n");

                        if(Kullanici.getKullanici().equals("Yönetici")) {
                            secimSonucu=1;
                        }

                        do {

                            if (secimSonucu < 0 || secimSonucu > 1) {
                                System.out.println("!!! LÜTFEN 0 YADA 1 İ SEÇİNİZ !!!");
                            }
                           else if(!Kullanici.getKullanici().equals("Yönetici")){
                                  do{

                                System.out.println(bosluk+bosluk+bosluk+" --> Ödenecek ücret : " + getOdenecekUcret() + "₺\n");
                                System.out.print(bosluk+" *> ÜCRET ALINDI MI ? (Evet için->1 / Hayır için->0)");
                                secim(1);
                                System.out.println("(normalde otomat buna cevap vericek ürün verimi ona göre gerçekleşicek)");
                                if (secimSonucu==1){

                                    urunSatisIslemi.urunSatisiniGerceklestir(getIstenilenUrun(),Kullanici.getKullanici(),sistemdekiKullanicilar1.getKullaniciAdi(),odenecekUcret);
                                    urunAdediGuncelle1.urunStokAzalt(istenilenUrun,urunStokDurumu1.getUrunStokSayisi(getIstenilenUrun()));     //Urunler.getUrunStokSayisi()

                                    satinAlimi=0;

                                } else if (secimSonucu==0) {

                                        System.out.println("\n\n"+bosluk+"*> PARA ALIMI GERÇEKLEŞMEDİ ");
                                        System.out.println(bosluk+"-: Parayı vermeyi tekrar denemek için 1 'E BASINIZ");
                                        System.out.println(bosluk+"!! İŞLEMİ İPTAL ETMEK İÇİN -> 0 'A BASINIZ !!");
                                        beklet();
                                        satinAlimi = secim(1);

                                }}while(satinAlimi!=0);

                            }
                            else if(Kullanici.getKullanici().equals("Yönetici") ){
                                urunSatisIslemi.urunSatisiniGerceklestir(getIstenilenUrun(),Kullanici.getKullanici(),sistemdekiKullanicilar1.getKullaniciAdi(),odenecekUcret);
                                urunAdediGuncelle1.urunStokAzalt(istenilenUrun,urunStokDurumu1.getUrunStokSayisi(getIstenilenUrun()));     //Urunler.getUrunStokSayisi()

                                satinAlimi=0;
                            }

                        } while (satinAlimi!=0);        //(secimSonucu < 0 || secimSonucu > 1)

                        beklet();
                    } else {
                        System.out.println("\n****************************-----------------------****************************\n");
                        System.out.println(bosluk + "-->" + getIstenilenUrun() + " Ürünün Stoğu mevcut değil");
                        System.out.println(bosluk + "-->Üzgünüz, ürün şu an stokta bulunmamaktadır.");
                        System.out.println("\n****************************-----------------------****************************\n");
                        uyarilar1.uyariOlustur(Uyari.arizaCesit.urunBitti);

                        UrunBitti.urunBittiUyari(istenilenUrun);
                        beklet();
                    }

                }
                System.out.print("\n Otomattaki İşleminiz Bitti mi? (Evet için->1 / Hayır için->0) : ");

                beklet();
                alisTercihi = secim(1);
            }

            if(alisTercihi==1){
                kullaniciGirisiYapildi=0;
                setIstenilenUrun("null");
                SistemdekiKullanicilar.setKullaniciAdi("null");
                Kullanici.setKullanici("YOK");

                AnaMenuGoster();
            }

        }while(true);

    }

    //******************************************************************************************************
}
