package StringAndArray;

import java.util.Arrays;

public class MakeUrl {
    public void changeUrl(char[] StringSource){
        int SpaceCount = 0;
        int Index = 0;
        int truelengh = StringSource.length;
        System.out.printf(truelengh+"");
        for(int i = 0; truelengh>i;i++){
            if (StringSource[i]==' '){
                SpaceCount++;
            }
        }
        Index = SpaceCount*2 + truelengh;
        if(truelengh<StringSource.length) StringSource[truelengh]='\0';
        for (int i = truelengh-1; i>=0;i--){
            if (StringSource[i] ==' '){
                StringSource[Index-1] ='0';
                StringSource[Index-2] ='2';
                StringSource[Index-3] ='%';
                Index = Index-3;
            }
            else{
                StringSource[Index-1] = StringSource[i];
                Index--;
            }
        }
        System.out.printf(StringSource.toString());
    }
}
