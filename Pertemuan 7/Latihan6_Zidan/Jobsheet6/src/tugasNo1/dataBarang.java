/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasNo1;


import com.oracle.webservices.internal.api.EnvelopeStyle;

/**
 *
 * @author E P H I N
 */
public class dataBarang {
   barang dataBrg[] = new barang[4];
    int idx;
    

    
    void tambah(barang m){
        if (idx < dataBrg.length) {
            dataBrg[idx] = m;
            idx++;
        }else{
            System.out.println("Data sudah penuh!!");
        }
    }
    
    void tampil(){
        for(barang m : dataBrg){
            m.tampil();
            System.out.println("--------------------------");
        }
    }
   
   void insertion(){
       for(int i=1; i <= dataBrg.length-1; i++ ){
           barang temp = dataBrg[i];          
           int j = i-1;
           while(j >= 0 && dataBrg[j].stok < temp.stok){
               dataBrg[j+1] = dataBrg[j];
               j = j-1;
           }
           dataBrg[j+1] = temp;
       }
       
   }
   
   void shellSort(){
       int interval;
        for(interval = dataBrg.length/2; interval>0; interval/=2){
            for(int i=interval; i<dataBrg.length; i+=1){
                barang temp = dataBrg[i];
                int j;
                for(j=i; j>= interval && dataBrg[j-interval].stok < temp.stok; j-=interval){
                    dataBrg[j] = dataBrg[j-interval];
                }
                dataBrg[j]=temp;
            }
        }
   }
   
    
}
