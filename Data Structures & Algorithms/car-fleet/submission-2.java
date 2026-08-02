class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        TreeMap<Integer, Double> hm =new TreeMap();
        for(int i=0;i<position.length;i++){
            hm.put(position[i], (double)(target - position[i]) / speed[i]);
        }

        Stack<Double> stack = new Stack();
        for(Map.Entry<Integer,Double> m:hm.entrySet()){
            while(!stack.isEmpty() && 
                stack.peek() <= m.getValue())
            {
                stack.pop();
            }
            stack.push(m.getValue());    
        }
        
        return stack.size();
    }
}
