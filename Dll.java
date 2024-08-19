import java.util.*;
public class Dll {

public static void divide(int a[],int si, int ei){
   if (si<ei) {
      return;
   }
   int mid=(si+ei)/2;
   divide(a, si, mid);
   divide(a, mid+1, ei);
   conquer(a,si,mid,ei);
}
public static void conquer(int a[],int si,int mid,int ei){
int merger[]= new int[a.length];
int idx1=si;
int x=0;
int idx2 =mid+1;
while (idx1 <=mid && idx2 <=ei) {
    if (idx1 < idx2) {
      merger[x++]=a[idx1++];
    }else{
      merger[x++]=a[idx2++];
    }
}
while (idx1<=mid) {
  merger[x++]=a[idx1++];
}
while (idx2<=ei) {
  merger[x++]=a[idx2++];
}
for(int i=0, j=si; i<merger.length;i++){
  a[j]=merger[i];
}
}
  public static void main(String[] args) {
    int a[]={34,45,23,22,19};
     divide(a, 0, a.length-1);
     for(int i=0;i<a.length;i++){
      System.out.println(a[i]);
     }
  }
}
