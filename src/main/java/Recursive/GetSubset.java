package Recursive;

import java.util.ArrayList;
import java.util.Collections;

public class GetSubset {

    public ArrayList<ArrayList<Integer>> makeSet(ArrayList<Integer> set){
        ArrayList<ArrayList<Integer>>AllSubSet = new ArrayList<ArrayList<Integer>>();
        int max = 1<<set.size();
        for(int i =0; i<max-1;i++){
            ArrayList<Integer> subset = convertIntToSet(i,set);
            AllSubSet.add(subset);
        }
        return AllSubSet;
    }

    private ArrayList<Integer> convertIntToSet(int i, ArrayList<Integer> set) {
        ArrayList<Integer> Subset = new ArrayList<Integer>();
        int index=0;
        for(int j=i;j>0;j>>=1){
            if((j&1)==1){
                Subset.add(set.get(index));
            }
            index++;
        }
        return Subset;
    }
}
