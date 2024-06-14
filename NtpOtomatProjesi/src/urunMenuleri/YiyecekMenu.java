package urunMenuleri;

import arayuzMenuleri.Menu;

//Yiyecek menüsünün bulunduğu kısım
public class YiyecekMenu extends Menu {
    //******************************************************************************************************
    //Nesne oluşturmaları
    UrunSecimleri secimler1=new UrunSecimleri();
    //******************************************************************************************************
    //Metot tanımlamaları
    private void yiyecekListesi(){
        System.out.println("\n\t************** Yiyecekler Listeleniyor **************");
        beklet();
        System.out.println("\n"+bosluk+"-> Sandaviç çeşitlerini görmek isterseniz '1' i tuşlayınız");
        System.out.println(bosluk +"-> Tost çeşitlerini görmek isterseniz '2' yi tuşlayınız");
        System.out.println(bosluk +"-> Pizza çeşitlerini görmek isterseniz '3' ü tuşlayınız");
        System.out.println(bosluk +"-> Nugget Sandaviç çeşitlerini görmek için '4' ü tuşlayınız");
        System.out.print("\n"+bosluk+"*> Seçiminiz : ");
    }
    public void yiyecekMenusu(){
        yiyecekListesi();//Yiyecek listesinin çağrılması
        secimler1.yiyecekSecimleri();//Seçilen yiyecek sonrasındaki süreç
    }
    //******************************************************************************************************
}
