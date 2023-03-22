import java.util.Comparator;
public class SortByAge implements Comparator<Employee> {
    public int compare(Employee o1, Employee o2){
        return Integer.compare(o1.age,o2.age);
    }
}
