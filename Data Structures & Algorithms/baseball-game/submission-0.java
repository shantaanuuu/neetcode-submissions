class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();
        for(String op : operations){
            if(op.equals("+")){
                int top = stack.pop();
                int ttop = stack.pop();
                int ntop = top + ttop;

                stack.push(ttop);
                stack.push(top);
                stack.push(ntop);

            }else if(op.equals("D")){
                stack.push(2 * stack.peek());
            }else if(op.equals("C")){
                stack.pop();
            }else{
                stack.push(Integer.parseInt(op));
            }
        }
        int sum = 0;
        for(int score : stack){
            sum += score;
        }
        return sum;
    }
}