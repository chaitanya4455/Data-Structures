import java.lang.reflect.Array;
import java.util.*;

public class PMI {

static int top=-1;
public static void push(int a[],int data){
  top++;
    if (top==a.length) {
      return;
    }
    a[top]=data;
    
}  
public static void pop(int a[]){
  
    if (top==-1) {
      return;
    }
    top--;
}  
public static void reverse(int a[]){
  
  if (top==-1) {
    return;
  }
  int temp=-1;
  int ii;
  for(int i=top;i>=(top/2);i--){
     temp++;
    ii=a[temp];
    a[temp]=a[top];
    a[top]=ii;
  }
}
public static void sort(int a[]){
  if (top==-1) {
    return;
  }
 for(int i=0;i<top;i++){
     for(int j=i+1;j<=top;j++){
         if (a[j]<a[i]) {
            int temp =a[i];
            a[i]=a[j];
            a[j]=temp;
         }
     }
 }
}
public static void print(int a[]){
  if (top==-1) {
    return;
  }
  for(int i=0;i<=top;i++){
    System.out.println(a[i]);
  }
}

    public static void main(String[] args) {
        int a[]= new int[5];
        push(a, 65);
        push(a, 35);
        push(a, 55);
       push(a, 28);
       // push(a, 25);
       // print(a);
        sort(a);
        print(a);
        
    }
}
