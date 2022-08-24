package lambda_sort_doublecolon_tasks;


import java.util.List;

import static lambda_sort_doublecolon_tasks.DataGenerator.*;
import static lambda_sort_doublecolon_tasks.Service.*;

public class MeetingPractice {

    public static void main(String[] args) {
        createAllAddresses();
        createAllCompanies();
        createAllEmployees();

        //When you start to solve new question, comment out the System.out.println statement

        // EXAMPLE
        getAllEmployees().forEach(System.out::println);
         System.out.println("*** get all employees if their Id number is odd");
//        List<Employee> list = filter(getAllEmployees(), employee -> employee.getId() % 2 !=0);
//        list.forEach(System.out::println);

//        getAllEmployees().forEach(employee -> {if (employee.getId() % 2 !=0){
//            System.out.println(employee);}
//        });

        getAllEmployees().stream()
                .filter(employee -> employee.getId() %2 !=0)
                .forEach(System.out::println);



        //System.out.println("*** get all employees if their Id number is even");


        //System.out.println("*** get all employees if they are older than 50");


        //System.out.println("*** get all employees whose company name info starts with A or a");


        //System.out.println("*** get all employees their company is located in Utah, Indiana or California as a state ");


        //System.out.println(" show all the employees full name and corresponding age information in one list");


        //System.out.println("*** get just the fullName of all employees if their Id number is even");


        //System.out.println("***just print the employees if their address id is 6");


        //System.out.println("***print all employees***");
        //    printAll(getAllEmployees(), System.out::println);


        //System.out.println("***SORTING QUESTIONS***");


        //System.out.println("sort all employees with age in ascending order and then print their ages and names");


        //System.out.println("sort all employees with company id in ascending order and then print company id and names");


        //System.out.println("sort all employees with age in descending order and then print their ages and names");


        //System.out.println("*** sort all employees with full name in ascending order and print only their full names ***");


        //System.out.println("*** sort all employees with full name in descending order and print only their full names ***");


        //System.out.println("***sort all employees with company name in ascending order***");


        //System.out.println("***sort all employees with company name in descending order***");


        //System.out.println("***sort all employees with their gender in ascending order and then with their company name in descending order***");

    }
}
