/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum1;

import java.util.Scanner;


/**
 *
 * @author E P H I N
 */
public class Stack {
    int size, top, min;
    Pakaian data[];
    Scanner sc =  new Scanner(System.in);
    
   

    public Stack(int size) {
        this.size = size;
        data = new Pakaian[size];
        top = -1;
    }
    
    //mengecek apakah satck kosong
    public boolean isEmpty(){ 
        if (top == -1 ){
            return true;
        }else{
            return false;
        }
    }
    
    //mengecek apakah satck sudah terisi
      public boolean isFull(){ 
        if (top == size -1 ){
            return true;
        }else{
            return false;
        }
    }
    
    //menambahkan isi elemen (push)
    public void push(Pakaian pkn){
        if (!isFull()){
            top++;
            data[top] = pkn;                           
        }else{
            System.out.println("Isi stack penuh");
        }
            
    }
    
    //mengeluarkan isi elemen stack tumpukan paling atas(Pop)
    public void pop(){
        if(!isEmpty()){
            Pakaian x = data[top];
            top--;
            System.out.println("Data yang keluar: " + x.jenis + " " + x.warna
            + " " + x.merk + " " + x.ukuran + " " + x.harga);
        }else{
            System.out.println("Stack masih kosong");
        }
    }
    
    //memeriksa elemen paling atas
    public void peek(){
        System.out.println("Elemen teratas: " + data[top].jenis + " " +
                data[top].warna + " " + data[top].merk + " " + data[top].ukuran
                + " " + data[top].harga);
    }
    
    //menampilkan seluruh elemn pada stack
    public void print(){
        System.out.println("Isi stack: ");
        for(int i = top; i >= 0; i--){
            System.out.println(data[i].jenis + " " + data[i].warna + " " + data[i].merk + " " +
                    data[i].ukuran + " " + data[i].harga + " ");
        }
        System.out.println("");
    }
    
    //menghapus seluruh isi stack
    public void clear(){
        if (!isEmpty()){
            for (int i = top; i >= 0; i--){
                top--;
            }
            System.out.println("Stack sudah dikososngkan");        
        }else{
            System.out.println("Stack masih kosong");
        }
    }
    
    //mencari data dengan harga terendah
    public void getMin(){
        double hrgMin = data[0].harga;
        int id =0;
        for(int i = 1; i <= top; i++){
            if (hrgMin > data[i].harga){
                id =i;
                hrgMin =data[i].harga;
            }
        }
        System.out.println("Harga pakaian terendah : " + data[id].jenis + " " + data[id].merk + " " + data[id].ukuran + " " 
                + data[id].warna + " " + data[id].harga);
    }
    
}
