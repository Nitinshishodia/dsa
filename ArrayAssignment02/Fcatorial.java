import java.util.Scanner;

import javax.naming.spi.DirStateFactory.Result;

import java.io.*;
class Fcatorial {
    public static void factorialNUm(int n){
        int result=0;
        if(n==0 || n==1){
            return 1;
        }
        else{
             result=n*factorialNUm(n-1);
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        // enter number which you want to be factorial.
        System.out.println("enter the number :");
        int n=Sc.nextint();
        int result= factorialNUm(n);
        System.out.println("The FACTORIAL OF GIVEN NUMBER IS "+ result);
        
    }
}
