class MinStack {
    Stack<Integer> stack1;
    int min = Integer.MAX_VALUE;
    Stack<Integer> stack2 = new Stack();
    public MinStack() {
        stack1 = new Stack();
    }
    
    public void push(int val) {
        min = Math.min(min,val);
        stack1.add(val);
        stack2.add(min);
    }
    
    public void pop() {
        stack1.pop();
        stack2.pop();
        if(!stack2.isEmpty()) min = stack2.peek();
        else min = Integer.MAX_VALUE;
    }
    
    public int top() {
        return stack1.peek();
    }
    
    public int getMin() {
        return min;
    }
}
