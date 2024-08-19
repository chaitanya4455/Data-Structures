public class FCF {
    
public static int partition(int a[],int low , int high){
int pivot = a[high];
int i= low-1;
  for(int j=low;j<high;j++){
    if(a[j]<pivot){
         i++;
         int temp = a[j];
         a[j]=a[i];
         a[i]=temp;
    }

  }
  i++;
int temp =a[i];
a[i]=pivot;
a[high]=temp;
return i;
}
    public static void quickSort(int a[],int low,int high){
        if(low < high){
             int pidx = partition(a,low,high);
             quickSort(a,low,pidx);
             quickSort(a, pidx+1,high);
        }
    }
    
    public static void main( String []args){
        int a[]={24,3,23,12,34,54};
        int n = a.length;
        
        quickSort(a,0,n-1);
    }
}
