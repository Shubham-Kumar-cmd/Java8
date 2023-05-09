package stream.api;

import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamObjects {
    public static void main(String[] args) {
        Stream emptystream= Stream.empty();
        emptystream.forEach(i-> System.out.print(i));
        System.out.println();

        String name[] = {"Ajit","Ranjeet","Bikash","Binay","Aman","Abhishek","Ajay","Ritu","shubham","Anuj","Anil","Sachin","Anju"};
        Stream<String> strStream=Stream.of(name);
        strStream.forEach(i-> System.out.print(i+" "));

        System.out.println();
        int []arr={10,9,2,4,3,7,6,12,66,33,25,32,54,56,75};
        IntStream intStream= IntStream.of(arr);
        intStream.forEach(i-> System.out.print(i+" "));

        System.out.println();
        List<Integer> list= List.of(10,9,2,4,3,7,6,12,66,33,25,32,54,56,75,45);
        Stream<Integer> listStream= list.stream();
        listStream.forEach(i-> System.out.print(i+" "));
    }
}
