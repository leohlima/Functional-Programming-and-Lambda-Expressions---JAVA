package Program;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class App {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(3, 4, 8, 9, 15);

        //Stream from Integer
        Stream<Integer> st1 = list.stream();
        System.out.println(Arrays.toString(st1.toArray()));

        //Applying map
        Stream<Integer> st2 = list.stream().map(x -> x * 10);
        System.out.println(Arrays.toString(st2.toArray()));

        //Putting elements directly on stream
        Stream<String> st3 = Stream.of("Celso", "Carlos", "Leo");
        System.out.println(Arrays.toString(st3.toArray()));

        //Stream witch iterate and a limit of elements
        Stream<Integer> st4 = Stream.iterate(0, x -> x + 2);
        System.out.println(Arrays.toString(st4.limit(10).toArray()));

        //Fibonacci Sequence
        Stream<Long> st5 = Stream.iterate(new long[]{ 0L, 1L }, p->new long[]{ p[1], p[0]+p[1] }).map(p -> p[0]);
        System.out.println(Arrays.toString(st5.limit(20).toArray()));

        //Pipeline: when you have more than one intermediate operations and one terminal operation
        Stream<Integer> st6 = list.stream();
        int sum = st6.reduce(0, (x, y) -> x + y);
        System.out.println("Sum = " + sum);
        List<Integer> newList = list.stream().filter(x -> x % 2 == 0).map(x -> x * 10).toList();
        System.out.println(Arrays.toString(newList.toArray()));
    }
}
