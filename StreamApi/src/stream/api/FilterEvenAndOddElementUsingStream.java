package stream.api;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FilterEvenAndOddElementUsingStream {
    public static void main(String[] args) {
        List<Integer> al1=List.of(10,67,5,55,77,89,34,56,11);
//        System.out.println("al1 "+al1);
//        al1.add(100);//List is Immutable

        System.out.println("iterate the list using forEach method");
        al1.forEach(i-> System.out.print(i+" "));

        List<Integer> al2=new ArrayList<>();
        for (int i:al1) {
            if (i%2==0){
                al2.add(i);
            }
        }
//        System.out.println("al2 "+al2);
        System.out.println("\nCreate list and get the Even no. of element");
        al2.forEach(i-> System.out.print(i+" "));//getting even no. from the list without using Stream Api


        //Stream API
        System.out.println("\ngetting even no. from the list using Stream Api");
        Stream<Integer> slist1=al1.stream();
        List<Integer> al3=slist1.filter(i->i%2==0).collect(Collectors.toList());
        al3.forEach(i-> System.out.print(i+" "));

        System.out.println("\ngetting odd no. from the list using Stream Api");
        ArrayList<Integer> al4=new ArrayList<>();
        al4.add(6);
        al4.add(8);
        al4.add(56);
        al4.add(89);
        al4.add(23);
        al4.add(80);
        al4.add(67);
        al4.add(12);
        al4.add(3);
        al4.add(45);
        al4.add(89);
        al4.add(87);
        Stream<Integer> slist2=al4.stream();
        List<Integer> al5=slist2.filter(i-> i%2 != 0).collect(Collectors.toList());
        al5.forEach(i-> System.out.print(i+" "));
    }
}
