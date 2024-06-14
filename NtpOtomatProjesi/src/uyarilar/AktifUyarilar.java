package uyarilar;

//Aktif olarak bekleyen uyarılar
public class AktifUyarilar {
  public static int aktifUyari=(Uyarilar.uyarilarList1.size()+Uyarilar.saptanamayanArizaList1.size());
  static int sayac;
    private static void aktifUyari(){
        sayac=1;

        if(aktifUyari!=0){
            System.out.println("\n\n-------------------------  AKTİF UYARILAR LİSTELENİYOR  ---------------------\n");
            System.out.println("\t*> AKTİF UYARI SAYISI : "+aktifUyari);
            System.out.println("\t--- Uyarı Türü ---\n");
            Uyarilar.uyarilarList1.forEach( uyari ->{

                System.out.println(sayac+" -) "+uyari);
            sayac++;
            });
            System.out.println("--------------------------------------------------------------------------------");
             if(Uyarilar.saptanamayanArizaList1.size()>0){
                 System.out.println("\n\n\t---------------------  SAPTANAMAYAN UYARILAR LİSTELENİYOR  ---------------------\n");
                 System.out.println("\t*> AKTİF SAPTANAMAYAN UYARI SAYISI : "+(aktifUyari-(Uyarilar.uyarilarList1.size())));
                 System.out.println("--------------------------------------------------------------------------------");
            }
        } else {
            System.out.println("\t\t *> AKTİF UYARI MEVCUT DEĞİL");
        }
    }

    public static int getAktifUyari() {

        aktifUyari=(Uyarilar.uyarilarList1.size()+Uyarilar.saptanamayanArizaList1.size());
        aktifUyari();

        return aktifUyari;
    }
}
