package urunAlimYonelimleri;

import arayuzMenuleri.Menu;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//O gün içinde hangi kullanıcının hangi ürünü ve kaçtane aldığını kayıt altına alan ve gösteren kısım
public class GunlukUrunAlimDurumlari extends Menu {
    //******************************************************************************************************
    //Map tanımlamaları

  static   List<Integer> ucretList=new ArrayList<>();
  static   Map<String,List<Integer>> urunVeUcretMap= new HashMap<>();
  static   Map<String,Map<String,List<Integer>>> kAdiUrnUcrtMap=new HashMap<>();


  static   Map<String,Map< String, Map<String ,List<Integer> >>>  urunAlimDurumuMap=new HashMap<>();
    //******************************************************************************************************
    //Özellik tanımlamaları
    private static String  urunuAlanKisi="";
    private static String  aldigiUrun="";
    int sayac=1;
    public  void gunlukUrunAlimDurumlariGoster(){
       sayac=1;

       System.out.println("\n-----------------------------------  KULLANICI ÜRÜN ALIM DURUMLARI  -----------------------------------\n");
       System.out.println("\t-ALAN KİŞİ\t\t\t-YETKİSİ\t\t\t-ALDIĞI ÜRÜN\t\t\t-ALMA MİKTARI\t\t\t\n");
       urunAlimDurumuMap.forEach((urunuAlanKisi,kAdiUrnUcrtMap)->{

           kAdiUrnUcrtMap.forEach((urunuAlanYetki,urunVeUcretMap)->{

               urunVeUcretMap.forEach((aldigiUrun,ucretList)->{

                   System.out.println("\t"+sayac+" > "+urunuAlanKisi+"\t\t --> "+urunuAlanYetki+"\t\t --> "+aldigiUrun+"\t\t --> "+ucretList.size());
                     sayac++;
               });

           });

        });


        beklet();
    }

    public static String getUrunuAlanKisi() {
        return urunuAlanKisi;
    }

    public static void setUrunuAlanKisi(String urunuAlanKisi) {
        GunlukUrunAlimDurumlari.urunuAlanKisi = urunuAlanKisi;

    }

    public static String getAldigiUrun() {
        return aldigiUrun;
    }

    public static void setAldigiUrun(String aldigiUrun) {
        GunlukUrunAlimDurumlari.aldigiUrun = aldigiUrun;
    }

    public static void setUrunAlimDurumuMap(String urunuAlanKisi,String urunuAlanYetki,String aldigiUrun,int aldigiMiktar) {

        GunlukUrunAlimDurumlari.aldigiUrun = aldigiUrun;
        GunlukUrunAlimDurumlari.urunuAlanKisi = urunuAlanKisi;
        urunAlimDurumuMap.computeIfAbsent(urunuAlanKisi, k -> new HashMap<>())
                .computeIfAbsent(urunuAlanYetki, k -> new HashMap<>())
                .computeIfAbsent(aldigiUrun, k -> new ArrayList<>())
                .add(aldigiMiktar);

    }

}
