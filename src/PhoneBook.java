import java.util.ArrayList;
import java.util.List;

public class PhoneBook {
    final private List<Employee> employeeList = new ArrayList<>();

    public void addEmployee(Employee employee) {
        employeeList.add(employee);
    }

    public List<Employee> findFromExp(int exp) {
        List<Employee> result = new ArrayList<>();
        for (Employee emp : employeeList) {
            if (emp.getExp() == exp) {
                result.add(emp);
            }
        }
        return result;
    }

    public List<Employee> findFromName(String name) {
        List<Employee> result = new ArrayList<>();
        for (Employee emp : employeeList) {
            if (emp.getName().equals(name)) {
                result.add(emp);
            }
        }
        return result;
    }

    public Employee findFromId(int id) {
        for (Employee emp : employeeList) {
            if (emp.getId() == (id)) {
                return emp;
            }
        }
        return null;
    }
}
