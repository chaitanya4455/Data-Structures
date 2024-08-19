import java.util.*;

import NSE.stack;

import java.math.*;
public class PPOP {
 
static class Node{
  int data;
  Node next;
  Node(int data){
    this.data=data;
    this.next=null;
  }
}
static Node head=null;
static int size =0;
public static void addFirst(int data){
  Node newNode = new Node(data);
   size++;
    if(head==null){
         head= newNode ;
         return;
    }
    newNode.next =head;
   head= newNode; 
}
public static void addLAst(int data){
  Node newNode = new Node(data);
  size++;
  if(head==null){
    head= newNode ;
    return;
    
}
Node curNode= head;
while (curNode.next !=null) {
  curNode=curNode.next;
}
curNode.next= newNode;

}
public static void DeleteLast(){
if(head==null){
  System.out.println("Linked List is Empty");
  return;
}
Node cNode=head;
while (cNode.next.next !=null) {
 
  cNode=cNode.next;
}
cNode.next=null;
size--;
}
public static void print(){
  if(head==null){
    System.out.println("Linked List is Empty");
    return;
  }
  Node cNode =head;
  while (cNode !=null) {
    System.out.println(cNode.data);
    cNode=cNode.next;
  }
}
public static void reverse(){
  if(head==null){
    System.out.println("Null");
  }
  Node prev=head;
  Node currNode=head.next;
  while (currNode !=null) {
    Node currnext = currNode.next;
  currNode.next=prev;
 // currnext.next=currNode;
    //update
    prev=currNode;
    currNode=currnext;
  }
head.next =null;
head= prev;
}
public static void nnDelete(int num ,int size){
  if(head==null){
    System.out.println("Linked List is Empty");
    return;
  }
  int num2= size-num;
  Node prevNode=head;
  Node cuNode=head.next;
  int temp=1;
  if(num2==1){
    head=head.next;
  }
  if(num2==2){
    prevNode.next= cuNode.next;
  }
  while (temp<num2-1) {
    prevNode=prevNode.next;
    cuNode=cuNode.next;
    temp++;
  }
  prevNode.next =cuNode.next;
 
}
public static boolean hasCycle(){
  if(head==null){
    System.out.println("Empty Linked List");
    return false;
  }

  Node rabbit = head;
  Node turtle= head;

  while (rabbit !=null && rabbit.next !=null) {
    rabbit = rabbit.next.next;
    turtle= turtle.next;
    if(rabbit ==turtle){
        return true;
    }
  }
return false;
}
public static int[] count(int size){
  int b[] = new int[1];
  if(head==null){
    System.out.println("Empty Linked List");
    return b;
  }
int a[]= new int[size];
Node prvNode=head;
Node curr=head.next;
int i=0;
while (prvNode !=null) {
    int temp=0;
    
    while (curr !=null) {
      
      if (prvNode.data== curr.data) {
        temp++;
      }
      curr=curr.next;
    }
    i++;
     a[i]=temp;
     prvNode=prvNode.next;
     curr=head.next;
}
return a;

}
public static void ltof(){
  if(head==null){
    System.out.println("Empty Linked List");
    return ;
  }
  Node prev= head;
  Node currNode=head.next;
  while (currNode.next !=null) {
    prev=prev.next;
    currNode=currNode.next;
  }
  prev.next=null;
 currNode.next=head;
  head=currNode;
}
public static boolean  delete(){
  if(head==null){
    System.out.println("Empty Linked List");
    return true ;
  }

  Node prev =head;
  Node currNode=head.next;
  head=currNode;
  prev.next=null;
  
  delete();
  return true;
}
public static void main(String[]args){
     PPOP pp= new PPOP();
     pp.addLAst(48);
     pp.addLAst(57);
     pp.addLAst(59);
     pp.addLAst(37);
     pp.addLAst(23);
     pp.addFirst(43);
///pp.nnDelete(2,size);
//System.out.println(pp.hasCycle());
//pp.reverse();
//  pp.print();
  /*int c []=pp.count(size+1);
  for(int i=0;i<c.length;i++){
    System.out.println(c[i]);
  }*/
    System.out.println(pp.delete());
   pp.print();
    
}
}