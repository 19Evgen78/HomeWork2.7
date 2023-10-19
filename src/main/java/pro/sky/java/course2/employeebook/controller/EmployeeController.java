package pro.sky.java.course2.employeebook.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.java.course2.employeebook.service.Employee;
import pro.sky.java.course2.employeebook.service.EmployeeServiceImpl;
import java.util.Map;
@RestController
@RequestMapping("/employee")
public class EmployeeController {
    private final EmployeeServiceImpl employeeService;
    public EmployeeController(EmployeeServiceImpl employeeService) {
        this.employeeService = employeeService;
    }
    @GetMapping("/add")
    public Employee add(@RequestParam String lastName,
                        @RequestParam String firstName) {
        return employeeService.addEmployee(lastName, firstName);
    }
    @GetMapping("/remove")
    public Employee remove(@RequestParam String lastName,
                           @RequestParam String firstName) {
        return employeeService.removeEmployee(lastName, firstName);
    }
    @GetMapping("/find")
    public Employee find(@RequestParam String lastName,
                         @RequestParam String firstName) {
        return employeeService.findEmployee(lastName, firstName);
    }
    @GetMapping()
    public Map allEmployees() {
        return (Map) employeeService.all();
    }
}