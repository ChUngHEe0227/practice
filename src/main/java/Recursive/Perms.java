package Recursive;

import java.util.ArrayList;



public class Perms {
    public ArrayList<String> getPerms(String strings){
        if(strings==null) return null;
        ArrayList<String> perm = new ArrayList<String>();
        if(strings.length()==0){
            perm.add("");
            return perm;
        }
        char first =strings.charAt(0);
        String reminder = strings.substring(1);
        ArrayList<String> words= getPerms(reminder);
        for(String word:words) {
            for(int i=0;i<=word.length();i++) {
                String s= insertCharAt(word,i,first);
                perm.add(s);
            }
        }
        return perm;

    }

    String insertCharAt(String word,int i,char c){
        String Start = word.substring(0,i);
        String end = word.substring(i);
        return  Start+c+end;
    }


}
