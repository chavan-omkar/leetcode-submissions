class Solution {
    public boolean isValid(String s) {

        
        char[] stack = new char[s.length()];
        int top = 0;

        for(char c : s.toCharArray()){

            switch(c){
                case '('    : stack[top++] = ')';
                                break;
                case '['    : stack[top++] = ']';
                                break;
                case '{'    : stack[top++] = '}';
                                break;  

                case ')'    :
                case ']'    :
                case '}'    : if(top == 0 || stack[--top] != c)
                               return false;
                               break;                     
            }
           
    }
     return top == 0;

// Stack<Character> stack = new Stack<>();

// for (int i = 0; i < s.length(); i++) {
//             char c = s.charAt(i);

            // if ((c == '(') || (c == '[') || (c == '{')) {
            //     stack.push(c);
            // } else {
            //     if (stack.isEmpty()) {
            //         return false;
            //     }
            //     char c1 = stack.pop();
            //     if ((c == ')' && c1 == '(') ||
            //             (c == ']' && c1 == '[') ||
            //             (c == '}' && c1 == '{')) {
            //         continue;
            //     } else {
            //         return false;
            //     }
            // }
    // }

        // }
        
    // return stack.isEmpty();

// }
    }
}
