/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calisanlar;

/**
 *
 * @author NİL
 */
public class Calisanlar {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
        Yazilimci yazilimci1 = new Yazilimci("Nil","Duman",123456789,"C,Java,C#,C++");
        Yonetici yonetici1= new Yonetici("Berk","Soğukpınar",987654321,15);
        TemizlikPersoneli temizlikci1= new TemizlikPersoneli("Oğuz","Akpınar",158794521,4);
        Asistan asistan1 = new Asistan("Ali","Hız",56478564,22);
        yazilimci1.bilgileriGoster();
        yonetici1.bilgileriGoster();
        temizlikci1.bilgileriGoster();
        asistan1.bilgileriGoster();
        yazilimci1.formatAt("Nilux");
        temizlikci1.zamYap(1);
    }
    
}