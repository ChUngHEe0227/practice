package StringAndArray;

import java.util.Arrays;

public class palindrome
{
    public String sort(String StringSource)
    {
        char[] content = StringSource.toCharArray();
        Arrays.sort(content);
        return new String(content);
    }
    public Boolean palindromeCheck(String StringSource)
    {
        if (StringSource.length()==StringSource.length()%2*2) {
            return palindromeTest(StringSource, 0);
        }
        else {
            return palindromeTest(StringSource, 1);
        }
    }

    public Boolean palindromeTest(String StringSource,int odd_number_status){
        int odd = odd_number_status;
        char[] chararays = sort(StringSource).toCharArray();
        for(int i=0;i<chararays.length;i=i+2){
            if(chararays[i]!=chararays[i+1]){
                if(odd_number_status == 1) {
                    i--;
                    odd_number_status--;
                }
                else return false;
            }
        }
        return true;

    }

}
