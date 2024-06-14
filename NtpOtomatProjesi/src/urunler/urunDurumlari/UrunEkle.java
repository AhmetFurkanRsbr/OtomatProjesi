package urunler.urunDurumlari;

import aktifKullanici.Kullanici;
import arayuzMenuleri.Menu;
import urunler.UrunStokDurumu;
import urunler.Urunler;
import urunler.icecek.Icecekler;
import urunler.tatli.Tatlilar;
import urunler.yiyecek.Yiyecekler;

import java.util.Map;

//Ürün adedi eklenmek istendiği kullanılan kısım
public class UrunEkle extends Urunler {
    UrunleriGoster urunleriGoster1=new UrunleriGoster();
    UrunStokDurumu urunStokDurumu1= new UrunStokDurumu();
    Menu menu1  = new Menu();

    //******************************************************************************************************
    //Özellik tanımlamaları
    String eklenilecekUrun = "null";
    int eklenenAdet = 0;
    static boolean izinDurumu = false;
    //******************************************************************************************************
    //Metot tanımlamaları


    public boolean urunEklemeIzni() {

        if (Kullanici.getKullanici().equals("Teknik Ekip")) {
            izinDurumu = true;
        } else {
            izinDurumu = false;
        }

        return izinDurumu;
    }
    private String urunIsminiBul(int secilenAdet){
          int sayac=1;

        for (Map.Entry<String,Integer> urun : UrunStokDurumu.getUrunStok().entrySet()) {

            if(secilenAdet==sayac){
                eklenilecekUrun=urun.getKey();
                return eklenilecekUrun;
            }
            sayac++;
        }

        return eklenilecekUrun;
    }

    private void urunEkle(){
        urunEklemeIzni();
      if(urunEklemeIzni()==true){
          boolean eklemeBasarili=false;
          do {
              urunleriGoster1.urunleriGoster();
              System.out.println("\n\n\t*> Hangi ürünün stoğunu güncellemek istiyorsunuz ? ");
              System.out.print("\n\t *> Seçiminiz : ");
              menu1.secim(28);
              if(menu1.secimSonucu!=0){

                  eklenilecekUrun = urunIsminiBul(menu1.secimSonucu);
                  System.out.println("\n\t*> Bu üründen kaç adet eklemek istiyorsunuz ? ");
                  System.out.print("\n\t *> Eklenilecek adet : ");
                  eklenenAdet = menu1.secim(60);

                  System.out.println("\n\tSEÇİLEN ÜRÜN EKLENİYOR........");
                  urunStokDurumu1.setUrunStokSayisi(eklenilecekUrun, eklenenAdet);
              eklemeBasarili=true;
              }
              else{
                  System.out.println("\n\t!!!  0 ı SEÇEMEZSİNİZ  !!!\n\n");
                  System.out.println("\t\t*>Tekrar deneyiniz");
              menu1.beklet();
              }

          }while (eklemeBasarili==false);
      }

    }

    public void getUrunEkle(){
        urunEkle();
    }


        //******************************************************************************************************

}