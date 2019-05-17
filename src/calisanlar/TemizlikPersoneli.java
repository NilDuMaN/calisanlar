/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calisanlar;

import java.util.Scanner;

/**
 *
 * @author Nil.DUMAN
 */
public class TemizlikPersoneli extends Calisan { //calisan sinifinin butun ozelliklerini kapsamasini saglamak icin kullaniyoruz
    private int calistigi_kat;
    public TemizlikPersoneli(String ad,String soyad,int id,int calistigi_kat){
        super(ad, soyad, id);
        this.calistigi_kat=calistigi_kat;
    }
    public void bilgileriGoster()
    {
        super.bilgileriGoster();
        System.out.println("Temizlik personeli "+getAd()+" "+getSoyad()+" ın calistigi kat:"+calistigi_kat);
    }
     public void zamYap(int a){ //calisanin akdigi zam miktarini klavyeden girmek icin
        
         System.out.println("Zam miktari giriniz:");
         Scanner scanner = new Scanner(System.in);
         a=scanner.nextInt();
        System.out.println(getAd()+" a " +a+" lira kadar zam yapildi");
    }
}