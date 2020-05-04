package LineCodingTest;

import java.util.Stack;

public class first_Question {


    public int solution(String inputString) {

        Stack<Character> bracket = new Stack<>();
        Stack<Character> smaller = new Stack<>();
        Stack<Character> small = new Stack<>();
        Stack<Character> big = new Stack<>();
        Stack<Character> bigger = new Stack<>();
        char[] charAarray = inputString.toCharArray();

        int answer = 0;
        for(int i =0; i<inputString.length();i++){
            if(charAarray[i]=='('||charAarray[i]=='['||charAarray[i]=='<'||charAarray[i]=='{'||
                    charAarray[i]==')'||charAarray[i]==']'||charAarray[i]=='>'||charAarray[i]=='}')
                bracket.push(charAarray[i]);
        }
        while(bracket.empty() != true ) {
            char chekchar = bracket.pop();
            if (chekchar==')') smaller.push(')');
            if (chekchar=='(') {
                if (smaller.empty())
                    return -1;
                smaller.pop();
                answer++;
            }
            if (chekchar==']') small.push(']');
            if (chekchar=='[') {
                if (small.empty())
                    return -1;
                small.pop();
                answer++;
            }
            if (chekchar=='}')
                big.push('}');
            if (chekchar=='{') {
                if (big.empty())
                    return -1;
                big.pop();
                answer++;
            }
            if (chekchar=='>')
                bigger.push('>');
            if (chekchar=='<') {
                if (bigger.empty()) return -1;
                bigger.pop();
                answer++;
            }
        }

        return answer;
    }


}
