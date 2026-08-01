class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> stack = new Stack();
        int nextMax[]=new int[temperatures.length];
        for(int i=0;i<temperatures.length;i++){
           while(!stack.isEmpty() && temperatures[stack.peek()]<temperatures[i]){
                int top = stack.pop();
                nextMax[top] = i-top;
           } 
           stack.push(i);
        }
        return nextMax;
    }
}
