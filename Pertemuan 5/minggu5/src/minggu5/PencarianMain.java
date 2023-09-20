/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu5;
import java.util.Scanner;
/**
 *
 * @author E P H I N
 */
public class PencarianMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        
        System.out.print("Masukkan bnyaknya inputan: ");
        int n = input.nextInt();
        double[] data = new double[n];
        for(int i=0; i<data.length; i++){
            
            System.out.print("Masukkan data ke-" +(i+1) +" : ");
            data[i] = input.nextDouble();
        }
        OrderedSearch os = new OrderedSearch(data);
        
        
        
        System.out.println("Isi elemen array: ");
        os.tampilkan();
        
        System.out.print("Masukkan data yang ingin dicari: ");
        double key = input.nextDouble();
        int index = os.cari(key);
        if(index != -1){
            System.out.println("Data: "+ key + " pada index " +(index+1));
        }else{
            System.out.println("Data "+ key + "tidak ditemukan");
        }
    }
}

