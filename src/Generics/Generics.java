package Generics;
public class Generics {
    public static void main(String[] args){
        //Generics
        //========================================================================================================

        MyCustomStack<Integer> integerStack = new MyCustomStack<Integer>();
        MyCustomStack<String> stringStack = new MyCustomStack<String>();

        integerStack.pushOperation(1);
        System.out.println(stringStack.peekOperation());
        System.out.println(stringStack.popOperation());
        stringStack.pushOperation("hello");
        System.out.println(stringStack.peekOperation());
        integerStack.pushOperation(2);
        System.out.println(integerStack.peekOperation());
        System.out.println(stringStack.popOperation());
        System.out.println(stringStack.popOperation());
        System.out.println(integerStack.popOperation());
        System.out.println(integerStack.peekOperation());
        System.out.println(integerStack.popOperation());
        System.out.println(integerStack.popOperation());
    }
}
