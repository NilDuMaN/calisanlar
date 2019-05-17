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

public class Asistan extends Calisan { //calisan sinifinin butun ozelliklerini kapsamasini saglamak icin kullaniyoruz
    private final int calistigi_gun_sayisi;
    public Asistan(String ad,String soyad,int id,int calistigi_gun_sayisi){
        super(ad, soyad, id);
        this.calistigi_gun_sayisi=calistigi_gun_sayisi; //asistanlarin izin gunu disinda ofiste gecirdikleri zaman
    }
    public void bilgileriGoster(){
        super.bilgileriGoster();
        System.out.println("Asistanın izinli olmayıp çalıştığı gün sayısı:"+calistigi_gun_sayisi);
    }
    
}