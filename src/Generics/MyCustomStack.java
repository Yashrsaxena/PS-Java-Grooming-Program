package Generics;
import java.util.Stack;

public class MyCustomStack<T> {
    Stack<T> stack = new Stack<>();

    public void pushOperation(T value){
        stack.push(value);
    }

    public T popOperation(){
        if(stack.isEmpty()) {
            return (T) "No value present to Pop";
        }
        return stack.pop();
    }

    public T peekOperation(){
        if(stack.isEmpty()) {
            return (T) "No value present to Peek";
        }
        return stack.peek();
    }
}
