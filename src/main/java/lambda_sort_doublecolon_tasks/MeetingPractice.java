package lambda_sort_doublecolon_tasks;


import java.util.Comparator;

import static lambda_sort_doublecolon_tasks.DataGenerator.*;
import static lambda_sort_doublecolon_tasks.Service.getAllEmployees;

public class MeetingPractice {

    public static void main(String[] args) {
        createAllAddresses();
        createAllCompanies();
        createAllEmployees();

        //When you start to solve new question, comment out the System.out.println statement

        // EXAMPLE
        //  System.out.println("*** get all employees if their Id number is odd");

//        System.out.println("*************** solution with behavior parameterization ****************");
//        List<Employee> list = filter(getAllEmployees(), employee -> employee.getId() % 2 !=0);
//        list.forEach(System.out::println);

//        System.out.println("*************** solution with forEach() method **************");
//        getAllEmployees().forEach(employee -> {if (employee.getId() % 2 !=0){
//            System.out.println(employee);}
//        });

//        System.out.println("*************** solution with forEach() method **************");
//        getAllEmployees().stream()
//                .filter(employee -> employee.getId() %2 !=0)
//                .forEach(System.out::println);


        //System.out.println("*** get all employees if their Id number is even");


        //System.out.println("*** get all employees if they are older than 50");


        //System.out.println("*** get all employees whose company name info starts with A or a");



        //System.out.println("*** get all employees their company is located in Utah, Indiana or California as a state ");



        //System.out.println(" show all the employees full name and corresponding age information in one list");



        //System.out.println("*** get just the fullName of all employees if their Id number is even");



        //System.out.println("***just print the employees if their company address id is 6");



        //System.out.println("***print all employees***");



        //System.out.println("***SORTING QUESTIONS***");

        //System.out.println("sort all employees with age in ascending order and then print their ages and names");


        //System.out.println("sort all employees with company id in ascending order and then print company id and company names");


        //System.out.println("sort all employees with age in descending order and then print their ages and names");


        //System.out.println("*** sort all employees with full name in ascending order and print only their full names ***");



        //System.out.println("*** sort all employees with full name in descending order and print only their full names ***");



        //System.out.println("***sort all employees with company name in ascending order***");


        //System.out.println("***sort all employees with company name in descending order***");



        //System.out.println("***sort all employees with their gender and then with their company name both in ascending order***");



        //System.out.println("***sort all employees with their gender in ascending order and then with their name in descending order***");


        //System.out.println("***sort all employees with their gender in ascending order and then with their company name in descending order***");



        //System.out.println("***sort all employees with their company name in descending order and then with their full name in ascending order***");
        // this task cannot be solved similar to previous sorting tasks, we need to use twe compareTo method

   }
}
