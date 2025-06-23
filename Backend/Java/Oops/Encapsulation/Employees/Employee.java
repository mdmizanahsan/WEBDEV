public class Employee {
    private int empId;
    private String empName;
    private double empSalary;

    public Employee(int empId, String empName, double empSalary){
       this.empId = empId;
       this.empName = empName;
       this.empSalary = empSalary;  
    }
    public int getEmpId(){
        return empId;
    }
    public String getEmpName(){
        return empName;
    }
    public double getEmpSalary(){
        return empSalary;
    }
    public void setEmpId(int empId){
        this.empId = empId;
    }
    public void setEmpName(String empName){
        this.empName = empName;
    }
    public void setEmpSalary(double empSalary){
        this.empSalary = empSalary;
    }
}
