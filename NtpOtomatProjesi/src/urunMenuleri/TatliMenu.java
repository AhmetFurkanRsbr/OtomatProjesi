package urunMenuleri;

import arayuzMenuleri.Menu;

//Tatlı menüsünün bulunduğu kısım
public class TatliMenu extends Menu {
    //******************************************************************************************************
    //Nesne oluşturmaları
    UrunSecimleri urunSecimleri1 =new UrunSecimleri();
    //******************************************************************************************************
    //Metot tanımlamaları
    private void tatliListesi(){
        System.out.println("\n\t************** Tatlılar Listeleniyor **************");
        beklet();
        System.out.println("\n"+bosluk+"-> Çikolatalı tatlıları görmek isterseniz '1' i tuşlayınız");
        System.out.println(bosluk +"-> Sütlü tatlıları görmek isterseniz '2' yi tuşlayınız");
        System.out.print("\n"+bosluk+"*> Seçiminiz : ");
    }
    public void tatliMenusu(){
        tatliListesi();//Tatlı listesi bu metottan çağrılır
        urunSecimleri1.tatliSecimleri();//Alınması istenen tatlının seçim işlemi sonrasındaki yönlendirme süreci

    }
    //******************************************************************************************************
}
