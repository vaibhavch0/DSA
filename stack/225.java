// 225 leetcode.com/problems/implement-stack-using-queues/
/*
class MyStack {
    Queue<Integer> q1;
    Queue<Integer> q2; 
    public MyStack() {
        q1 = new LinkedList<>();
        q2 = new LinkedList<>();
    } 
    public void push(int x) {
        q1.add(x);
    } 
    public int pop() {
        while (q1.size() > 1) {
            q2.add(q1.poll());
        }
        int poppedElement = q1.poll();
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;
        return poppedElement;
    }      
    public int top() {
        while (q1.size() > 1) {
            q2.add(q1.poll());
        }
        int topElement = q1.poll();
        q2.add(topElement);
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;
        return topElement;
    }     
    public boolean empty() {
        return q1.isEmpty();
    }
}  
isme hmne stack ko queue se implement krna h
isme hmne do queue banayi q1 and q2
push m hmne q1 m element add kr diya
pop m hmne q1 se sare element except last ek ek krke q2 m dal       diya
fir last element ko pop kr diya
fir q1 and q2 ko swap kr diya
top m bhi same process h bus last element ko wapis q2 m dal diya
empty m hmne check kr diya ki q1 empty h ya nhi      
*/
// 225      
