package pro.sky.java.course2.employeebook.service;
import java.util.Map;
public interface EmployeeService {
    Employee addEmployee(String lastName, String firstName);
    Employee removeEmployee(String lastName, String firstName);
    Employee findEmployee(String lastName, String firstName);
    Map<String, Employee> all();
}