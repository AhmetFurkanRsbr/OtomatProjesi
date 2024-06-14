package urunMenuleri;

import arayuzMenuleri.Menu;

//İçeceklerin olduğu menü
public class IcecekMenu extends Menu {
    //******************************************************************************************************
    //Nesne oluşturmaları
    UrunSecimleri secimler1=new UrunSecimleri();
    //******************************************************************************************************
    //Metot tanımlamaları
    private void icecekListesi(){
        System.out.println("\n\n\t************** İçecekler Listeleniyor **************");
        beklet();
        System.out.println("\n"+bosluk+"1-> Sıcak Kahve türlerini gör"+"->(Ortalama fiyat 50-60 ₺)");
        System.out.println(bosluk +"2-> Soğuk Kahve türlerini gör"+"->(Ortalama fiyat 50-60 ₺)");
        System.out.println(bosluk +"3-> Meyvesuyu türlerini gör"+"->(Ortalama fiyat 15-20 ₺)");
        System.out.println(bosluk +"4-> Enerji içeceklerini gör"+"->(Ortalama fiyat 30-40 ₺)");
        System.out.println(bosluk +"5-> Su al"+"->(Fiyat 7₺)");
        System.out.print("\n"+bosluk+"*> Seçiminiz : ");
    }
    public void icecekMenusu(){

        icecekListesi();//İçecek listesi bu metottan yönlendirilir
        secimler1.icecekSecimleri();//yapılan içcecek seçiminden sonra ürünün alınma işlemine yönlendirilmesi

    }
    //******************************************************************************************************
}
