package FunctionPrograms;

import java.sql.SQLOutput;
import java.util.function.Function;

class Employee
{
    String name;
    int marks;
    public Employee(String name, int marks){
        this.name = name;
        this.marks = marks;
    }
}
public class Function1 {
    public static void main(String[] args) {
        Employee[] em = {new Employee("Abhishek", 55),
                new Employee("Yash", 80),
                new Employee("Chirag", 40),
                new Employee("Om", 25)
        };
        Function<Employee,String> f1 = i ->{
        int marks = i.marks;
        String grade = "";
        if(marks >= 70) grade="A[Destinction]";
        else if(marks >=50) grade="B[First Class]";
        else if(marks >= 35) grade="C[Second Class]";
        else grade="D[Fail]";
        return grade;
        };

        for(Employee e : em)
        {
            System.out.println("Student name is: "+e.name);
            System.out.println("Marks is: "+e.marks);
            System.out.println("Grade is: "+f1.apply(e));
            System.out.println();
        }

    }
}