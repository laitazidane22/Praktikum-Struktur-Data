/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soal2;
import java.util.Scanner;
/**
 *
 * @author E P H I N
 */
public class ArrayTanah {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in );
        
        System.out.print("Masukkan jumlah tanah: ");
        int length = input.nextInt();
        int tanahTerluas = 0;
        int tempLuas =0;
        
        tanah[] arrTanah = new tanah[length];
        
        for(int i=0; i<arrTanah.length; i++)
        {
            arrTanah[i] = new tanah(i, i);
            System.out.println("Tanah " +(i+1));
            System.out.print("Panjang: ");
            arrTanah[i].panjang = input.nextInt();
            System.out.print("Lebar: ");
            arrTanah[i].lebar = input.nextInt();           
        }
        System.out.println();
        for(int i=0; i<arrTanah.length; i++)
        {
            System.out.println("Luas Tanah " +(i+1) +": " +arrTanah[i].hitungLuas());
            System.out.println(); 
            
        }
        
        for(int j=0; j<arrTanah.length; j++){
            
            if(arrTanah[j].hitungLuas() > tanahTerluas)
            {
                tanahTerluas = arrTanah[j].hitungLuas();
                tempLuas = j+1;
            }
        }
        System.out.println("Tanah terluas: " +"Tanah "+tempLuas);
        
        
    }
}
