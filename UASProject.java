/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uasproject;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author 21102052/sudarma
 */
public class UASProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String pil="";
        String ulang="ya";
        float ja=0, se=0, ma=0, ti=0, ga=0; 
        
        HtMassa ms = new HtMassa();
        HtPotensial pt = new HtPotensial();
        
        BufferedReader dtIN = new BufferedReader(new InputStreamReader(System.in));
        
        while("ya".equals(ulang)){
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("            Rumus Dasar Fisika");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("1. Kelajuan dan Percepatan");
        System.out.println("2. Potensial");
        System.out.println("3. Selesai");
        System.out.println("");
        System.out.print("pilihan: ");
        try{
            pil = dtIN.readLine();
        }catch(IOException e){
            System.out.println("Terjadi kendala");
        }
        
        switch(pil){
            case "1":
                System.out.println("Menghitung Kelajuan dan Percepatan");
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.print("Masukan Nilai Jarak : ");
                try{
                    ja = Float.parseFloat(dtIN.readLine());
                }catch(IOException e){
                    System.out.println("Terjadi kendala");
                }
                System.out.print("Masukan Nilai Waktu : ");
                try{
                    se = Float.parseFloat(dtIN.readLine());
                }catch(IOException e){
                    System.out.println("Terjadi kendala");
                }
                ms.SetJarak(ja);
                ms.SetWaktu(se);
                System.out.println("Jadi Hasilnya : "+ms.HitungHasil());
                break;
            case "2":
                System.out.println("Menghitung Energi Potensial");
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.print("Masukan Nilai Massa : ");
                try{
                    ma = Float.parseFloat(dtIN.readLine());
                }catch(IOException e){
                    System.out.println("Terjadi kendala");
                }
                System.out.print("Masukan Nilai Gravitasi : ");
                try{
                    ga = Float.parseFloat(dtIN.readLine());
                }catch(IOException e){
                    System.out.println("Terjadi kendala");
                }
		    System.out.print("Masukan Nilai Tinggi : ");
                try{
                    ti = Float.parseFloat(dtIN.readLine());
                }catch(IOException e){
                    System.out.println("Terjadi kendala");
                }
                pt.SetMassa(ma);
                pt.SetGravitasi(ga);
 		pt.SetTinggi(ti);
                System.out.println("Jadi Hasilnya : "+pt.HitungHasil());
                break;
            case "3":
                System.out.println("");
                System.out.println("Thankyou ^_^, see u next time");
                System.out.println("");
                ulang="tidak";
                break;
            default:
                System.out.println("Pilihan anda tidak ada di daftar, silahkan pilih 1/2/3");
                break;
        }
        }
        
        
    }    
}

    

