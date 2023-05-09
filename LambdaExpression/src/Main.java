public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Sum sobj=new SumImpl();
        int sum=sobj.add(100,300);
        System.out.println("Sum is: "+sum);


    }
}