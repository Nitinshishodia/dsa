import java.io.*;
import java.util.Scanner;

public class upperDiagonal {
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter the number of rows :");
        int m=Sc.nextInt();
        System.out.println("Enter the number of column :");
        int n=Sc.nextInt();

        int arr[][]=new int[m][n];
        System.out.println("Enter the matrix element:");
        for(int i=0; i<m; i++){
        for(int j=0; j<n; j++){
        arr[i][j]=Sc.nextInt();
        }    
        }
       System.out.println("Element above second diagonal are as follow:");
       for(int i=0; i<m; i++){
       for(int j=0; j<n; j++){
        if(i+j<m-1)
        System.out.print(arr[i][j]+ " ");
       } 
       }

    }
}
