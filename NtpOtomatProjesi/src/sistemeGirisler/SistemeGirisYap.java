package sistemeGirisler;

import java.util.Scanner;

//Sisteme kullanıcının giriş yaptığı kısım.
public class SistemeGirisYap {
    //******************************************************************************************************
    //Nesne oluşturmaları
    Scanner klavyedenGiris = new Scanner(System.in);
    //******************************************************************************************************
    //Özellik tanımlamaları
    private boolean kullaniciAdiVar=false;
    private  String girilenkullaniciAdi ="";
    private String girilenSifre="";
    //******************************************************************************************************
    //Metot tanımlamaları
    public void sistemeGirisYap(){

        System.out.print("\n *> KULLANICI ADI : " );
        this.girilenkullaniciAdi =  klavyedenGiris.next();
        SistemdekiKullanicilar.setKullaniciAdi(girilenkullaniciAdi);

            System.out.print(" *> ŞİFRE : " );
            this.girilenSifre =  klavyedenGiris.next();
            SistemdekiKullanicilar.setSifre(girilenSifre);

    }
    //******************************************************************************************************
}