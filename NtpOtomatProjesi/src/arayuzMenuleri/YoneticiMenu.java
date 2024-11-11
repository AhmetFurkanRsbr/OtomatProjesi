package arayuzMenuleri;

import aktifKullanici.AktifKullanici;
import aktifKullanici.Kullanici;
import sistemeGirisler.SistemdekiKullanicilar;
import sistemeGirisler.SistemdenKullaniciSil;
import sistemeGirisler.SistemeKayitEt;
import urunAlimYonelimleri.GunlukAlinanUrunSayisi;
import urunAlimYonelimleri.GunlukUrunAlimDurumlari;
//Yönetici Menüsüdür. Özel yetkileri vardır.
public class YoneticiMenu  extends  Menu{
    //******************************************************************************************************
    //Nesne oluşturma işlemleri
       SistemdekiKullanicilar sistemdekiKullanicilar1 =new SistemdekiKullanicilar();
       GunlukAlinanUrunSayisi gunlukAlinanUrunSayisi1= new GunlukAlinanUrunSayisi();
       GunlukUrunAlimDurumlari gunlukUrunAlimDurumlari1=new GunlukUrunAlimDurumlari();
    //******************************************************************************************************
    public void islemSonu(){
        System.out.print("\n **> YAPACAĞINIZ BAŞKA İŞLEM VAR MI ? \n\t( 1 -> Evet  /  0 -> Hayır ) : ");
        secim(1);
        if(secimSonucu==1){     //yapılacak işlem varsa buraya girer ve tekrardan kullanıcı menüsüne yönlendirir
            yoneticiMenusu();
        } else if (secimSonucu==0) {  //yapılacak işlem yoksa buraya girer ve önceki bilgileri sıfırlar, anamenüye yönlendirir
            sonrakiGiris();
        }
        else{
            do {
                System.out.println("\n!! 1 YADA 0 ı SEÇİNİZ !!");
                System.out.print(bosluk+"*> Seçiminiz : ");
                secim(1);
            }while (!(secimSonucu==0 || secimSonucu==1));
        }
    }
    public  void sonrakiGiris(){
        SistemdekiKullanicilar.setKullaniciAdi("null");
        kullaniciGirisiYapildi=0;
        sistemdekiKullanicilar1.setIstenilenUrun("null");
        Kullanici.setKullanici("YOK");
        sonrakiGiris=1;
        AnaMenu anaMenu1=new AnaMenu();
        anaMenu1.AnaMenuGoster();
    }

     public void yoneticiMenusu() {
        kullaniciGirisiYapildi=1;
        temizle();
        secimSonucu=1;
        do {
             if(secimSonucu<=0 ){
                 System.out.println(bosluk+" *> SEÇİMİNİZ 0 'DAN KÜÇÜK OLAMAZ");
                 beklet();
             }
             else if(secimSonucu>8 ){
                 System.out.println(bosluk+" *> SEÇİMİNİZ 8 'DEN BÜYÜK OLAMAZ");
                 beklet();
             }

            System.out.println("\n\n\t**************  Yönetici Ekranına HOŞGELDİNİZ  **************");
            System.out.print("\n\t 1-> Kullanıcıları Yetkileriyle Görüntüle");
            System.out.print("\n\t 2-> Bugün Alınan  Ürünleri Görüntüle");
            System.out.print("\n\t 3-> Kayıtlı Kullanıcıların Aldığı Ürünleri Görüntüle");
            System.out.print("\n\t 4-> Otomattan Ürün Al");
            System.out.print("\n\t 5-> Sisteme Kullanıcı Kayıt Et");
            System.out.print("\n\t 6-> Sistemden Kullanıcı Kaydı Sil");
            System.out.println("\n\t 7-> Kullanıcı Çıkışı Yap");
            System.out.print("\n\t 8-> Sistemi Kapat \n\n");
            System.out.print(bosluk +"*> Seçiminiz ->");
            secim(8);
        }while (secimSonucu<=0 || secimSonucu>8);
         switch (secimSonucu){
             case 1:
                 sistemdekiKullanicilar1.getkullaniciVeYetkileriGoster("Yönetici");
                 beklet();

                 islemSonu();
                 break;

             case 2:
                 gunlukAlinanUrunSayisi1.getGunlukAlinanUrunSayisiMap();
                 beklet();

                 islemSonu();
                 break;

             case 3:
                gunlukUrunAlimDurumlari1.gunlukUrunAlimDurumlariGoster();
                beklet();

                islemSonu();
                 break;

             case 4:

                 kullaniciGirisiYapildi=1;
                 Menu.sonrakiGiris=1;
                 secimSonucu=1;
                 setIstenilenUrun("null");

                 break;
             case 5:
               //Sisteme kullanıcı kayıt et
                  SistemeKayitEt sistemeKayitEt1 = new SistemeKayitEt();
                  sistemeKayitEt1.getSistemeKayitEt(AktifKullanici.getKullanici());

                 System.out.println("\n\n******************  KULLANICI KAYDI BAŞLATILDI  ******************");
                 beklet();

                 islemSonu();
                 break;
             case 6:
                 //Sistemden kullanıcı kaydı sil
                 SistemdenKullaniciSil sistemdenKullaniciSil1 = new SistemdenKullaniciSil();
                 sistemdenKullaniciSil1.kullaniciSil(AktifKullanici.getKullanici());

                 System.out.println("\n\n******************  KULLANICI KAYDI SİLİNİYOR  ******************");
                 beklet();

                 islemSonu();
                 break;
             case 7:
                 System.out.println("\n\n******************  KULLANICI ÇIKIŞI YAPILIYOR  ******************");
                 beklet();

                 sonrakiGiris();
                 break;

             case 8:
                 System.out.println("\n"+bosluk+"SİSTEM KAPATILIYOR........");
                 beklet();
                 System.exit(1);
                 break;

             default:

         }

    }
}
