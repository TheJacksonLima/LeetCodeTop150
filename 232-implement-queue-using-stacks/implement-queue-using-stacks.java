class MyQueue {
    Stack<Integer> stackIn;
    Stack<Integer> stackOut;

    public MyQueue() {
        stackIn = new Stack<>();
        stackOut = new Stack<>();
    }
    
    public void push(int x) {
        stackIn.push(x);
    }
    
    public int pop() {
        moveInToOut();
        return stackOut.pop();
        
    }
    
    public int peek() {
        moveInToOut();
        return stackOut.peek();
    }
    
    public boolean empty() {
        return stackOut.isEmpty() &&  stackIn.isEmpty();
    }

    private void moveInToOut(){
        if(stackOut.isEmpty()){
            while(!stackIn.isEmpty()){
                stackOut.push(stackIn.pop());
            }
        }
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */