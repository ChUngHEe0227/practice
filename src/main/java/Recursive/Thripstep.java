package Recursive;

import java.util.Arrays;

public class Thripstep {
    public Integer countWay(int n){
        int[] memory = new int[n+1];
        Arrays.fill(memory,-1);
        return countWay(n,memory);
    }
    public Integer countWay(int n,int[] memory){
        if(n<0){
            return 0;
        }
        else if(n==0){
            return 1;
        }
        else  if(memory[n]>-1){
            return memory[n];
        }
        else {
            memory[n]= countWay(n-1,memory)+countWay(n-2,memory)+countWay(n-3,memory);
            return memory[n];
        }
    }
}
