import java.util.Comparator;

public class SortBySalary implements Comparator<Employee> {
    public int compare(Employee o1, Employee o2){
        return Integer.compare(o1.salary,o2.salary);
    }
}
