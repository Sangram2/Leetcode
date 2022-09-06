class MinStack {
    Stack<Long> data;
    Long min;

    public MinStack() {
        data = new Stack<>();
        min = Long.MAX_VALUE;
    }
    
    public void push(int val) {
        long val1 = val;
        
        if(data.size() == 0){
            data.push(val1);
            min = val1;
        } else if(val1 >= min){
            data.push(val1);
        } else {
            data.push(val1 + val1 - min);
            min = val1;
        }
    }
    
    public void pop() {
        if(data.peek() >= min){
            data.pop();
        } else {
            min = 2 * min - data.peek();
            data.pop();
        }
    }
    
    public int top() {
        if(data.peek() >= min){
            return data.peek().intValue();
        } else {
            return min.intValue();
        }
    }
    
    public int getMin() {
        return min.intValue();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */


// class MinStack {
//     Stack<Integer> data;
//     Stack<Integer> min;
//     public MinStack() {
//         data = new Stack<>();
//         min = new Stack<>();
//     }
    
//     public void push(int val) {
//         if(data.size() == 0){
//             data.push(val);
//             min.push(val);
//         } else {
//             data.push(val);
//             if(val <= min.peek()){
//                 min.push(val);
//             }
//         }
//     }
    
//     public void pop() {
//         if(data.peek().equals(min.peek())){
//             data.pop();
//             min.pop();
//         }
//         else{
//             data.pop();
//         }
//     }
    
//     public int top() {
//         return data.peek();
//     }
    
//     public int getMin() {
//         return min.peek();
//     }
// }

// /**
//  * Your MinStack object will be instantiated and called as such:
//  * MinStack obj = new MinStack();
//  * obj.push(val);
//  * obj.pop();
//  * int param_3 = obj.top();
//  * int param_4 = obj.getMin();
//  */