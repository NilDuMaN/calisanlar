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

public class Yazilimci extends Calisan { /*//calisan sinifinin butun ozelliklerini kapsamasini saglamak icin kullaniyoruz*/
    private String diller;
    public Yazilimci(String ad,String soyad,int id,String diller){
        super(ad, soyad, id);
        this.diller=diller; //yazilimcinin bildigi diller
    }
    public void formatAt(String isletim_sistemi)
    {
        System.out.println(getAd()+" " + isletim_sistemi + " a yüklüyor"); //yazilimcinin kodlarini yukledigi yeri ekranda gosterecek
    }

    @Override //ayni fonksiyonu farkli classlarda classlara ozgu kullanmak icin
    public void bilgileriGoster() {
        super.bilgileriGoster();
        System.out.println("Yazilimcinin bildigi diller:"+diller); //yazilimcinin adini ve bildigi dilleri alip ekrana gosterecek
    }
    
    
    
}
