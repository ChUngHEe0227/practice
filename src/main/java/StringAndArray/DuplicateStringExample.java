package StringAndArray;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

public class DuplicateStringExample {

    public Boolean CheckDuplicateString(String checkString){
        String stream = new String(checkString);
        System.out.print(checkString);
        Boolean[] char_value = new Boolean[128];
        Arrays.fill(char_value,false);
        for (int i=0 ;i<stream.length();i++){
            int val = stream.charAt(i);
            if(char_value[val]){
                System.out.print("Duplicate");
                return false;
            }
            char_value[val] = true;

        }
        return true;
    }

}
