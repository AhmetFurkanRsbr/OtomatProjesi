package urunMenuleri;

import aktifKullanici.Kullanici;
import arayuzMenuleri.*;
import indirimler.Indirim;

//Hangi ürünün alıncağının seçilmesi işlemi
public class UrunSecimleri extends Menu {
    //******************************************************************************************************
    //Metot tanımlamaları
    public void icecekSecimleri(){

         secim(4);

        switch (secimSonucu){
            case 1:
                System.out.println("\n\n\n\t************** Sıcak İçecekler Listeleniyor **************");
                System.out.println("\n"+bosluk+"1-> ESPRESSO almak isterseniz '1' i tuşlayınız"+"->(Fiyat 55₺)");
                System.out.println(bosluk +"2-> TÜRK KAHVESİ almak isterseniz '2' yi tuşlayınız"+"->(Fiyat 35₺)");
                System.out.println(bosluk +"3-> LATTE almak isterseniz '3' ü tuşlayınız"+"->(Fiyat 50₺)");
                System.out.println(bosluk +"4-> Çay almak isterseniz '4' ü tuşlayınız"+"->(Fiyat 9₺)");
                System.out.print("\n"+bosluk+"*> Seçiminiz : ");
                secim(4);
                  switch (secimSonucu){
                      case 1:
                          setIstenilenUrun("ESPRESSO");
                          setOdenecekUcret(55);
                          Indirim.indirimUygula();

                          break;
                      case 2:
                          setIstenilenUrun("TÜRK KAVHESİ");
                          setOdenecekUcret(35);

                          Indirim.indirimUygula();
                          break;
                      case 3:
                          setIstenilenUrun("LATTE");
                          setOdenecekUcret(50);

                          Indirim.indirimUygula();
                          break;
                      case 4:
                          setIstenilenUrun("ÇAY");
                          setOdenecekUcret(9);

                          Indirim.indirimUygula();
                          break;
                      default:
                          do {
                              System.out.println("!!!!!!  HATALI SEÇİM  !!!!!!");
                              System.out.println("*> TEKRAR SEÇİM YAPINIZ <*");
                              System.out.print("\n"+bosluk+"*> Seçiminiz : ");
                              secim(4);
                          }while (!(1<=secimSonucu && secimSonucu<=4));
                  }
                break;

            case 2:
                System.out.println("\n\n\n\t************** Soğuk Kahveler Listeleniyor **************");
                System.out.println("\n"+bosluk+"1-> ICE MOCHA al"+"->(Fiyat 60₺)");
                System.out.println(bosluk +"2-> FRAPPE al"+"->(Fiyat 50₺)");
                System.out.println(bosluk +"3-> COLD BREW al"+"->(Fiyat 45₺)");
                System.out.print("\n"+bosluk+"*> Seçiminiz : ");
                secim(3);
                switch (secimSonucu){
                    case 1:
                        setIstenilenUrun("ICE MOCHA");
                        setOdenecekUcret(55);
                       Indirim.indirimUygula();
                        break;
                    case 2:
                        setIstenilenUrun("FRAPPE");
                        setOdenecekUcret(50);
                       Indirim.indirimUygula();
                        break;
                    case 3:
                        setIstenilenUrun("COLD BREW");
                        setOdenecekUcret(45);
                       Indirim.indirimUygula();
                        break;
                    default:
                        do {
                            System.out.println("!!!!!!  HATALI SEÇİM  !!!!!!");
                            System.out.println("*> TEKRAR SEÇİM YAPINIZ <*");
                            System.out.print("\n"+bosluk+"*> Seçiminiz : ");
                            secim(3);
                        }while (!(1<=secimSonucu && secimSonucu<=3));
                }
                break;
            case 3:
                System.out.println("\n\n\n\t************** Meyvesuyu Çeşitleri Listeleniyor **************");
                System.out.println("\n"+bosluk+"1-> KAYISI MEYVE SUYU al"+"->(Fiyat 20₺)");
                System.out.println(bosluk +"2-> KARIŞIK MEYVE SUYU al"+"->(Fiyat 20₺)");
                System.out.println(bosluk +"3-> VİŞNE MEYVE SUYU al"+"->(Fiyat 20₺)");
                System.out.print("\n"+bosluk+"*> Seçiminiz : ");

                secim(3);
                switch (secimSonucu){
                    case 1:
                        setIstenilenUrun("KAYISI MEYVE SUYU");
                        setOdenecekUcret(20);
                       Indirim.indirimUygula();
                        break;
                    case 2:
                        setIstenilenUrun("KARIŞIK MEYVE SUYU");
                        setOdenecekUcret(20);
                       Indirim.indirimUygula();
                        break;
                    case 3:
                        setIstenilenUrun("VİŞNE MEYVE SUYU");
                        setOdenecekUcret(20);
                       Indirim.indirimUygula();
                        break;
                    default:
                        do {
                            System.out.println("!!!!!!  HATALI SEÇİM  !!!!!!");
                            System.out.println("*> TEKRAR SEÇİM YAPINIZ <*");
                            System.out.print("\n"+bosluk+"*> Seçiminiz : ");
                            secim(3);
                        }while (!(1<=secimSonucu && secimSonucu<=3));
                }
                break;
            case 4:
                System.out.println("\n\n\n\t************** Enerji İçecekleri Listeleniyor **************");
                System.out.println("\n"+bosluk+"1-> RED BULL ENERJİ İÇECEĞİ al"+"->(Fiyat 30₺)");
                System.out.println(bosluk +"2-> MONSTER ENERJİ İÇECEĞİ al"+"->(Fiyat 35₺)");
                System.out.print("\n"+bosluk+"*> Seçiminiz : ");

                secim(2);
                switch (secimSonucu){
                    case 1:
                        setIstenilenUrun("RED BULL");
                        setOdenecekUcret(30);
                        Indirim.indirimUygula();
                        break;
                    case 2:
                        setIstenilenUrun("MONSTER");
                        setOdenecekUcret(35);
                       Indirim.indirimUygula();
                        break;
                    default:
                        do {
                            System.out.println("!!!!!!  HATALI SEÇİM  !!!!!!");
                            System.out.println("*> TEKRAR SEÇİM YAPINIZ <*");
                            System.out.print("\n"+bosluk+"*> Seçiminiz : ");
                            secim(2);
                        }while (!(1<=secimSonucu && secimSonucu<=2));
                }
                break;
            case 5:
                setIstenilenUrun("SU");
                setOdenecekUcret(7);
                Indirim.indirimUygula();
                break;

            default:
                do {
                    System.out.println("!!!!!!  HATALI SEÇİM  !!!!!!");
                    System.out.println("*> TEKRAR SEÇİM YAPINIZ <*");
                    System.out.print("\n"+bosluk+"*> Seçiminiz : ");
                    secim(5);
                }while (!(1<=secimSonucu && secimSonucu<=5));
        }
    }
    public void yiyecekSecimleri(){

        secim(4);

        switch (secimSonucu){
            case 1:
                System.out.println("\n\n\n\t************** Sandaviç Çeşitleri Listeleniyor **************");
                System.out.println("\n"+bosluk+"1-> ZEYTİNLİ SANDAVİÇ al"+"->(Fiyat 15₺)");
                System.out.println(bosluk +"2-> KAŞARLI SANDAVİÇ al"+"->(Fiyat 15₺)");
                System.out.println(bosluk +"3-> SALAMLI SANDAVİÇ al"+"->(Fiyat 25₺)");
                System.out.println(bosluk +"4-> PEYNİRLİ SANDAVİÇ al"+"->(Fiyat 20₺)");
                System.out.print("\n"+bosluk+"*> Seçiminiz : ");

                secim(4);
                switch (secimSonucu){
                    case 1:
                        setIstenilenUrun("ZEYTİNLİ SANDAVİÇ");
                        setOdenecekUcret(15);
                        Indirim.indirimUygula();
                        break;
                    case 2:
                        setIstenilenUrun("KAŞARLI SANDAVİÇ");
                        setOdenecekUcret(15);
                       Indirim.indirimUygula();
                        break;
                    case 3:
                        setIstenilenUrun("SALAMLI SANDAVİÇ");
                        setOdenecekUcret(25);
                      Indirim.indirimUygula();
                        break;
                    case 4:
                        setIstenilenUrun("PEYNİRLİ SANDAVİÇ");
                        setOdenecekUcret(20);
                        Indirim.indirimUygula();
                        break;
                    default:
                        do {
                            System.out.println("!!!!!!  HATALI SEÇİM  !!!!!!");
                            System.out.println("*> TEKRAR SEÇİM YAPINIZ <*");
                            System.out.print("\n"+bosluk+"*> Seçiminiz : ");

                            secim(4);
                        }while (!(1<=secimSonucu && secimSonucu<=4));

                }
                break;

            case 2:
                System.out.println("\n\n\n\t************** Tost Çeşitleri Listeleniyor **************");
                System.out.println("\n"+bosluk+"1-> KAŞARLI TOST al"+"->(Fiyat 20₺)");
                System.out.println(bosluk +"2-> SUCUKLU TOST al"+"->(Fiyat 30₺)");
                System.out.print("\n"+bosluk+"*> Seçiminiz : ");

                secim(2);
                switch (secimSonucu){
                    case 1:
                        setIstenilenUrun("KAŞARLI TOST");
                        setOdenecekUcret(20);
                       Indirim.indirimUygula();
                        break;
                    case 2:
                        setIstenilenUrun("SUCUKLU TOST");
                        setOdenecekUcret(30);
                        Indirim.indirimUygula();
                        break;
                    default:
                        do {
                            System.out.println("!!!!!!  HATALI SEÇİM  !!!!!!");
                            System.out.println("*> TEKRAR SEÇİM YAPINIZ <*");
                            System.out.print("\n"+bosluk+"*> Seçiminiz : ");
                            secim(2);
                        }while (!(1<=secimSonucu && secimSonucu<=2));
                }
                break;
            case 3:
                System.out.println("\n\n\n\t************** Pizza Çeşitleri Listeleniyor **************");
                System.out.println("\n"+bosluk+"1-> MARGARİTA PİZZA al"+"->(Fiyat 40₺)");
                System.out.println(bosluk +"2-> PEPPERONİ PİZZA al"+"->(Fiyat 35₺)");
                System.out.print("\n"+bosluk+"*> Seçiminiz : ");

                secim(2);
                switch (secimSonucu){
                    case 1:
                        setIstenilenUrun("MARGARİTA PİZZA");
                        setOdenecekUcret(40);
                       Indirim.indirimUygula();
                        break;
                    case 2:
                        setIstenilenUrun("PEPPERONİ PİZZA");
                        setOdenecekUcret(35);
                        Indirim.indirimUygula();
                        break;

                    default:
                        do {
                            System.out.println("!!!!!!  HATALI SEÇİM  !!!!!!");
                            System.out.println("*> TEKRAR SEÇİM YAPINIZ <*");
                            System.out.print("\n"+bosluk+"*> Seçiminiz : ");
                            secim(2);
                        }while (!(1<=secimSonucu && secimSonucu<=2));
                }
                break;
            case 4:
                System.out.println("\n\n\n\t************** Nugget Sandaviç Çeşitleri Listeleniyor **************");
                System.out.println("\n"+bosluk+"1-> NUGGET SANDAVİÇ al"+"->(Fiyat 40₺)");
                System.out.println(bosluk +"2-> PATETES & NUGGET SANDAVİÇ al"+"->(Fiyat 50₺)");
                System.out.print("\n"+bosluk+"*> Seçiminiz : ");

                secim(2);
                switch (secimSonucu){
                    case 1:
                        setIstenilenUrun("NUGGET SANDAVİÇ");
                        setOdenecekUcret(40);
                        Indirim.indirimUygula();
                        break;
                    case 2:
                        setIstenilenUrun("PATETES & NUGGET SANDAVİÇ");
                        setOdenecekUcret(50);
                        Indirim.indirimUygula();
                        break;
                    default:
                        do {
                            System.out.println("!!!!!!  HATALI SEÇİM  !!!!!!");
                            System.out.println("*> TEKRAR SEÇİM YAPINIZ <*");
                            System.out.print("\n"+bosluk+"*> Seçiminiz : ");
                            secim(2);
                        }while (!(1<=secimSonucu && secimSonucu<=2));
                }
                break;

            default:
                do {
                    System.out.println("!!!!!!  HATALI SEÇİM  !!!!!!");
                    System.out.println("*> TEKRAR SEÇİM YAPINIZ <*");
                    System.out.print("\n"+bosluk+"*> Seçiminiz : ");
                    secim(4);
                }while (!(1<=secimSonucu && secimSonucu<=4));
        }
    }
    public void tatliSecimleri(){
        secim(2);

        switch (secimSonucu){
            case 1:
                System.out.println("\n\n\n\t************** Çikolatalı Tatlı Çeşitleri Listeleniyor **************");
                System.out.println("\n"+bosluk+"1-> EKLER al"+"->(Fiyat 15 ₺)");
                System.out.println(bosluk +"2-> PROFİTEROL al"+"->(Fiyat 45 ₺)");
                System.out.println(bosluk +"3-> ÇİKOLATALI PASTA al"+"->(Fiyat 75 ₺)");
                System.out.println(bosluk +"4-> SUFLE al"+"->(Fiyat 60 ₺)");
                System.out.print("\n"+bosluk+"*> Seçiminiz : ");

                secim(4);
                switch (secimSonucu){
                    case 1:
                        setIstenilenUrun("EKLER");
                        setOdenecekUcret(15);
                        Indirim.indirimUygula();
                        break;
                    case 2:
                        setIstenilenUrun("PROFİTEROL");
                        setOdenecekUcret(45);
                        Indirim.indirimUygula();
                        break;
                    case 3:
                        setIstenilenUrun("ÇİKOLATALI PASTA");
                        setOdenecekUcret(75);
                       Indirim.indirimUygula();
                        break;
                    case 4:
                        setIstenilenUrun("SUFLE");
                        setOdenecekUcret(60);
                        Indirim.indirimUygula();
                        break;
                    default:
                        do {
                            System.out.println("!!!!!!  HATALI SEÇİM  !!!!!!");
                            System.out.println("*> TEKRAR SEÇİM YAPINIZ <*");
                            System.out.print("\n"+bosluk+"*> Seçiminiz : ");
                            secim(4);
                        }while (!(1<=secimSonucu && secimSonucu<=4));

                }
                break;

            case 2:
                System.out.println("\n\n\n\t************** Sütlü Tatlı Çeşitleri Listeleniyor **************");
                System.out.println("\n"+bosluk+"1-> SÜTLAÇ al"+"->(Fiyat 35 ₺)");
                System.out.println(bosluk +"2-> KAZANDİBİ  al"+"->(Fiyat 45 ₺)");
                System.out.print("\n"+bosluk+"*> Seçiminiz : ");

                secim(2);
                switch (secimSonucu){
                    case 1:
                        setIstenilenUrun("SÜTLAÇ");
                        setOdenecekUcret(35);
                        Indirim.indirimUygula();
                        break;
                    case 2:
                        setIstenilenUrun("KAZANDİBİ");
                        setOdenecekUcret(45);
                        Indirim.indirimUygula();
                        break;
                    default:
                        do {
                            System.out.println("!!!!!!  HATALI SEÇİM  !!!!!!");
                            System.out.println("*> TEKRAR SEÇİM YAPINIZ <*");
                            System.out.print("\n"+bosluk+"*> Seçiminiz : ");
                            secim(2);
                        }while (!(1<=secimSonucu && secimSonucu<=2));
                }

        }
    }
    //******************************************************************************************************
}
