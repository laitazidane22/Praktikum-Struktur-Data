/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum1;

/**
 *
 * @author E P H I N
 */
public class SingleLinkedList {
    
    Node head; //posisi awal linked list
    Node tail; //posis akhir linked list
    
    //cek apakah kosong
    public boolean isEmpty(){
        return head == null;
    }
    
    
    //mencetak linked list
    public void print(){
        if(!isEmpty()){ //
            Node tmp = head; //head disimpan di variabel tmp
            System.out.print("Isi Linked list:\t");
            while (tmp != null) {
                System.out.print(tmp.data + "\t");
                tmp = tmp.next;
                
            }
            System.out.println("");
        }else{
            System.out.println("Linked list kosong");
        }
    }
    
    //menambahkan data dari depan(addfirst)
    public void addFirst(int input){
        Node ndInput = new Node(input, null);
        if (isEmpty()){ //jiks node awal kosong, mka head dan tail akan 
            head = ndInput; //sama sama menujuk ke node input(ndinput)
            tail = ndInput;
        }else{
            ndInput.next = head; 
            head = ndInput;
        }
    }
        
        //menambahkan data dari belakang
        public void addLast(int input){
            Node ndInput = new Node(input, null);
            if(isEmpty()){
                head = ndInput;//head dan tail sama dengan node input
                tail = ndInput;
            }else{
                tail.next = ndInput;
                tail = ndInput;
            }
        }
        
        //mencari node(data) terlebih dahulu lalu menambahkan node(data) dengan menyisipkan setelah
        //node yang memiliki data sama dgn key
        public void insertAfter(int key, int input){
            Node ndInput = new Node(input, null);
            Node temp = head;
            do{
                if(temp.data == key){ //mencari data apakah data sama dengan nilai var key yang ingin dicari
                    ndInput.next = temp.next;
                    temp.next = ndInput;
                    if(ndInput.next == null) tail = ndInput;
                        break;                        
                }
                temp = temp.next;                    
            }while (temp != null);                
        }
        
        public void insertArt(int index, int input){
            if(index < 0){
                System.out.println("indeks salah");
            }else if(index == 0){
                addFirst(input);
            }else{
                Node temp = head;
                for(int i = 0; i < index - 1; i++){
                    temp = temp.next;
                }
                temp.next = new Node(input, temp.next);
                if(temp.next.next == null) tail = temp.next;
            }
        }
        
                
        //mendapatkan atau mengambil data pada indeks tertentu di linked list
        public int getData(int index){
            Node tmp = head;
            for (int i = 0; i < index; i++){
                tmp = tmp.next;
            }
            return tmp.data;
        }
        
        //mencari posisi indeks data node
        public int indexOf(int key){
            Node tmp = head;
            int index = 0;
            while (tmp != null && tmp.data != key){
                tmp = tmp.next;
                index++;
            }
            
            if (tmp == null){
                return -1;
            }else{
                return index;
            }
        }
        
        //menghapus data node di depan
        public void removeFirst(){
            if(isEmpty()){
                System.out.println("Linked List masih kosong, tidak dapat dihapus");                
            }else if (head == tail){
                head = tail = null;
            }else{
                head = head.next;
            }
        }
        
        //menghapus data node pada bagian belakang
        public void removeLast(){
            if (isEmpty()){
                System.out.println("Linked List masih kosong, tidak dapat dihapus");
            }else if(head == tail){
                head = tail = null;
            }else{
                Node temp = head;
                while (temp.next != tail) {                    
                    temp = temp.next;
                }
                temp.next = null;
                tail = temp;
            }
        }
        
        
        public void remove(int key){
            if(isEmpty()){
                System.out.println("Linked List masih kosong, tidak dapat dihapus");
            }else{
                Node temp = head;
                while (temp != null) {
                    if((temp.data == key) && (temp == head)){
                        this.removeFirst();
                        break;
                    }else if(temp.next.data == key){
                        temp.next = temp.next.next;
                        if(temp.next == null){
                            tail = temp;
                        }
                        break;
                    }
                    temp = temp.next;
                    
                }
            }
        }
        
        public void removeAt(int index){
            if(index == 0){
                removeFirst();
            }else{
                Node temp = head;
                for(int i = 0; i < index - 1; i++){
                    temp = temp.next;
                }
                temp.next = temp.next.next;
                if(temp.next == null){
                    tail = temp;
                }
            }
        }
        
        
//        TUGAS
//        NOMER 1 MEMBUAT METHOD INSERTBEFORE
        
        //mencari node(data) terlebih dahulu lalu menambahkan node(data) dengan menyisipkan sebelum
        //node yang memiliki data sama dgn key
        public void insertBefore(int key, int input){
            Node ndInput = new Node(input, null);
            Node temp = head;
            do{                                                   
                if(temp.next.data == key){
                    ndInput.next = temp.next;
                    temp.next = ndInput;
                    if(ndInput.next.next == null) tail = ndInput.next;
                    break;
                }
                temp = temp.next;                    
            }while (temp != null);                
        }
        
        
        
}
        
    


