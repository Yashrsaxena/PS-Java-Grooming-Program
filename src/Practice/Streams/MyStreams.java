package Practice.Streams;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Random;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MyStreams {
    public static void main(String[] args){
        List<Random> list = new ArrayList<>();
        for(int i=0;i<100;i++) {
            list.add(new Random(100));
        }
        Stream<Random> stream = list.stream();
        System.out.println(stream.count());
        stream.forEach(System.out::println);
    }
}
