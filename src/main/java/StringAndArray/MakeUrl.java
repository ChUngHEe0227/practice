package StringAndArray;

import java.util.Arrays;

public class MakeUrl {
    public char[] changeUrl(char[] StringSource){
        int SpaceCount = 0;
        int Index = 0;
        int truelengh = StringSource.length;
        for(int i = 0; i<truelengh;i++){
            if (StringSource[i]==' '){
                SpaceCount++;
            }
        }
        Index = SpaceCount*2 + truelengh;
        char[] value = new char[Index];
        value[Index-1]='\0';
        for (int i = truelengh-1; i>=0;i--){
            if (StringSource[i] ==' '){
                value[Index-1] ='0';
                value[Index-2] ='2';
                value[Index-3] ='%';
                Index = Index-3;
            }
            else{
                value[Index-1] = StringSource[i];
                Index--;
            }
        }

        System.out.println(value);
        return value;
    }
}
