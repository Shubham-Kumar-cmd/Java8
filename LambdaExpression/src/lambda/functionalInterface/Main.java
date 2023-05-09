package lambda.functionalInterface;

//Using Functional interface:- An interface which has only one abstract method is called functional interface.
public class Main {
    public static void main(String[] args) {
        Hello hobj=()->{
            return "Hello Shubham Kumar";
        };
        System.out.println("String is: "+hobj.sayHello());


        Hello hobj2=()-> "How are you?";
        System.out.println("String is: "+hobj2.sayHello());
    }
}
