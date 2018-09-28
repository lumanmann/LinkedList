/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlist0925;

/**
 *
 * @author wingyiu
 */
public class Node {
    private int data;
    private Node next; // 儲存下一個Node的參考儲存下一個Node的參考
 
    
    public Node(int data) {
        this.data = data;
    }

    
    public int getData() {
        return data;
    }

    
    public Node getNext() {
        return next;
    }
   
    
    public void setNext(Node node) {
        this.next = node;
    }
    
    
    
}
