package operation;

public class Main {
    public static void main(String[] args) {
        //traditional way
        SumOperationImpl obj=new SumOperationImpl();
        System.out.println("Sum is: "+obj.operation(20,40));


        //Lambda Expression
        MathOperation add=(a,b)->a+b;//Addition
        MathOperation subtract=(a,b)->a-b;//Subtraction
        MathOperation multiplication=(a,b)->a*b;//Addition
        MathOperation division=(a,b)->a/b;//Subtraction
        System.out.println("Addition of two number is: "+add.operation(90,30));
        System.out.println("Subtraction of two number is: "+subtract.operation(90,30));
        System.out.println("Multiplication of two number is: "+multiplication.operation(90,30));
        System.out.println("Division of two number is: "+division.operation(90,30));

    }
}
