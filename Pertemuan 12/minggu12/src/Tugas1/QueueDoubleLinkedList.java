/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas1;

/**
 *
 * @author E P H I N
 */
public class QueueDoubleLinkedList {
    Node head;
    Node tail;    
    public int size;
    
    public boolean isEmpty() {
        return (head == null);
    }
    
     public QueueDoubleLinkedList(){
        head = null;
        tail = null;        
        size = 0;
    }    
    
      public int getSize(){
        System.out.print("Sisa Antrian: ");
        return size;
    }
      
    public void Enqueue(int nomer, String nama) {
        Node newNode = new Node(null, nomer, nama, null);
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }
    
    public void Dequeue() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked list masih kosong,tidak dapat dihapus");
        } else if (size == 1) {
            removeFirst();
        } else {
            System.out.println(head.nama + " telah selesai divaksin");
            head = head.next;
            head.previous = null;
            size--;
        }
    }
    
    public void removeFirst() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked List masih kosong,tidak dapat dihapus!");
        } else if (head.next == null) {
            head = null;
            size--;
            return;
        }
        Node current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
        size--;       

    }
    
    public void print() {
        if (!isEmpty()) {
            Node tmp = head;
            System.out.println("+++++++++++++++++++++");
            System.out.println("Daftar Pengantri Vaksin");
            System.out.println("+++++++++++++++++++++");
            System.out.println("|Nomor \t|Nama\t|");
            while (tmp != null) {
            System.out.println("|" + tmp.nomor + "\t|" + tmp.nama + "\t");
            tmp = tmp.next;
            }
            System.out.print("Sisa Antrian: " + size);
            System.out.println("");
        } else {
            System.out.println("linked List Kosong");
        }
    }
        

}
