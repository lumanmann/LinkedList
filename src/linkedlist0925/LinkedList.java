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
public class LinkedList {
    Node first; // head
    
    
    public LinkedList(int data){
        first = new Node(data);
    }
    
    public int get(int index){
        Node node = first;
        
        // 從first跑到第（index）個
        for(int i=0;i<index;i++){
            
            if(node == null){
                return 0;
            }
            node = node.getNext();
        }
        
        // 回傳第（index）個的data
        return node.getData();
    }
    
    public void add(int data){
        Node node = first;
        
        // 跑到最後一個node
        while(node.getNext() != null){
            node = node.getNext();
        }
        
        // 加入新的node
        insert(data, node);
    }
    
    
    public void insert(int data, int index){
        Node node = first;
        
        // 從first跑到第（index）個
        for(int i=0;i<index;i++){
            if(node == null){
                return;
            }
            node = node.getNext();
        }
        
         // 加入新的node 
        insert(data, node);
    }
    
    private void insert(int data, Node pos){
        Node node = new Node(data);
        // 把上一個node的位置存到目前新的node的next
        node.setNext(pos.getNext());
        // 把上一個node的next指向目前新的node
        pos.setNext(node);
    }
    
    public void delete(int index){
        Node node = first;
        Node previous = null;
        
        
        // 從first跑到第（index）個node
        for(int i=0;i<index;i++){
            if(node == null){
                return;
            }
            // 移到下一個
            previous = node;
            node = node.getNext();
        }
        
        delete(node, previous);
    }
    
    
    private void delete(Node pos, Node trail){
        if(trail != null){
            //如果pos不是第一個 把前一個跟後一個接上
            trail.setNext(pos.getNext()); // java garbage collection會自動處理
        }else{
            //如果pos是第一個 沒有更前面的
            first = pos.getNext();
        }
    }
    
    
}
