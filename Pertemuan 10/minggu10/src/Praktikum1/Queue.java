/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum1;

import Praktikum2.Nasabah;

/**
 *
 * @author E P H I N
 */
public class Queue {
    //int[] data;
    Nasabah[] data;
    int front, rear, size, max;
    
    
//    public Queue(int n) {
//        max = n;
//        data = new int[max];
//        size = 0;
//        front = rear = -1;
//    }
    
    public Queue(int n) {
        max = n;
        data = new Nasabah[max];
        size = 0;
        front = rear = -1;
    }
    
    //mengecek apakah queue kosong
    public boolean IsEmpty(){
        if (size == 0){ // kondisi undervlow (kosong tidak ada data)
            return true;            
        }else{
            return false;            
        }
    }
    
    //mengecek apakah queue sudah penuh
    public boolean IsFull(){
        if (size == max){ //konidisi overflow(penuh)
            return true;            
        }else{
            return false;
        }
    }
    
     //menampilkan elemen/data queue pada posisi paling depan
//    public void peek(){
//        if (!IsEmpty()){
//            System.out.println("Elemen Terdepan: " + data[front]);
//        }else{
//            System.out.println("Queue masih kosong");
//        }
//    }
    
    //menampilkan elemen/data queue pada posisi paling depan
    public void peek(){
        if (!IsEmpty()){
            System.out.println("Elemen Terdepan: " + data[front].norek + " " + data[front].nama + " "
            + data[front].alamat + " " + data[front].umur + " " + data[front].saldo);
        }else{
            System.out.println("Queue masih kosong");
        }
    }
    
    
    //menampilkan seluruh elemen/data pada queue mulai dari posisi front sampai dengan posisi rear.
//    public void print(){
//        if (IsEmpty()){
//            System.out.println("Queue masih kosong");
//        }else{
//            int i = front;
//            while (i != rear){
//                System.out.println(data[i] + " ");
//                i = (i + 1) % max;
//            }
//            System.out.println(data[i] + " ");
//            System.out.println("Jumlah elemen = " + size);
//        }
//    }
    
    //menampilkan seluruh elemen/data pada queue mulai dari posisi front sampai dengan posisi rear.
    public void print(){
        if (IsEmpty()){
            System.out.println("Queue masih kosong");
        }else{
            int i = front;
            while (i != rear){
                System.out.println(data[i].norek + " " + data[i].nama + " "
                + data[i].alamat + " " + data[i].umur + " " + data[i].saldo );
                i = (i + 1) % max;
            }
            System.out.println(data[i].norek + " " + data[i].nama + " "
                + data[i].alamat + " " + data[i].umur + " " + data[i].saldo);
            System.out.println("Jumlah elemen = " + size);
        }
    }
    
    //menghapus semua elemen/data pada queue
    public void clear(){
        if (!IsEmpty()){
            front = rear = -1;
            size = 0;
            System.out.println("Queue berhasil dikosongkan");
        }else{
            System.out.println("Queue masih kosong");
        }
    }
    
    //menambahkan isi queue
//    public void Enqueue(int dt){
//        if (IsFull()){
//            System.out.println("Queue sudah penuh");
//        }else{
//            if(IsEmpty()){
//                front = rear = 0;
//            }else{
//               if (rear == max -1){
//                 rear = 0;
//                }else{
//                    rear++;
//                }
//            }
//            data[rear] = dt;
//            size++;
//        }
//        
//    }
    
    //menambahkan isi queue (menambahkan dari posisi belakang (rear))
    public void Enqueue(Nasabah dt){
        if (IsFull()){            
            System.exit(0);          
            System.out.println("Queue sudah penuh");          
        }else{
            if(IsEmpty()){
                front = rear = 0;
            }else{
               if (rear == max -1){
                 rear = 0;
                }else{
                    rear++;
                }
            }
            data[rear] = dt;
            size++;
        }
        
    }
    
    //mengeluarkan data pada queue di posisi belakang
//    public int Dequeue(){
//        int dt = 0;
//        if(IsEmpty()){
//            System.out.println("Queue masih kosong");
//        }else{
//            dt = data[front];
//            size--;
//            if(IsEmpty()){
//                front = rear = -1;
//            }else{
//                if (front == max -1){
//                    front = 0;
//                }else{
//                    front++;
//                }
//            }
//        }
//        return dt;
//    }

    
    //mengeluarkan data pada queue di posisi depan
    public Nasabah Dequeue(){
        Nasabah dt = new Nasabah();
        if(IsEmpty()){
            System.exit(0);
            System.out.println("Queue masih kosong");
        }else{
            dt = data[front];
            size--;
            if(IsEmpty()){
                front = rear = -1;
            }else{
                if (front == max -1){
                    front = 0;
                }else{
                    front++;
                }
            }
        }
        return dt;
    }
    
    //menampilkan elemen/data queue pada posisi paling belakang
    public void peekRear(){
        if (!IsEmpty()){
            System.out.println("Elemen paling belakang: " + data[rear].norek + " " + data[rear].nama + " "
            + data[rear].alamat + " " + data[rear].umur + " " + data[rear].saldo);
        }else{
            System.out.println("Queue masih kosong");
        }
    }

}
