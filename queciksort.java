public class queciksort {
     
 public static void queickSort(int arr[],int si,int ei){

  if( si >= ei){
    return;
}

   int pIdx = partition(arr, si, ei);

   queickSort(arr, si, pIdx-1);      //left 
   queickSort(arr, pIdx+1, ei);   //right

}
    public static int partition(int arr[] , int si,int ei){


    int pivot = arr[ei];
    int i =si-1;    


     for(int j =si ; j<ei; j++){
        if(arr[j]<=pivot){
            i++;
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
     }
     i++;
     int temp=pivot;
     arr[ei]=arr[i];
     arr[i]=temp;
return i;
    }

    public static void PrintArray(int arr[]){ 
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
}  
    public static void main(String[] args) {
          
        int arr[]={1,5,7,8,3,6,-5};
        queickSort(arr, 0, arr.length-1);
        PrintArray(arr);
    }
    
    
}
