package streamapi;

import java.util.*;
import java.util.stream.Collectors;

public class StreamFilter {
    public static void main(String[] args) {
        List<Integer> number = new ArrayList<>();
        number.add(12);
        number.add(58);
        number.add(46);
        number.add(99);
        number.add(25);

        for(Integer i: number)
        {
            System.out.print(i+" ");
        }
        System.out.println();

        List<Integer>filterResult  = number.stream().filter(i -> i%2==0).collect(Collectors.toList()); // Used filter Operator to filter the even numbers..
        System.out.println(filterResult);
        System.out.println();

        //Increase marks in collection by 5.

        List<Integer> mapResult = number.stream().map(i -> i+5).toList();
        System.out.println(mapResult);
        System.out.println();

        Optional<Integer>reduceResult = number.stream().reduce((a, b) -> a>b?a:b);
        System.out.println(reduceResult);
        System.out.println();

        String[]names ={"Chirag","Abhishek","Shantanu","om","Adarsh"};
        Arrays.stream(names).filter(p -> p.startsWith("A")).forEach(System.out::println); // forEach is used to iterate the stream.

       long countElements = mapResult.stream().count();
        System.out.println("There are "+countElements+" elements in stream");
        System.out.println();

        List<Integer> sortResult = number.stream().sorted().toList(); // sorted in ascending order
        System.out.println(sortResult);

        List<Integer> sort = number.stream().sorted((x,y)->x<y?1:x>y?-1:0).toList();//sorted(Comparator) is used for customized sorting.
        System.out.println(sort);

        ArrayList<String> name = new ArrayList<>();
        name.add("Abhishek");
        name.add("Anurag");
        name.add("Yash");
        name.add("Prathmesh");
        name.add("Om");


        List<String>nameSort = name.stream().sorted((s1,s2) -> s1.compareTo(s2)).toList(); // used to sort the string.
        System.out.println(namesort);
        System.out.println();
        List<String>sortNames = name.stream().sorted((s1,s2) -> -s1.compareTo(s2)).toList(); // used to sort the string.
        System.out.println(sortNames);

        Comparator<String> customSort =(s1,s2) -> {
          int l1 = s1.length();
          int l2 = s2.length();
          if(l1<l2) return -1;
          else if(l1>l2) return +1;
          else return s1.compareTo(s2);
        };
        List<String>customSortResult = name.stream().sorted(customSort).toList(); // Customized Sorting.
        System.out.println(customSortResult);

        int minimum = number.stream().min((i1,i2) -> i1.compareTo(i2)).get();
        System.out.println(minimum);

        Integer[]i = al.stream().toArray(Integer[]::new);
        for(int a: i)
        {
            System.out.println(i);
        }
    }
}
