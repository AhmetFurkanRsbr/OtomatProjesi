package arayuzMenuleri;

import aktifKullanici.Kullanici;
import kasa.AnlikKasaDurumu;
import sistemeGirisler.SistemdekiKullanicilar;
import urunler.StoguBitmekUzereUrunler;
import urunler.UrunStokDurumu;
import urunler.urunDurumlari.UrunEkle;
import uyarilar.AktifUyarilar;
import uyarilar.Uyarilar;
//Teknik ekip menüsüdür stok görüntüleme,ürün ekleme ... gibi yetkileri vardır.
public class TeknikEkipMenu extends Menu {
  //Nesne oluşturma işlemleri
  //******************************************************************************************************
    UrunEkle urunEkle1=new UrunEkle();
    UrunStokDurumu urunStokDurumu1= new UrunStokDurumu();
    SistemdekiKullanicilar sistemdekiKullanicilar1=new SistemdekiKullanicilar();
    StoguBitmekUzereUrunler stoguBitmekUzereUrunler1=new StoguBitmekUzereUrunler();
  //******************************************************************************************************
public void islemSonu(){
    System.out.print("\n **> YAPACAĞINIZ BAŞKA İŞLEM VAR MI ? \n\t( 1 -> Evet  /  0 -> Hayır ) : ");
    secim(1);
    if(secimSonucu==1){     //yapılacak işlem varsa buraya girer ve tekrardan kullanıcı menüsüne yönlendirir
        teknikEkipMenusu();
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

    public void teknikEkipMenusu(){
        temizle();
        secimSonucu=1;           //ilk girişte hatalı seçime yakalanmaması için verilmiştir sonradan değer sorgusuyla değişicek
        do {
            if(secimSonucu<=0 ){     //Eğer hatalı seçim yapılırsa girer ve uyarı mesajı verir
                System.out.println(bosluk+" *> SEÇİMİNİZ 0 'A EŞİT VEYA KÜÇÜK OLAMAZ");
                beklet();
            }

            else if(secimSonucu>5 ){    //Eğer hatalı seçim yapılırsa girer ve uyarı mesajı verir
                System.out.println(bosluk+" *> SEÇİMİNİZ 5 'DEN BÜYÜK OLAMAZ");
                beklet();
            }

            System.out.println("\n\n\t**************  Teknik Ekip  Ekranına HOŞGELDİNİZ  **************");
            System.out.print("\n\t 1-> Ürün Stoklarını Görüntüle");
            System.out.print("\n\t 2-> Stoğu Bitmeye Yakın Olan Ürünleri Görüntüle");
            System.out.print("\n\t 3-> Otomata Ürün Ekle");
            System.out.print("\n\t 4-> Otomattan Ürün Al");
            System.out.print("\n\t 5-> Anlık Kasa Durumunu Gör");
            System.out.println("\n\t 6-> Aktif Uyarıları Gör");
            System.out.println("\t 7-> Kullanıcı Çıkışı Yap");
            System.out.print("\t 8-> Sistemi Kapat\n\n");
            System.out.print(bosluk +"*> Seçiminiz ->");
            secim(8);

        }while (secimSonucu<=0 || secimSonucu>8);          //seçim sonucu 1-7 arasında bir değer değilse döngüde kalır ve tekrar sorgulama yapılır
         switch (secimSonucu){
            case 1:
                temizle();
                urunStokDurumu1.stoklariGoster();
                beklet();

                islemSonu();
                break;

            case 2:
                temizle();
                stoguBitmekUzereUrunler1.setStoguBitmekUzereOlanUrunler();
                stoguBitmekUzereUrunler1.getStoguBitmekUzereOlanUrunler();
                beklet();

                islemSonu();
                break;

            case 3:

                urunEkle1.getUrunEkle();
                beklet();

                islemSonu();
                break;

            case 4:
                //otomat ekranından devam eder
                kullaniciGirisiYapildi=1;
                sonrakiGiris=1;
                setIstenilenUrun("null");
                setOdenecekUcret(0);
                break;

            case 5:
                temizle();
                AnlikKasaDurumu.getKasaDurumuGoster();
                beklet();

                islemSonu();

                break;
             case 6:
                 temizle();
                 int aktifUyari=AktifUyarilar.getAktifUyari();
                 beklet();
                 if(aktifUyari>0) {
                     System.out.print("\n\n" + bosluk + " *> UYARI LİSTESİNİ TEMİZLEMEK İSTERMİSİNİZ ? (1-Evet / 0-Hayır) : ");
                     secim(1);
                     if (secimSonucu == 1) {
                         Uyarilar.uyarilarList1.clear();
                         Uyarilar.saptanamayanArizaList1.clear();
                     }
                 }

                 islemSonu();

                 break;


                case 7:

                System.out.println("\n\n******************  KULLANICI ÇIKIŞI YAPILIYOR  ******************");
                beklet();

                sonrakiGiris();
                break;


            case 8 :
                System.out.println("\n"+bosluk+"SİSTEM KAPATILIYOR........");
                beklet();

                System.exit(1);
                break;

            default:
        }

    }
}
