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
public class BinaryTreeArray {
    int[] data;
    int idxLast;

    public BinaryTreeArray() {
        data = new int[10];
    }
    
    void populateDate(int data[], int idxLast){
        this.data = data;
        this.idxLast = idxLast;
    }
    
    void traverseInorder(int idxStart){
        if(idxStart <= idxLast){
            traverseInorder(2*idxStart+1);
            System.out.print(data[idxStart] + " ");
            traverseInorder(2*idxStart+2);
        }
    }
    
}
