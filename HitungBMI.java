/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hitungbmi;

import java.util.Scanner;

/**
 *
 * @author user3
 */
public class HitungBMI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        System.out.println("masukkan Nama: ");
//        String nama = input.nextLine();
//        System.out.println("Masukkan tinggi Badan: (m) "+nama);
//        double tinggi = input.nextDouble();
//        System.out.println("Masukkan Berat Badan: (kg) ");
//        double berat = input.nextDouble();
//        
//        double BMI = berat/(tinggi*tinggi);
//        
//        if(BMI < 18.5){
//            System.out.println("Berat Badan Kurang");
//        } else if(BMI>18.5 && BMI<29.9){
//            System.out.println("Berat badan Normal");
//    }else{
//            System.out.println("Berat Badan berlebih");
//        }
        
        System.out.println("masukkan nama: ");
        String nama = input.nextLine();
        System.out.println("Masukkan Nilai; ");
        double nilai = input.nextDouble();
        
        if(nilai>=96 && nilai<=100){
            System.out.println("Nilai Sangat Baik/ predikat A");
        }else
         if(nilai>=91 && nilai <=95){
             System.out.println("Nilai Sangat Baik/ predikat A-");
         }else
            if(nilai>=86 && nilai <=90){
            System.out.println("Nilai Sangat Baik/ predikat B+");
                }else  if(nilai>=81 && nilai <=85){
                System.out.println("Nilai baik/Predikat B");
                 }else  if (nilai>=80 && nilai <=75){
                  System.out.println("Niali Baik/Predikat B-");
                     }else  if (nilai>=74 && nilai <=70){
                         System.out.println("Nilai Cukup/Predikat C+");
                            }else  if (nilai>=69 && nilai <=65){
                                System.out.println("Nilai Cukup/Predikat C");
                                     }else  if (nilai>=64 && nilai <=60){
                                          System.out.println("Nilai Cukup/Predikat C-");
                                             }else  if (nilai>=59 && nilai <=55){
                                                 System.out.println("Nilai Kurang/Predikat D+");
                                                     }else{
                                                         System.out.println("nilai kurang/predikat D");
                }
        
            
    
            
        

    
        
    }
    
}
