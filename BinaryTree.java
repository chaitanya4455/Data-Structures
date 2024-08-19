import java.util.*;


import java.math.*;
public class Equity {

  static class Node{
      int data;
      Node left,right;
      Node(int data){
        this.data=data;
        this.left=this.right=null;
      }
  }
  static int idx =-1;
  public  Node creatTree(int []Nodes){
    idx++;
    if (Nodes[idx]== -1) {
      return null;
    }
    Node newnNode= new Node(Nodes[idx]);
    newnNode.left = creatTree(Nodes);
    newnNode.right=creatTree(Nodes);
  return newnNode;
  }
public  static int height(Node root){
  if (root ==null) {
    return 0 ;
  }
  int left = height(root.left);
  int right = height(root.right);
  return Math.max(left+1, right+1);
}


static int temp=0;
public int sum(Node root, int addition ){
  if (root ==null) {
      return 0; 
  }
   
   temp =temp+root.data;

  sum(root.left, addition);
  sum(root.right, addition);

return temp;

}
public static void levelwise(Node root){
  java.util.Queue <Node> q = new LinkedList<>();
  q.add(root);
  q.add(null);
  while (!q.isEmpty()) {
    Node temp = q.remove();
    if(temp !=null){
    System.out.println(temp.data);
    q.add(temp.left);
    q.add(temp.right);
    q.add(null);
  }
}

}
static int coun =0;
public static int count(Node root){
   if (root==null) {
      return 0;
   }
   coun = coun +1;
   count(root.left);
   count(root.right);
 return coun;
}

public static int diameter(Node root){
  if (root==null) {
    return 0;
  }
  int diam1= diameter(root.left);
  int diam2= diameter(root.right);
  int diam3= height(root.left)+height(root.right)+1;
  return(Math.max(Math.max(diam2, diam1), diam3));
}
public static int issubrtee(Node root, Node root2){
  if (root==null) {
    return 0;
  }
    if () {
      
    }
}
public void printt(Node root){
  if (root ==null) {
      return; 
  }
 
  
  printt(root.left);
  System.out.print(root.data);
  printt(root.right);
}
  public static void main(String[] args) {
    
    Equity eq = new Equity();
    
    int []a ={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
    int []b= {2,4,-1,-1,5,-1,-1};
    Node root =eq.creatTree(a);
    idx =-1;
    Node root2= eq.creatTree(b);
   /*  eq.printt(root);
    System.out.println();
   int v= eq.height(root);
   System.out.println(v);
   int add=0;
   System.out.println(eq.sum(root, add));
   levelwise(root);
    */
  // System.out.println(count(root));
   //System.out.println(diameter(root));
   //System.out.println(count(root));
  eq.printt(root2); 
  issubrtee(root,root2);
  }
}