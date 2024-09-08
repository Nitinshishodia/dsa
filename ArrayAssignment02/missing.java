
public class missing {
public static void main(String[] args) {
int arr[]={1,2,4,7,6,5};
int n=arr.length;
// sum of natural number 
int sum_naturalNumber=(n+1)*(n+2)/2;
int sum=0;
// sum of currrent element present in an array 
for(int i=0; i<n; i++){
    sum+=arr[i];
}    
int missingElement=0;
missingElement=sum_naturalNumber-sum;
System.out.println("Missing element present in an array :"+ missingElement);
    }
}
