package functionPrograms;

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
public class Function {
    public static void main(String[] args) {
        Employee[] employee = {new Employee("Abhishek", 55),
                new Employee("Yash", 80),
                new Employee("Chirag", 40),
                new Employee("Om", 25)
        };
        Function<Employee,String> gradeEmployee = i ->{
        int marks = i.marks;
        String grade = "";
        if(marks >= 70) grade="A[Destinction]";
        else if(marks >=50) grade="B[First Class]";
        else if(marks >= 35) grade="C[Second Class]";
        else grade="D[Fail]";
        return grade;
        };

        for(Employee employess : employee)
        {
            System.out.println("Student name is: "+employess.name);
            System.out.println("Marks is: "+employess.marks);
            System.out.println("Grade is: "+gradeEmployee.apply(employess));
            System.out.println();
        }

    }
}
