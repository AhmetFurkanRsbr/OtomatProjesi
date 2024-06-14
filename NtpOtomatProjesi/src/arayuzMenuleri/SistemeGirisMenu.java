package arayuzMenuleri;

import sistemeGirisler.SistemeGirisYap;
//Kullanıcıların sisteme giriş yaptığı menü
public  class SistemeGirisMenu {
    //******************************************************************************************************
    //Nesne oluşturmaları
    SistemeGirisYap sistemeGirisYap =new SistemeGirisYap();

    //******************************************************************************************************
    //Metot tanımları
    public void SistemeGirisMenusu(){

        System.out.println("\n\n\t**************  SİSTEME GİRİŞ MENÜSÜNE HOŞGELDİNİZ  **************");
        sistemeGirisYap.sistemeGirisYap();//sisteme giriş yapma menüsüne aktarılması
    }

    //******************************************************************************************************
}