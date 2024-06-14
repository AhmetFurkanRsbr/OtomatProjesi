package uyarilar;

public interface Uyari {
    enum arizaCesit{
        urunBitti,
        urunBitmekUzere,
        parasal,
        belirsiz,
        yok
    }
    int adet=0;
    boolean okundu=false;

    void uyariGonder(Uyari.arizaCesit cesit,Uyari adet);

}

