
public class MergeSort {
    public static void mergesort(int arr[],int si, int ei){
        if( si>=ei ){
            return;
        }

    
        int mid = si+(ei-si)/2;

        //left part
     mergesort(arr,si,mid-1);

        //Right part
        mergesort(arr, mid+1, ei);

       merge(arr, si, mid, ei);

    }

    public static void merge(int arr[],int si,int mid,int ei){

       int temp[] = new int[ei-si+1];
       int i = si;
       int j = mid+1;
       int k = 0;

       while(i <= mid && j <= ei){

        if(arr[i]  <=  arr[j]){
          temp[k] = arr[i];
          i++;
       } else {
           temp[k] = arr[j];
           j++;
        }
       k++;
    }

    //left part remaning

    while(i <= mid){  
        temp[k++]=arr[i++];
    }

    //left part remaning  

    while(i <= mid){  
        temp[k++]=arr[j++];
    }

    //copy temp array to original array

    for(k=0,i=si; k<temp.length; k++,i++){
      arr[i] = temp[k];

    }
    }

    public static void PrintArray(int arr[]){ 
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }  

    public static void main(String[] args) {
        int arr[]={5,7,8,3,4,2};

        mergesort(arr, 0, arr.length-1);
      
        PrintArray(arr);
        
    }
    
}
