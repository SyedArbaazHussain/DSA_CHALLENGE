// Problem: Given a list of integers and a target value, find two distinct indices whose values sum up to the target. Return the pair of indices.

// Solution:
package problems.Day_01.Java;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.printf("Enter a size value for Array a : \n");
        int aSize = s.nextInt();
        System.out.printf("Enter a target value for Array b : \n");
        int bSize = s.nextInt();
        int[] a = new int[aSize];
        int[] b = new int[bSize];
        System.out.printf("Enter a elements for Array a : \n");
        for(int i=0;i<aSize;i++){
            a[i] = s.nextInt();
        }
        System.out.printf("Enter a elements for Array b : \n");
        for(int i=0;i<bSize;i++){
        	b[i] = s.nextInt();
        }
        System.out.printf("Enter a target value to search : \n");
        int target = s.nextInt();
        System.out.printf("\nSearching.......\n");
        solution(a,b,aSize, bSize,target);
        s.close();
    }

    static void solution(int[] a, int[] b, int aSize, int bSize, int target){
        int i=0, j=0, flag = 0;
        for(i=0;i<aSize;i++){
            for(j=0;j<bSize;j++){
                if((a[i]+b[j]) == target){
                    if(flag == 0 ){
                        System.out.printf("\nMatch Found:\n");
                    }
                    flag = 1;
                    System.out.printf("a[%d] = %d , b[%d] = %d \n",i,a[i],j,b[j]);
                }
            }
        }
        if(flag == 0 ){
            System.out.printf("\nNo match found\n");
        }
        System.out.printf("\n");
    }
}
