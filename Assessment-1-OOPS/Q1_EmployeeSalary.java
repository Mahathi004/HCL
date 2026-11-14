import java.util.Scanner;
// Abstract base class
abstract class Employee {
private int employeeId;
private String employeeName;
public Employee(int employeeId, String employeeName) {
this.employeeId = employeeId;
this.employeeName = employeeName;
}
public int getEmployeeId() {
return employeeId;
}
public String getEmployeeName() {
return employeeName;
}
// Abstract method to be overridden by child classes
public abstract double calculateSalary();
}
// Derived class 1
class FullTimeEmployee extends Employee {
double monthlySalary;
public FullTimeEmployee(int employeeId, String employeeName, double
monthlySalary) {
super(employeeId, employeeName); // Call parent constructor
this.monthlySalary = monthlySalary;
}
@Override
public double calculateSalary() {
return monthlySalary;
}
}
// Derived class 2
class ContractEmployee extends Employee {
int workingDays;
double dailyRate;
public ContractEmployee(int employeeId, String employeeName, int workingDays,
double dailyRate) {
super(employeeId, employeeName); // Call parent constructor
this.workingDays = workingDays;
this.dailyRate = dailyRate;
}
