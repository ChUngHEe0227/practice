package StringAndArray;


import java.util.Arrays;

public class SameUnionArray {
    public String sort(String StringSource)
    {
        char[] content = StringSource.toCharArray();
        Arrays.sort(content);
        return new String(content);
    }
    public boolean SameUnionArraycheck(String Original, String compare){
        System.out.println(sort(Original).equals(sort(compare)));
        return sort(Original).equals(sort(compare));

    }

}
