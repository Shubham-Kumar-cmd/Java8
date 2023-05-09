package stream.api;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMethod {
    public static void main(String[] args) {
        List<Integer> list=List.of(10,9,2,4,3,7,6,12,16,13,25,32,15,14,17,56);
        Stream<Integer> intStream=list.stream();

        //squaring the list element
        List<Integer> squareOfNumber= intStream.map(i->i*i).collect(Collectors.toList());
        System.out.println("Square of a number");
        squareOfNumber.forEach(integer -> System.out.print(integer+" "));

        //iterating the list using method as reference
        System.out.println("\nMethod as Reference ");
        squareOfNumber.forEach(System.out::println);

        //sorting the list using Stream api
        System.out.println("After sorted the list");
//        Stream<Integer> sortStream=squareOfNumber.stream();
        Stream<Integer> sortStream=list.stream();
        sortStream.sorted().forEach(System.out::println);

        //extracting min value from list using stream
        int minElement=list.stream().min((x,y)->x.compareTo(y)).get();
        System.out.println("Minimum element in list is: "+minElement);

        //extracting max value from list using stream
        int maxElement=list.stream().max((x,y)->x.compareTo(y)).get();
        System.out.println("Maximum element in list is: "+maxElement);
    }
}
