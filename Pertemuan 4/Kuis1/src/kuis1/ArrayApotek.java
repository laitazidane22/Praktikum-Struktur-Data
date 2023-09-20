/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuis1;
import java.util.Scanner;
/**
 *
 * @author E P H I N
 */
public class ArrayApotek {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int tempObat = 0;
        int obatTerlaku=0;
        int obat =0;
        
        
        System.out.print("Masukkan banyaknya obat: ");
        int n = input.nextInt();
        
        apotek[] arrApotek = new apotek[n];
        
        for(int i=0; i<arrApotek.length; i++){
            arrApotek[i] = new apotek("nm", "kt", i, i);
            
            System.out.println("Penjualan obat ke-" +(i+1));
            System.out.print("Masukkan nama obat: ");
            arrApotek[i].nama = input.next(); input.nextLine();
            System.out.print("Masukkan kategori obat: ");
            arrApotek[i].kategori = input.next(); input.nextLine();
            System.out.print("Masukkan stok obat: ");
            arrApotek[i].stok =input.nextInt(); 
            System.out.print("Masukkan jumlah obat yang terjual: ");
            arrApotek[i].jumlah = input.nextInt();
            
        }
        
        System.out.println();
        System.out.println("===================================");
        for(int i=0; i<arrApotek.length; i++){
            arrApotek[i].tampilObat();
        }
        
        System.out.println();
        System.out.println("===================================");
        for(int i=0; i<arrApotek.length; i++){
             
            if(arrApotek[i].hitungSisa() > obatTerlaku){
                obatTerlaku = arrApotek[i].hitungSisa();
                tempObat = i+1;
                
                 
                          
            }
              
        }
        System.out.println("obat terlaris = " + "obat ke-"+tempObat +" dengan sisa stok = ");
        
    }
}
   
