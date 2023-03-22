public class Employee implements Comparable<Employee> {
    int id;
    String name;
    int age;
    int salary;
    Employee(int id, String name, int age, int salary){
        this.id=id;
        this.name=name;
        this.age=age;
        this.salary=salary;
    }
    public int compareTo(Employee o){
        return Integer.compare(this.id,o.id);
    }

    @Override
    public String toString() {
        return "{"+id +" "+ name +" "+ age +" "+ salary+"}";
    }
}
