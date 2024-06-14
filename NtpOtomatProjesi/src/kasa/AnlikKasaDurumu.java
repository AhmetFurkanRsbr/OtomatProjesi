package kasa;

import uyarilar.ParasalUyari;
import uyarilar.SaptanamayanAriza;
import uyarilar.Uyari;
import uyarilar.Uyarilar;
//Otomatın kasasının durumu
public class AnlikKasaDurumu {
    //Nesne oluşturma
    Uyarilar uyarilar1=new Uyarilar();
    ParasalUyari parasalUyari1 = new ParasalUyari();
    //******************************************************************************************************
    //Özellik tanımlamaları
     private static int kasadaBulunanPara = 5000;
    //******************************************************************************************************
    //Metot tanımlamaları
    public void kasaDurumuGuncelle(int gelenpara){
        if(gelenpara>0){
            kasadaBulunanPara +=gelenpara;
        }
        else if(gelenpara<0 || kasadaBulunanPara<500 || kasadaBulunanPara<0 ) {
            uyarilar1.uyariOlustur(Uyari.arizaCesit.parasal,kasadaBulunanPara);
            parasalUyari1.parasalUyariGonder(Uyari.arizaCesit.parasal,kasadaBulunanPara);
        } else if (gelenpara>100) {
            SaptanamayanAriza.saptanamayanArizaOlustur();
        }
    }

    private static int kasaDurumuGoster(){

        return kasadaBulunanPara;
    }
    public static int getKasaDurumuGoster(){
        System.out.println("₺₺::::------------------:::: KASADA BULUNAN PARA ::::------------------::::₺₺");
        System.out.println("\n\t -->> KASADAKİ ANLIK PARA DURUMU --> "+kasadaBulunanPara+"₺");
        System.out.println("\n----------------------------------------------------------------------------\n");
        return kasaDurumuGoster();
    }

}
