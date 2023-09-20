/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uas09;

/**
 *
 * @author E P H I N
 */
public class QueuePajak {
       
    NodePajak head, tail;
    public int size;
 
    
    public QueuePajak(){
        head = null;
        tail = null;
        size = 0;
    }    
    
    //cek antrian kosong
    public boolean isEmpty()
    {
        return head == null;
    }    
    
    //cek banyak data
    public int getSize()
    {
        System.out.print("banyak antrian: ");
        return size;
    }    
    
    
    //menambahkan data dari posisi belakang
    public void Enqueue(Pajak data)
    {
        NodePajak Ndinput = new NodePajak(data, null);
        if (isEmpty())
        {
            head = Ndinput;
            tail = Ndinput;
        }
        else
        {
            tail.next = Ndinput;
            tail = Ndinput;
        }
        size++ ;
    }    
   
    //mengeluarkan antrian
    public Pajak remove()
    {
        if (isEmpty() )
            System.out.println("overflow");
        NodePajak ptr = head;
        head = ptr.getNext();        
        if (head == null)
            tail = null;
        size-- ;        
        return ptr.dataPajak;
    }    
    
    //mencetak data antrian
    public void print()
    {
       if(!isEmpty()){ //
            NodePajak tmp = head; 
            System.out.print("Isi Linked list:\t");
            int kd = 1;
            while (tmp != null) {
                System.out.print( "Kode: " + kd  + "Denda: " + tmp.dataPajak.denda +" Bulan Bayar: "+ tmp.dataPajak.bulanBayar );  
                tmp = tmp.next;
                kd++;
                                
            }
            System.out.println("");
        }else{
            System.out.println("Linked list kosong");
        }     
    }
    
    public void totalPendapatan(){
        if(!isEmpty()){
            System.out.println("=========================");
            System.out.println("    TOTAL PENDAPATAN     ");
            System.out.println("=========================");
            NodePajak tmp = head;
            int total = 0;
            if (head == null){
                System.out.println("No data");
                return;
            }
            while (tmp != null){
                total = total + tmp.dataPajak.denda;
                tmp = tmp.next;
            }
            System.out.println("Total Pendapatan: " +total);
        }else{
            System.out.println("Tidak ada data");
        }
    }
}
