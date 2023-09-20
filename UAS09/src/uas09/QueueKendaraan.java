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
public class QueueKendaraan {
    
    NodeKendaraan head, tail;
    NodePajak head2, tail2;
    public int size;
 
    
    public QueueKendaraan()
    {
        head = null;
        tail = null;
        size = 0;
    }    
    
    //cek antrian kosong
    public boolean isEmpty()
    {
        return head == null;
    }    
    
    //cek banyak antrian
    public int getSize()
    {
        System.out.print("banyak antrian: ");
        return size;
    }    
    
    
    //menambahkan antrian dari posisi belakang
    public void Enqueue(Kendaraan data)
    {
        NodeKendaraan Ndinput = new NodeKendaraan(data, null);
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
    public Kendaraan remove()
    {
        if (isEmpty() )
            System.out.println("overflow");
        NodeKendaraan ptr = head;
        head = ptr.getNext();        
        if (head == null)
            tail = null;
        size-- ;        
        return ptr.dataKendaraan;
    }    
    
    //antrian paling depan
    public void peek()
    {
        if (isEmpty() ){
            System.out.println("Underflow");
        }else{
            System.out.println("Antrian terdepan: ");
            System.out.print("Nama Kendaraan: " + head.dataKendaraan.nama +" TNKB: "+ head.dataKendaraan.TNKB + 
                    " CC: " +head.dataKendaraan.CC + " Bulan Bayar: "+head.dataKendaraan.bulanBayar + " | ");
        }
    }    
    
    //mencetak data antrian
    public void print()
    {
       if(!isEmpty()){ //
            NodeKendaraan tmp = head;             
            System.out.print("Isi Linked list:\t");
            while (tmp != null) {
                System.out.print("Nama Kendaraan: " + tmp.dataKendaraan.nama +" TNKB: "+ tmp.dataKendaraan.TNKB + 
                        " CC: " +tmp.dataKendaraan.CC + " Bulan Bayar: "+tmp.dataKendaraan.bulanBayar + " | ");  
                tmp = tmp.next;
                                
            }
            System.out.println("");
        }else{
            System.out.println("Linked list kosong");
        }     
    }
    
        public void urut() throws Exception {
            NodeKendaraan current = head, index = null;
            
            Kendaraan temp;            
        if (isEmpty()) {
            throw new Exception("Linked masih kosong");
        } else {                        
            while (current.next == null){
                if (current.dataKendaraan.nama.compareToIgnoreCase(index.dataKendaraan.nama) > 0){ //Ascending
                    
                }else{
                    temp = current.dataKendaraan;
                    current.dataKendaraan = index.dataKendaraan;
                    index.dataKendaraan = temp;
                }
                
                index = index.next;
            }
            current = current.next;
        }
    }
}
