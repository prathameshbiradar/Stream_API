package predicatePrograms;

import java.util.function.Predicate;

public class Predicate {
    public static void main(String[] args) {
        Predicate<Integer> p1 = i -> i%2 == 0; // predicate function
        System.out.println( p1.test(34)); // testing number is even or not.

        String[]name ={"Yash","Abhishek","Om"};
        Predicate<String>newName = i -> i.length()>0; //testing the length of string greater than 0.

        for(String names : name)
        {
            if(newName.test(names))
            {
                System.out.println(names); // printing the String.
            }
        }

        int[] numbers ={13,35,44,76,32,76,44,33,55,34,67,36,43};
        Predicate<Integer> evenNumber = x -> x%2==0;
        Predicate<Integer> numberGreater = y -> y>20;
        System.out.println("Number is even and greater than 20");
        for(int number : numbers)
        {
            if(evenNumbers.and(numberGreater).test(number)) // and predicate joining
                System.out.print(number+" ");
        }
        System.out.println();
        System.out.println("Number is even or greater than 20");
        for(int number: numbers)
        {
            if(evenNumber.or(numberGreater).test(number)) // or predicate joining
            {
                System.out.print(number+" ");
            }
        }
        System.out.println();
        System.out.println(" Odd numbers are: ");
        for(int number:numbers)
        {
            if(evenNumber.negate().test(number))
            {
                System.out.print(number+" ");
            }
        }

    }
}
