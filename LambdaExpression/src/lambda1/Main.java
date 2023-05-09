package lambda1;

public class Main {
    public static void main(String[] args) {
        //Traditional way
        Sum sobj=new SumImpl();
        int sum=sobj.add(100,300);
        System.out.println("Sum is: "+sum);


        //providing implementation in anonymous class
        Sum sumInterface=new Sum() {
            @Override
            public int add(int a, int b) {
                return a+b;
            }
        };
        System.out.println("Sum is: "+sumInterface.add(10,20));


        //Lambda Expression with type with curly braces
        Sum sobj1=(int x,int y)->{
            return x+y;
        };
        System.out.println("Sum is: "+sobj1.add(20,50));

        // Lambda expression  without type  with curly braces
        Sum sobj2 = (x, y)->{
            return x + y;
        };
        System.out.println("Sum is: "+sobj2.add(501, 701));

        //Lambda expression  without type  without curly braces without return stmt
        Sum sobj3 = (x, y)-> x + y;
        System.out.println("Sum is: "+sobj3.add(1501, 1701));


    }
}