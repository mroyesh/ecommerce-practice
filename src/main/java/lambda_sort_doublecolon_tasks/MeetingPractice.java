package lambda_sort_doublecolon_tasks;


import java.util.Comparator;

import static lambda_sort_doublecolon_tasks.DataGenerator.*;
import static lambda_sort_doublecolon_tasks.Service.getAllEmployees;
import static lambda_sort_doublecolon_tasks.Service.getFullNameWithCondition;

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


//        System.out.println("*** Get all employees if their Id number is even");
//        getAllEmployees().stream().filter(employee -> employee.getId()%2==0).forEach(System.out::println);


//        System.out.println("*** Get all employees if they are older than 50");
//        getAllEmployees().stream().filter(employee -> employee.getAge()>50).forEach(System.out::println);


//        System.out.println("*** Get all employees whose company name info starts with A or a");
//        getAllEmployees().stream().filter(employee -> employee.getCompany().getCompanyName().startsWith("A")||
//                employee.getCompany().getCompanyName().startsWith("a")).forEach(System.out::println);


//        System.out.println("*** Get all employees their company is located in Utah, Indiana or California as a state ");
//        getAllEmployees().stream().filter(employee -> employee.getCompany().getAddress().getState().equals("Utah")||
//                employee.getCompany().getAddress().getState().equals("Indiana")||
//                employee.getCompany().getAddress().getState().equals("California")).forEach(System.out::println);


//        System.out.println(" show all the employees full name and corresponding age information in one list");
//        getAllEmployees().stream().map(employee -> employee.getFullName()+" | "+employee.getAge()).
//                forEach(System.out::println);


//        System.out.println("*** Get just the fullName of all employees if their Id number is even");
//        getAllEmployees().stream().filter(employee -> employee.getId()%2==0).
//                map(Employee::getFullName).forEach(System.out::println);


//        System.out.println("*** Just print the employees if their company address id is 6");
//        getAllEmployees().stream().filter(employee ->employee.
//                getCompany().getId().equals(6)).forEach(System.out::println);
//
//
//        System.out.println("*** Print all employees***");
//        getAllEmployees().stream().forEach(System.out::println);


        //System.out.println("***SORTING QUESTIONS***");

//        System.out.println(" Sort all employees with age in ascending order and then print their ages and names");
//        getAllEmployees().stream()
//                .sorted(Comparator.comparing(Employee::getAge))
//                .map(employee -> employee.getAge()+" "+employee.getFullName()).
//                forEach(System.out::println);
        // same question with different solution**********************
//        getAllEmployees().sort(Comparator.comparing(Employee::getAge).reversed());
//        getAllEmployees().stream().
//                map(employee -> employee.getAge()+" "+employee.getFullName()).
//                forEach(System.out::println);
//
//        System.out.println("****************************************");
//
//        getAllEmployees().sort(Comparator.comparing(Employee::getAge).reversed());
//        getAllEmployees().stream().
//                map(employee -> employee.getAge()+" "+employee.getFullName()).
//                forEach(System.out::println);


//        System.out.println("sort all employees with company id in ascending order and then print company id and company names");
//        getAllEmployees().stream().sorted(Comparator.comparing(employee -> employee.getCompany().getId()))
//                        .map(employee -> employee.getCompany().getId()+" "+employee.getCompany().getCompanyName())
//                .forEach(System.out::println);


//        System.out.println(" Sort all employees with age in descending order and then print their ages and names");
//        getAllEmployees().stream().sorted(Comparator.comparing(Employee::getAge).reversed())
//                .map(employee -> employee.getAge()+" "+employee.getFullName()).forEach(System.out::println);
//
//
//        System.out.println("*** Sort all employees with full name in ascending order and print only their full names ***");
//        getAllEmployees().stream().sorted(Comparator.comparing(Employee::getFullName))
//                .map(Employee::getFullName).forEach(System.out::println);


//        System.out.println("*** sort all employees with full name in descending order and print only their full names ***");
//        getAllEmployees().stream().sorted(Comparator.comparing(Employee::getFullName).reversed())
//                .map(Employee::getFullName).forEach(System.out::println);


//        System.out.println("*** Sort all employees with company name in ascending order***");
//        getAllEmployees().stream().sorted(Comparator.comparing(employee ->employee.getCompany()
//                .getCompanyName())).forEach(System.out::println);
//
//
//        System.out.println("*** Sort all employees with company name in descending order***");
//
//        getAllEmployees().sort(Comparator.comparing(employee -> employee.getCompany().getCompanyName()));
//        getAllEmployees().stream().map(employee -> employee.getCompany()
//                .getCompanyName()).forEach(System.out::println);


        System.out.println("*** Sort all employees with their gender and then with their company name both in ascending order***");
        getAllEmployees().stream().sorted(Comparator.comparing(Employee::getGender))
                .limit(5)
                .forEach(System.out::println);
        System.out.println("------------------------------------------------");

        getAllEmployees().stream().sorted(Comparator.comparing(employee -> employee.getCompany()
                .getCompanyName())).limit(5).forEach(System.out::println);


        System.out.println("*** Sort all employees with their gender in ascending order and then with their name in descending order***");
        getAllEmployees().stream().sorted(Comparator.comparing(Employee::getGender))
                .forEach(System.out::println);

        getAllEmployees().stream().sorted(Comparator.comparing(Employee::getFullName)
                .reversed()).forEach(System.out::println);






                System.out.println("*** Sort all employees with their gender in ascending order and then with their company name in descending order***");
                getAllEmployees().stream().sorted(Comparator.comparing(Employee::getGender))
                        .forEach(System.out::println);
                getAllEmployees().stream().sorted(Comparator.comparing(employee -> employee.getCompany().getCompanyName()));

        System.out.println("***sort all employees with their company name in descending order and then with their full name in ascending order***");
        // this task cannot be solved similar to previous sorting tasks, we need to use twe compareTo method

    }
}
