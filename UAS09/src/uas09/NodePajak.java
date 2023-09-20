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
public class NodePajak {
    Pajak dataPajak;
    NodePajak next;
    
    public NodePajak() {        
        next = null;
        dataPajak = null;        
    }

    public NodePajak(Pajak d, NodePajak n) {
        this.dataPajak = d;
        this.next = n;
    }
    
    public NodePajak getNext(){    
        return next;
    } 
}
