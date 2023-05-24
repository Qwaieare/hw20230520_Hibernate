import models.Employee;
import dao.EmployeeDAO;
import dao.EmployeeDAOImpl;

import java.util.List;

public class Application {
    public static void main(String[] args)  {
        EmployeeDAO employeeDao = new EmployeeDAOImpl();

        Employee employeeP = new Employee("Petr", "Petrov", "man", 31, 3);
        employeeDao.create(employeeP);
        System.out.println(employeeDao.readById(3));

        List<Employee> employeeList = employeeDao.readAll();
        employeeList.forEach(System.out::println);

        Employee employeeA = new Employee(8, "Egor", "Garov", "man", 30, 4);
        employeeDao.updateEmployee(employeeA);
        employeeDao.delete(employeeA);
    }
}
