package structural.adapter;

import java.util.ArrayList;
import java.util.List;

public class EmployeeClient {

    public static List<Employee> getEmployeeList() {

        List<Employee> employees = new ArrayList<>();
        Employee employeeFrom = new EmployeeDB("1244", "John", "Wick", "john@wick.com");
        employees.add(employeeFrom);

        EmployeeLdap employeeFromLdap = new EmployeeLdap("chewie", "Solo", "Han", "han@solo.com");
        employees.add(new EmployeeAdapterLdap(employeeFromLdap));

        EmployeeCSV employeeFromCSV = new EmployeeCSV("567,Sherlok,Homes,sherlok@homes.com");
        employees.add(new EmployeeAdapterCSV(employeeFromCSV));

        return employees;
    }
}
