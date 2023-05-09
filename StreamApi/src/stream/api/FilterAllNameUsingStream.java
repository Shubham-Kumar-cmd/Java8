package stream.api;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FilterAllNameUsingStream {
    public static void main(String[] args) {
        List<String> list=List.of("Ajit","Ranjeet","Biksah","Binay","Aman","Abhishek","Ajay","Ritu","shubham","Anuj","Anil","Sachin","Anju");
//        System.out.print(list+" ");
        list.forEach(i-> System.out.print(i+" "));
        System.out.println();
        Stream<String> strStream =list.stream();
        List<String> listOfNameStartWithALetter=strStream.filter(i->i.startsWith("A")).collect(Collectors.toList());
        listOfNameStartWithALetter.forEach(i-> System.out.print(i+" "));


    }
}
