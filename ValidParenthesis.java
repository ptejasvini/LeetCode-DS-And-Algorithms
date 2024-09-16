
import java.util.*;
class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack();
        for(char i:s.toCharArray()){
            if(i == '(' || i == '{' || i == '['){
                st.push(i);
            }else {
                if(st.isEmpty()) return false;
                char c= st.pop();
                if((i == ')' && c == '(') || (i == '}' && c == '{') || (i == ']' && c == '[')){
                    continue;
                }else return false;
            }
        }
        return st.isEmpty();
    }
}
