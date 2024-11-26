package streamapi;

import java.util.*;
import java.util.stream.Collectors;

public class StreamFilter {
    public static void main(String[] args) {
        List<Integer> al = new ArrayList<>();
        al.add(12);
        al.add(58);
        al.add(46);
        al.add(99);
        al.add(25);

        for(Integer i: al)
        {
            System.out.print(i+" ");
        }
        System.out.println();

        List<Integer> al1 = al.stream().filter(i -> i%2==0).collect(Collectors.toList()); // Used filter Operator to filter the even numbers..
        System.out.println(al1);
        System.out.println();

        //Increase marks in collection by 5.

        List<Integer> al3 = al.stream().map(i -> i+5).toList();
        System.out.println(al3);
        System.out.println();

        Optional<Integer>in = al.stream().reduce((a, b) -> a>b?a:b);
        System.out.println(in);
        System.out.println();

        String[]s ={"Chirag","Abhishek","Shantanu","om","Adarsh"};
        Arrays.stream(s).filter(p -> p.startsWith("A")).forEach(System.out::println); // forEach is used to iterate the stream.

       long countElements = al3.stream().count();
        System.out.println("There are "+countElements+" elements in stream");
        System.out.println();

        List<Integer> al4 = al.stream().sorted().toList(); // sorted in ascending order
        System.out.println(al4);

        List<Integer> al5 = al.stream().sorted((x,y)->x<y?1:x>y?-1:0).toList();//sorted(Comparator) is used for customized sorting.
        System.out.println(al5);

        ArrayList<String> name = new ArrayList<>();
        name.add("Abhishek");
        name.add("Anurag");
        name.add("Yash");
        name.add("Prathmesh");
        name.add("Om");


        List<String>c = name.stream().sorted((s1,s2) -> s1.compareTo(s2)).toList(); // used to sort the string.
        System.out.println(c);
        System.out.println();
        List<String>c1 = name.stream().sorted((s1,s2) -> -s1.compareTo(s2)).toList(); // used to sort the string.
        System.out.println(c1);

        Comparator<String> c3 =(s1,s2) -> {
          int l1 = s1.length();
          int l2 = s2.length();
          if(l1<l2) return -1;
          else if(l1>l2) return +1;
          else return s1.compareTo(s2);
        };
        List<String>c5 = name.stream().sorted(c3).toList(); // Customized Sorting.
        System.out.println(c5);

        int minimum = al.stream().min((i1,i2) -> i1.compareTo(i2)).get();
        System.out.println(minimum);

        Integer[]i = al.stream().toArray(Integer[]::new);
        for(int a: i)
        {
            System.out.println(i);
        }
    }
}
