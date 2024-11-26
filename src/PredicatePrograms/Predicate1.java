package PredicatePrograms;

import java.util.function.Predicate;

public class Predicate1 {
    public static void main(String[] args) {
        Predicate<Integer> p1 = i -> i%2 == 0; // predicate function
        System.out.println( p1.test(34)); // testing number is even or not.

        String[]s ={"Yash","Abhishek","Om"};
        Predicate<String>p2 = i -> i.length()>0; //testing the length of string greater than 0.

        for(String s1 : s)
        {
            if(p2.test(s1))
            {
                System.out.println(s1); // printing the String.
            }
        }

        int[] i ={13,35,44,76,32,76,44,33,55,34,67,36,43};
        Predicate<Integer> p3 = x -> x%2==0;
        Predicate<Integer> p4 = y -> y>20;
        System.out.println("Number is even and greater than 20");
        for(int z : i)
        {
            if(p3.and(p4).test(z)) // and predicate joining
                System.out.print(z+" ");
        }
        System.out.println();
        System.out.println("Number is even or greater than 20");
        for(int z: i)
        {
            if(p3.or(p4).test(z)) // or predicate joining
            {
                System.out.print(z+" ");
            }
        }
        System.out.println();
        System.out.println(" Odd numbers are: ");
        for(int z:i)
        {
            if(p3.negate().test(z))
            {
                System.out.print(z+" ");
            }
        }

    }
}
