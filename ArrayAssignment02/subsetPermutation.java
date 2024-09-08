import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;

public class subsetPermutation {
    public static String swap(String str , int i , int j){
        char[] charArray = str.toCharArray();
        char temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }
    public static void permute(String str, int l, int r){
        if(l==r){
            System.out.println(str);
        }
        else{
            for(int i =l; i <=r; i++){
                str =swap(str, l, i);
                permute(str, l+1, r);
                // Backtracking
                str = swap(str, l, i);

            }
        }
    }
    public static void main(String[] args) {
    Scanner Sc = new Scanner(System.in);
    String  str1 = " XY ";
    int n1 = str1.length();
    System.out.println(" for the string " + str1 + " permutes are : ");
    permute(str1, 0, n1-1);
    System.out.println();
     String str2 = " ABC ";
     int n2 = str2.length();
     System.out.println(" for the string :" + str1 + " permutes are ");
     permute(str2, 0, n2-1);

    }
}
