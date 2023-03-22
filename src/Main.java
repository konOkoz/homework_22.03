import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    /*
    Создать класс Employee c полями id, name, age, salary.
Сделать его Comparable по id
Создать дополнительные возможности сортировки по: salary, age, name а также по ageAndThenName, т.е. если возраст одинаковый, то сортировать по имени.
Создать в классе Main список сотрудников и отсортировать его всеми этими способами
     */
    public static void main(String[] args) {

        List<Employee> ourEmployee = new ArrayList<>();
        ourEmployee.add(new Employee(111,"John",22,1300));
        ourEmployee.add(new Employee(101,"Jack",25,1500));
        ourEmployee.add(new Employee(124,"Max",19,1800));
        ourEmployee.add(new Employee(197,"Rob",29,1700));
        ourEmployee.add(new Employee(133,"Alex",22,1340));
        ourEmployee.add(new Employee(151,"Bob",27,1530));

        System.out.println(ourEmployee);
        System.out.println("-------------------------------------Sorted by ID----------------------------------------");
        Collections.sort(ourEmployee);
        System.out.println(ourEmployee);
        System.out.println("---------------------------------Sorted by Salary----------------------------------------");
        Collections.sort(ourEmployee, new SortBySalary());
        System.out.println(ourEmployee);
        System.out.println("------------------------------------Sorted by Age----------------------------------------");
        Collections.sort(ourEmployee,new SortByAge());
        System.out.println(ourEmployee);
        System.out.println("------------------------------------Sorted by Name---------------------------------------");
        Collections.sort(ourEmployee, new SortByName());
        System.out.println(ourEmployee);
        System.out.println("---------------------------Sorted by age and then name-----------------------------------");
        Collections.sort(ourEmployee,new SortByAgeAndThenName());
        System.out.println(ourEmployee);
    }
    /*
    OUT:
[{111 John 22 1300}, {101 Jack 25 1500}, {124 Max 19 1800}, {197 Rob 29 1700}, {133 Alex 22 1340}, {151 Bob 27 1530}]
-------------------------------------Sorted by ID----------------------------------------
[{101 Jack 25 1500}, {111 John 22 1300}, {124 Max 19 1800}, {133 Alex 22 1340}, {151 Bob 27 1530}, {197 Rob 29 1700}]
---------------------------------Sorted by Salary----------------------------------------
[{111 John 22 1300}, {133 Alex 22 1340}, {101 Jack 25 1500}, {151 Bob 27 1530}, {197 Rob 29 1700}, {124 Max 19 1800}]
------------------------------------Sorted by Age----------------------------------------
[{124 Max 19 1800}, {111 John 22 1300}, {133 Alex 22 1340}, {101 Jack 25 1500}, {151 Bob 27 1530}, {197 Rob 29 1700}]
------------------------------------Sorted by Name---------------------------------------
[{133 Alex 22 1340}, {151 Bob 27 1530}, {101 Jack 25 1500}, {111 John 22 1300}, {124 Max 19 1800}, {197 Rob 29 1700}]
---------------------------Sorted by age and then name-----------------------------------
[{124 Max 19 1800}, {133 Alex 22 1340}, {111 John 22 1300}, {101 Jack 25 1500}, {151 Bob 27 1530}, {197 Rob 29 1700}]
     */
}