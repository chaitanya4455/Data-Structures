import java.lang.reflect.Array;
import java.util.*;
import java.util.Stack;

public class stack2 {

static int top =-1;
public void push(int[] a,int i){
    if (top== a.length-1) {
        System.out.println("Empty Stack");
        return;
    }
    top++;
    a[top]=i;

}
public void print(int[] a){
    if (top==-1) {
        System.out.println("Empty Stack");
        return;
    }
 for(int i=0;i<=top;i++){
    System.out.println(a[i]);
 }
}
public void greater(int a[]){
    if (top== -1) {
        System.out.println("Empty Stack");
        return;
    }
   for(int i=0;i<a.length-1;i++){
    int ij=0;
      for(int j=i+1;j<a.length;j++){
        
        if(ij<1){
          if(a[j]>a[i]){
            System.out.println(a[i]+" -->> "+a[j]);
            ij++;
          }
        }
      }
      if (ij==0) {
        System.out.println(a[i]+" -->>"+ "-1");
      }
   }

}
public void reverse(int a[]){
    if (top== -1) {
        System.out.println("Empty Stack");
        return;
    }
    int b[]= new int[a.length];
    int ij=-1;
    for(int i=top;i>=0;i--){
       ij++;
       b[ij]=a[i];

    }
  for(int j=0;j<a.length;j++){
    a[j]=b[j];
  }

}
public Stack sslength(String a[]){
    Stack <Integer> b = new Stack<>();
    if (top== -1) {
        System.out.println("Empty Stack");
        return b;
    }
   for(int i=0;i<a.length;i++){
    if (a[i]=="(") {
      b.push(i);
    }
    if (a[i]==")") {
      if (b.empty()) {
        b.push(i);
      }else{
          b.pop();
      }
    }
   }
return b;
}
public int[] arrayy(Stack b,Stack c){
  int a []= new int[b.size()+c.size()];
  for(int i=0;i<=(a.length/2)-1;i++){
    a[i]=(int) (b.elementAt(i));
  }
  int temp=0;
  for(int i=a.length/2;i<a.length;i++){
    a[i]=(int) (c.elementAt(temp));
    temp++;
  }
return a;
}
public void smaller(int[] a){
  if (top== -1) {
      System.out.println("Empty Stack");
      return;
  }
 for(int i=0;i<a.length;i++){
  int ij=0;
    for(int j=i+1;j<a.length;j++){
      
      if(ij<1){
        if(a[j]<a[i]){
          System.out.println(a[i]+" -->> "+a[j]);
          ij++;
        }
      }
    }
    if (ij==0) {
      System.out.println(a[i]+" -->>"+ "-1");
    }
 }

}
static int tempp=0;
static int aa[]= new int[5];
public int[] recursion(int a[], int top){
  
  if (top > -1) {
    aa[tempp]=a[top];
    tempp++;
recursion(a, top-1);
  }

return aa;
}
public int postfix(String a){
 Stack<Integer> ab = new Stack<>();
 for(int i=0;i<a.length();i++){
     char c=a.charAt(i);
     if (Character.isDigit(c)) {
     
    //  System.out.println(tm);
      ab.push(c-'0');
     }else{
      int first = ab.pop();
      int second =ab.pop();
      switch (c) {
        case '+':
          ab.push(second+first);
          break;
          case '-':
          ab.push(second-first);
          break;
          case '*':
          ab.push(second*first);
          break;
          case '/':
          ab.push(second/first);
          break;
       // default:
        //  break;
      }
     }
    
 }
 return ab.pop();
}
public void infix(String a){
  Stack<Character> ab = new Stack<Character>();
  int bc=0 ;
  char first ='0';
  for(int i=0;i<a.length();i++){
    char c=a.charAt(i);
    if (Character.isDigit(c)) {
    
   //  System.out.println(tm);
     ab.push(c);
     if(bc >0){
     ab.push(first);
      bc=0;
     }
    }else{
      ab.push(c);
      first = ab.pop();
      bc++;

}
  }
   for(int i=0;i<ab.size();i++){
    System.out.println(ab.elementAt(i));
   }
}
public  void revrsera(int a[]){
  if (top==-1) {
    System.out.println("Empty Stack");
    return;
  }
  int temp =-1;
  for(int i=a.length-1;i>a.length/2;i--){
       temp++;
      int aa= a[i] ;
      a[i]=a[temp];
      a[temp]=aa;
  }
}

    public static void main(String[] args) {
        stack2 q = new stack2();
     int a[]= new int[6];
       q.push(a,39);
       q.push(a,32);
       q.push(a,38);
       q.push(a,35);
       q.push(a,34);
      q.push(a, 45);
      
    String exp="2+3+4-5";
    String ee= "234+-4+";
    q.infix(exp);
    q.revrsera(a);
   
   q.print(a);
    }
}