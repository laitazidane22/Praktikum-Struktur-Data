/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Quiz2MI1F;

import com.sun.glass.ui.Size;

/**
 *
 * @author E P H I N
 */
public class QueueDoubleLL {
    Node09 head;
    Node09 tail;
    int size;
    
    public boolean isEmpty() {
        return (head == null);
    }
    
     public QueueDoubleLL()
    {
        head = null;
        tail = null;
        size = 0;
    }    
    
     //menambahkan data dari belakang(insert)
    public void insert(Pesanan09 input) {
        if(isEmpty()){
            head= new Node09(input, null, null);
        }else{
            Node09 ndInput = new Node09(input, null, head);
            head.previous = ndInput;
            head = ndInput;
        }              
        size++;
    }
    
     public void insertPembeli(Pembeli09 input) {
        if(isEmpty()){
            head= new Node09(input, null, null);
        }else{
            
            Node09 ndInput = new Node09(input, null, head);
            head.previous = ndInput;
            head = ndInput;
        }              
        
    }
   
    //menghapus data node di depan
    public Node09 deleteFirst() {
 
        if (size == 0)
            System.out.println("Antrianmasih kosong, tidak dapat dihapus");        
                        
        Node09 temp = head;
        head = head.next;
        head.previous = null;
        size--;
        return temp;
        
    }
       
    //mencetak data antrian
    public void print()
    {
       if(!isEmpty()){ //
            Node09 ptr = head;
            int i = 1;
            System.out.println("-------------------------------------------");
                System.out.println("Daftar Pesanan Resto Royal Delish");
                System.out.println("-------------------------------------------");
            while (ptr != null) {
                System.out.println("No Antrian: "+i + "Nama Customer: " +ptr.data2.namaPembeli + "No hp: "+ptr.data2.NoHp);                                   
                ptr = ptr.next;
                i++;                                
            }
            System.out.println("");
        }else{
            System.out.println("Antrian kosong");
        }     
    }
    
     //mencetak data antrian pembeli
    public void printPesanan()
    {
       if(!isEmpty()){ //
            Node09 ptr = head;
            int i = 0;
            System.out.print("Isi Linked list:\t");
            while (ptr != null) {
                System.out.println("-------------------------------------------");
                System.out.println("Daftar Pesanan Resto Royal Delish");
                System.out.println("-------------------------------------------");
                System.out.print("|No." +"n Nama Pesanan " + " Harga       |");  
                System.out.print(" "+i +""+ ptr.data.namaPesanan +" "+ ptr.data.harga);                  
                ptr = ptr.next;
                i++;
                System.out.println("Semua pesanan berhasil dicetak");
            }
            System.out.println("");
        }else{
            System.out.println("Antrian kosong");
        }     
    }
    
    
    
}
