package StringAndArray;

public class modificationExample {
    public Boolean Insert_check_Test(char[] OriginalString ,  char[] compareString){

        String LongString = OriginalString.length<compareString.length ? OriginalString.toString():compareString.toString();
        String SortString = OriginalString.length>compareString.length ? OriginalString.toString():compareString.toString();
        int LongString_index= LongString.length();
        int SortString_index= SortString.length();
        while(LongString_index<LongString.length() && SortString_index<SortString.length())
        {
            if(LongString.charAt(LongString_index)!=SortString.charAt(SortString_index))
            {
                if (LongString_index == SortString_index) return false;
                SortString_index++;
            }
            else
                LongString_index++;
                SortString_index++;
        }

        return true;
    }

    public Boolean Change_check_Test(char[] OriginalString ,  char[] compareString){
        int pass = 0;
        for(int i= 0; i< OriginalString.length;i++){
            if(OriginalString[i]!=compareString[i])
            {
                if(pass==1)
                    return false;
                pass++;
            }

        }
        return true;
    }
    public Boolean modification_Check(String Original, String compare){
        char[] OriginalString = Original.toCharArray();
        char[] compareString= compare.toCharArray();
        if(Math.abs(OriginalString.length-compareString.length)>1)
            return false;
        if(OriginalString.length-compareString.length==0)
            return Change_check_Test(OriginalString,compareString);
        return (Insert_check_Test(OriginalString,compareString));
    }
}
