package urunAlimYonelimleri;

import java.util.HashMap;
import java.util.Map;

//O gün içinde alınan ürün sayısının kayıt altına alındığı sınıf
public class GunlukAlinanUrunSayisi {
    //******************************************************************************************************
    //Map tanımlamaları
    static Map<String,Integer> gunlukAlinanUrunSayisiMap =new HashMap<>();
    //******************************************************************************************************
    //Özellik tanımlamaları
    int sayac=1;
    private static int oncekiAlinmaMiktari=0;
    //******************************************************************************************************
    //Metot tanımlamaları
    public void setGunlukAlinanUrunSayisiMap(String alinanUrun){
        GunlukAlinanUrunSayisi.gunlukAlinanUrunSayisiMap.get(alinanUrun);

        if(GunlukAlinanUrunSayisi.gunlukAlinanUrunSayisiMap.containsKey(alinanUrun)){

            GunlukAlinanUrunSayisi.oncekiAlinmaMiktari = gunlukAlinanUrunSayisiMap.get(alinanUrun);

            gunlukAlinanUrunSayisiMap.put(alinanUrun,(oncekiAlinmaMiktari+1));

        } else {
            GunlukAlinanUrunSayisi.gunlukAlinanUrunSayisiMap.put(alinanUrun,1);
        }
    }

    public void getGunlukAlinanUrunSayisiMap(){
        if(!GunlukAlinanUrunSayisi.gunlukAlinanUrunSayisiMap.isEmpty()){
            System.out.println("\n\n\t**************  Günlük Alınan Ürünler Ve Alınma Miktarları  **************\n");
            GunlukAlinanUrunSayisi.gunlukAlinanUrunSayisiMap.forEach((alinanUrun,alinmaMiktari)->{
                System.out.println(sayac+"-"+alinanUrun+" Bugün alınma sayısı : "+alinmaMiktari);
                sayac++;
            });
            sayac=1;
        }else{
            System.out.println("\n\n\t!....  BUGÜN HENÜZ ÜRÜN ALIMI GERÇEKLEŞMEDİ  ....!");
        }
    }
    //******************************************************************************************************
}
