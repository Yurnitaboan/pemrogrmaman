/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Lenovo
 */
public class BMI {
    double berat;
    double tinggi;
    double hasil;

public BMI (double berat, double tinggi){
    this.berat = berat;
    this.tinggi = tinggi;
    this.hasil = hasil;
}

public void berat (){
    System.out.println("Masukan berat badan anda (Kg): " +berat);
    System.out.println("Masukan tinggi badan anda (M) :" +tinggi);
}

public void hasil (){
    hasil = berat/(tinggi*tinggi);
    System.out.println("Hasil BMI anda adalah" + hasil);
    if (hasil<18.5){
        System.out.println("Termasuk Kategori KURANG BERAT BADAN");
    }else if (hasil >= 18.5 && hasil <24.9){
        System.out.println("Termasuk Kategori NORMAL");
    }else if (hasil>=25 && hasil  < 29.0){
        System.out.println("Termasuk Kategori KELEBIHAN BERAT BADAN");
    }else if (hasil >=30.0){
        System.out.println();
    }
}
        
        




    
}
