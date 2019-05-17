/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calisanlar;

/**
 *
 * @author Nil.DUMAN
 */
public class Yonetici extends Calisan { //calisan sinifinin butun ozelliklerini kapsamasini saglamak icin kullaniyoruz
    private int sorumlu_kisi_sayisi;
    public Yonetici(String ad,String soyad,int id,int sorumlu_kisi_sayisi)
    {
        super(ad, soyad, id);
        this.sorumlu_kisi_sayisi=sorumlu_kisi_sayisi;
    }

    @Override //ayni fonksiyonu farkli classlarda classlara ozgu kullanmak icin
    public void bilgileriGoster() {
        super.bilgileriGoster(); 
        System.out.println("Patron " + getAd()+ " " + getSoyad() + " ın sorumlu olduğu kişi sayisi:"+sorumlu_kisi_sayisi); //berk in kendine ozgu kimsenin kullanmadigi lakabi
    }
   
    
    
    
}
