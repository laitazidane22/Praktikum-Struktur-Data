/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas;

/**
 *
 * @author E P H I N
 */
public class QueueLinkedList {
    Node head, tail;
    public int size;
 
    
    public QueueLinkedList()
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
        return size;
    }    
    
    
    //menambahkan antrian dari posisi belakang
    public void Enqueue(Mahasiswa data)
    {
        Node Ndinput = new Node(data, null);
        if (isEmpty())
        {
            head = Ndinput;
            tail = Ndinput;
        }
        else
        {
            tail.setNext(Ndinput);
            tail = Ndinput;
        }
        size++ ;
    }    
   
    //mengeluarkan antrian
    public Mahasiswa remove()
    {
        if (isEmpty() )
            System.out.println("overflow");
        Node ptr = head;
        head = ptr.getNext();        
        if (head == null)
            tail = null;
        size-- ;        
        return ptr.data;
    }    
    
    //antrian paling depan
    public void peek()
    {
        if (isEmpty() ){
            System.out.println("Underflow");
        }else{
            System.out.println("Antrian terdepan: " + head.data.nim +" "+ head.data.nama + " " +head.data.absen + " "+head.data.ipk );
        }
    }    
    
    //mencetak data antrian
    public void print()
    {
       if(!isEmpty()){ //
            Node ptr = head; 
            System.out.print("Isi Linked list:\t");
            while (ptr != null) {
                System.out.print(ptr.data.nim +" "+ ptr.data.nama + " " +ptr.data.absen + " "+ptr.data.ipk + " | ");  
                ptr = ptr.next;
                                
            }
            System.out.println("");
        }else{
            System.out.println("Linked list kosong");
        }     
    }
    
    
}
    

