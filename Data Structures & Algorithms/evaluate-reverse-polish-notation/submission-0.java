class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>() ;
        for(String i : tokens){
            if(!i.equals("+") && !i.equals("-") &&
               !i.equals("*") && !i.equals("/")) {
                st.push(Integer.parseInt(i)) ;
            }
            else{
                int b = st.pop() ;
                int a = st.pop() ;
                int c = 0;
                if(i.equals("+")) {
                    c = a + b;
                }
                else if(i.equals("-")) {
                    c = a - b;
                }
                else if(i.equals("*")) {
                    c = a * b;
                }
                else {
                    c = a / b;
                }
                st.push(c) ;
            }
        }
        return st.peek() ;
    }
}
