public class intersection {
    public static int intersectionArray(int num1[],int num2[])
    {
       for(int i=0; i<num1.length; i++){
       for(int j=0; j<num2.length; j++){
        if(num1[i]==num2[j]){
            System.out.println(num1[i]);
        }
       }
       }
       return result();
    }
    public static void main(String[] args) {
        int num1[]={1,2,2,1};
        int num2[]={2,2};
        // function calling
        int result=intersectionArray(num1,num2);
            System.out.println("Intersection Array is :"+result);
         
        }
    }

