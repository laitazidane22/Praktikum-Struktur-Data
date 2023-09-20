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
public class Node {
    Mahasiswa data;
    Node next;
 
    /*  Constructor  */
    public Node()
    {
        next = null;
        data = null;
    }    
    
    public Node(Mahasiswa d,Node n)
    {
        data = d;
        next = n;
    }    
    
    //set next untuk antrian berikutnya
    public void setNext(Node n)
    {
        next = n;
    }    
   
    //
    public Node getNext()
    {
        return next;
    }    
    
   
}

