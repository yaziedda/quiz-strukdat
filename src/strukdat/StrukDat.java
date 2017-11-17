/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strukdat;

import java.util.Scanner;

/**
 *
 * @author Dizzay
 */
public class StrukDat {

    /**
     * @param args the command line arguments
     */    
    public static void main(String[] args) {
        // TODO code application logic here
        int array[][];
        int kolom, baris;
        int hasil = 1;
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukan jumlah baris : ");
        baris = scanner.nextInt();
        System.out.print("Masukan jumlah kolom : ");
        kolom = scanner.nextInt();
        
        array = new int[baris][kolom];
        
        for(int i=0; i < array.length; i++){
            for(int j=0; j < array[i].length; j++){
                System.out.print("Masukan data untuk baris "+i+" dan kolom "+j+" : ");
                array[i][j] = scanner.nextInt();
            }
        }
        
        for(int i=0; i < array.length; i++){
            for(int j=0; j < array[i].length; j++){
                System.out.println("Data baris "+i+" Kolom : "+j+" = "+array[i][j]);
                hasil = hasil * array[i][j];
            }
        }
        
        System.out.println("Total seluruh jumlah data : "+hasil);
        
    }
    
}
