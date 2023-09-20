/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prak1BinarySearchTreeLL;

/**
 *
 * @author E P H I N
 */
public class BinaryTree {
    
    Node root;

    public BinaryTree() {
        root = null;
    }
    
    boolean isEmpty(){
        return root == null;
    }
    
    void add(int data){
        if(isEmpty()){ //cek apakah kosong
            root = new Node(data);
        }else{
            Node current = root;
            while(true){
                if(data<current.data){
                    if(current.left != null){
                        current = current.left;
                    }else{
                        current.left =  new Node(data);
                        break;
                    }
                }else if(data>current.data){
                    if(current.right != null){
                        current = current.right;
                    }else{
                        current.right = new Node(data);
                        break;
                    }
                }else{//data sudah ada
                    break;
                }
            }
        }
    }
    
//    proses mencari data
    boolean find(int data){
        boolean hasil = false;
        Node current = root;
        while (current != null) {
            if(current.data == data){
                hasil = true;
                break;
            }else if(data < current.data){
                current = current.left;
            }else{
                current = current.right;
            }
        }
        return hasil;
    }
    
//    method traverse  digunakan untuk mengunjungi dan 
//    menampilkan node-node dalam tree
    void traversePreOrder(Node node){
        if(node != null){
            System.out.print(" "+ node.data);
            traversePreOrder(node.left);
            traversePreOrder(node.right);          
        }
    }
    
    void traversePostOrder(Node node){
        if (node != null){
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            System.out.print(" " + node.data);
        }
    }
    
    void traverseInOrder(Node node){
        if(node != null){
            traverseInOrder(node.left);
            System.out.print(" " + node.data);
            traverseInOrder(node.right);
        }
    }
    
//    proses penghapusan node yang memiliki 2 child
    Node getSuccessor(Node del){
        Node successor = del.right;
        Node successorParent = del;
        while (successor.left != null) {            
            successorParent = successor;
            successor = successor.left;
        }
        if(successor != del.right){
            successorParent.left = successor.right;
            successor.right = del.right;
        }
        return successor;
    }
    
    void delete(int data){
        if(isEmpty()){
            System.out.println("Tree is empty");
            return;
        }
        
//        mencari node (current) yang akan di hapus
        Node parent = root;
        Node current = root;
        boolean isLeftchild = false;
        while(current != null){
            if(current.data == data){
                break;
            }else if(data < current.data){
                parent = current;
                current = current.left;
                isLeftchild = true;
            }else if(data > current.data){
                parent = current;
                current = current.right;
                isLeftchild = false;
            }
        }
        
        //proses penghapusan terhadap node current yang telah ditemukan
        if(current == null){
            System.out.println("Couldn't find data");
            return;
        }else{
            //jika tidak ada child maka hapus
            if(current.left == null && current.right == null){
                if(current == root){
                    root = null;
                }else{
                    if(isLeftchild){
                        parent.left = null;
                    }else{
                        parent.right = null;
                    }
                }
            }else if(current.left ==  null){ //jika ada 1 child (right)
                if(current == root){
                    root = current.right;
                }else{
                    if(isLeftchild){
                        parent.left = current.right;
                    }else{
                        parent.right = current.right;
                    }
                }
            }else if(current.right == null){ //jika ada 1 child di kiri(left)
                if(current == root){
                    root =  current.left;
                }else{
                    if(isLeftchild){
                        parent.left = current.left;
                    }else{
                        parent.right = current.left;
                    }
                }
            }else{ //jika ada 2 child
                Node successor = getSuccessor(current);
                if(current == root){
                    root = successor;
                }else{
                    if(isLeftchild){
                        parent.left = successor;
                    }else{
                        parent.right = successor;
                    }
                    successor.left = current.left;
                }
            }
        }
    }
    
    
}
