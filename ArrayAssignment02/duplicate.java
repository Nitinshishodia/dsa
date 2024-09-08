public class duplicate {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,4,5,6};
        int n=arr.length;
        for(int i=0; i<n; i++){
        for(int j=i+1; j<n; j++){
            if(arr[i]==arr[j]){
                System.out.println(" Duplicate element found is : " +arr[i]);
            }
        }
        }   
        }
    }
