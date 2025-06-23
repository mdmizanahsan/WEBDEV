public class EmployeeApp {
    public static void main(String[] args) {
        Employee emp1 = new Employee(101, "John Doe", 50000.0);
        Employee emp2 = new Employee(102, "Jane Smith", 60000.0);

        System.out.println("Employee 1 ID: " + emp1.getEmpId());
        System.out.println("Employee 1 Name: " + emp1.getEmpName());
        System.out.println("Employee 1 Salary: " + emp1.getEmpSalary());

        System.out.println("Employee 2 ID: " + emp2.getEmpId());
        System.out.println("Employee 2 Name: " + emp2.getEmpName());
        System.out.println("Employee 2 Salary: " + emp2.getEmpSalary());

    }
}
