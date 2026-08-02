class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack();
        for(String s:tokens){
            if(isNumber(s)){
                stack.push(Integer.valueOf(s));
            }
            else{
                int n2 = stack.pop();
                int n1 = stack.pop();

                if(s.equals("+")){
                    stack.push(n1+n2);
                }
                if(s.equals("*")){
                    stack.push(n1*n2);
                }
                if(s.equals("/")){
                    stack.push(n1/n2);
                }
                if(s.equals("-")){
                    stack.push(n1-n2);
                }
            }
        }
        return stack.peek();
    }

    public boolean isNumber(String text) {
    try {
        Double.parseDouble(text);
        return true;
    } catch (NumberFormatException e) {
        return false;
    }
}
}
