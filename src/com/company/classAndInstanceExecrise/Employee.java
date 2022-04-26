package com.company.classAndInstanceExecrise;
import java.util.*;
public class Employee {
    public String raisalary(String name, int sal){
        return "Surname: "+name+ " and original salary is: "+sal+ " new raised salary is "+ (1.1*sal);
    }
    public String dedsalary(String name, int sal){
        return "Surname: "+name+ " and original salary is "+sal+ "new deduct salary is "+ (sal-(0.1*sal));
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Employee emp = new Employee();
        System.out.println("Enter surname of employee:");
        String name = input.next();
        System.out.println("Enter the current salary:");
        int sal = input.nextInt();
        System.out.println("Is the employee eligible for salary raise if yes \"r\" or deduction put \"d\"");
        if (Objects.equals(input.next(), "r")) {
            System.out.println(emp.raisalary(name, sal));
        }else if(Objects.equals(input.next(),"d")){
            System.out.println(emp.dedsalary(name, sal));
        }else {
            System.out.println("Surname: "+name+" Salary: "+sal);
        }
    }
}
