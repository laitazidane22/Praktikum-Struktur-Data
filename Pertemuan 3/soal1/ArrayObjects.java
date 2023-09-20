/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soal1;
import java.util.Scanner;
/**
 *
 * @author E P H I N
 */
public class ArrayObjects {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        
       kubus[] arrKubus = new kubus[3];
        
        for( int i = 0; i < 3; i++){
            arrKubus[i] = new kubus(i);
            System.out.print("Masukkan sisi ke-" +i + ": ");
            arrKubus[i].sisi = input.nextInt();                    
        }
        
        for(int i=0; i < 1 ; i++)
        {
            System.out.println("Volume Kubus: " +arrKubus[i].hitungKubus() );
        }
        
        System.out.println();
        System.out.println("========================================");
            
        limassegi4[] arrlimas = new limassegi4[3];
        
        for( int i = 0; i< 1 ; i++){
            arrlimas[i] = new limassegi4(i, i, i);
            System.out.print("Default rumus(1/3) : " );
            arrlimas[i].pec = input.nextInt();       
            System.out.print("Masukkan luas alas: " );
            arrlimas[i].lalas = input.nextInt(); 
            System.out.print("Masukkan tinggi: " );
            arrlimas[i].tinggi = input.nextInt();
        }
        
        for(int i=0; i < 1; i++)
        {
            System.out.println("Volume limas: " +arrlimas[i].volumeLimas() );
        }
        
    }
}
