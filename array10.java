// max subarray sum by prefix sum method
import java.util.*;
public class array10{
    public static void maxsumofarray(int num[]){
        int currsum = 0;
        int maxsum = Integer.MIN_VALUE;
        //prefix array
        int prefix[] = new int[num.length];
        // calculating data for prefix array
        prefix[0] = num[0];
        for(int i =1 ; i<prefix.length ;i++){
            prefix[i] = prefix[i-1]+ num[i]; // prev sum + now sum
        }
        
        // find start end 
        for(int i =1; i<num.length; i++){
            int start = i;
            for(int j =1; j<num.length; j++){
                int end =j;
                currsum = start == 0 ? prefix[end] : prefix[end] -prefix[start -1];

                if(maxsum < currsum){
                    maxsum = currsum;
                }
            }
        }
     System.out.println("max sum is "+maxsum);
    }
    public static void main(String args[]){
        int num[] = {1,-2,6,-1,3};
        maxsumofarray(num);
    }
}