public class selectionSort {
    public static void selectionSortArray(int arr[]){
        for(int i=0; i<arr.length; i++){
            // min_idx is taking the index of minimum element at every iteration.
            int min_idx=i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[j]<arr[min_idx]){
                    min_idx=j;
                }
            }
            if(min_idx!=i){
                // swap between arr[min_idx] and arr[i].
                int temp=arr[min_idx];
                arr[min_idx]=arr[i];
                arr[i]=temp;
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={20,50,10,15,17,25,65};
        // function calling
        selectionSortArray(arr);
        System.out.println("Sorted array is :");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
