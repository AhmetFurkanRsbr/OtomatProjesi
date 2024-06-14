package urunler;

import aktifKullanici.Kullanici;
import java.util.HashMap;
import java.util.Map;

public class StoguBitmekUzereUrunler {
    //******************************************************************************************************
    //Map tanımlamaları
    private Map<String,Integer> stoguBitmekUzereOlanUrunlerMap= new HashMap<>();
    //******************************************************************************************************
    //Metot tanımlamaları
    public void setStoguBitmekUzereOlanUrunler(){
        stoguBitmekUzereOlanUrunlerMap.clear();
        for (Map.Entry<String,Integer> anlikUrun : UrunStokDurumu.getUrunStok().entrySet()){

            if(0<anlikUrun.getValue() && anlikUrun.getValue()<5 ){
                stoguBitmekUzereOlanUrunlerMap.put(anlikUrun.getKey(),anlikUrun.getValue());
            } else if( UrunStokDurumu.getUrunStok().containsKey(anlikUrun) && anlikUrun.getValue()==0) {
                stoguBitmekUzereOlanUrunlerMap.remove(anlikUrun);
            }
        }

    }
    public  void getStoguBitmekUzereOlanUrunler(){

        if(Kullanici.getKullanici().equals("Teknik Ekip")){
            setStoguBitmekUzereOlanUrunler();

            stoguBitmekUzereOlanUrunlerMap.forEach((urun,stokMiktari)->{
                if((stoguBitmekUzereOlanUrunlerMap.get(urun)) == 0){
                    stoguBitmekUzereOlanUrunlerMap.remove(urun);
                }
            });

            System.out.println("\n\n------------------  STOĞU BİTMEK ÜZERE OLAN ÜRÜNLER GÖSTERİLİYOR  ------------------");
            System.out.println("\n\t*> STOĞU BİTMEK ÜZERE OLAN ÜRÜN SAYISI -->> "+stoguBitmekUzereOlanUrunlerMap.size()+"\n");

            stoguBitmekUzereOlanUrunlerMap.forEach((urun,stokMiktari)->{

                     System.out.println("\t\tÜrün -> " + urun +"  // Güncel stok miktarı -> "+stokMiktari);

            });
        }
        System.out.println("\n-------------------------------------------------------------------------------------\n");
    }
    public Map<String,Integer> getStoguBitmekUzereOlanUrunlerMap(){

        return stoguBitmekUzereOlanUrunlerMap;
    }
}
