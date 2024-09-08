import java.util.Scanner;
import java.io.*;

public class optimizedapproach {
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        System.out.println("enter the no of rows :");
        int m=Sc.nextint();
        System.out.println("enter the number the column ");
        int n=Sc.nextint();
        int arr[][]=new int[m][n];
        System.out.println("Enter the matrix element ");
        for(int i=0; i<m; i++){
        for(int j=0; j<n; j++){
            arr[i][j]=Sc.nextInt();
        }    
        }

        int r1,c1,r2c2;
        System.out.println("enter r1");
        r1=Sc.nextInt();
        System.out.println("enter c1");
        c1=Sc.nextInt();
        System.out.println("enter r2");
        r2=Sc.nextInt();
        System.out.println("enter c2");
        c2=Sc.nextInt();

    }
}
