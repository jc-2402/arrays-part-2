// max subarray sum by kadan's algo
// if cs is negative take it as 0
import java.util.*;
public class array11{
    public static void main(String args[]){
        int num[] = {-2,-3,4,-1,-2,1,5,-3};
        int num2[] ={-1,-2,-3,-4};
        kadan(num);
        // kadan will give 0 if all input array data is negative so the max sum is 0
        // which is not true, so we take smallest and display the least negative as max sum
        //kadan(num2);
    }
    public static void kadan(int num[]){
        int ms = Integer.MIN_VALUE;
        int cs =0 ;
        for(int i =0; i<num.length ; i++){
            cs = cs + num[i];
            if(cs < 0){ // cs is negative then take cs as 0
                cs =0;
            }
            ms = Math.max(cs,ms);
           // for all negative

            
        }
        System.out.println("max sum is "+ms);
    }
}