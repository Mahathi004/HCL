import java.util.Scanner;
// Base class (Name this "Employee" when running in its own file)
class Employee {
String employeeName;
public Employee(String employeeName) {
this.employeeName = employeeName;
}
public double calculateBonus() {
return 0.0;
}
public double calculateBonus(double amount) {
return 0.0;
}
}
// Derived class 1
class TechnicalEmployee extends Employee {
double basicSalary;
int rating;
public TechnicalEmployee(String employeeName, double basicSalary, int rating)
{
super(employeeName);
this.basicSalary = basicSalary;
this.rating = rating;
}
// Method Overriding
@Override
public double calculateBonus() {
return basicSalary * rating * 2 / 100;
}
// Method Overloading
public double calculateBonus(double salary, int employeeRating) {
return salary * employeeRating * 2 / 100;
}
}
// Derived class 2
class SalesEmployee extends Employee {
double salesAmount;
public SalesEmployee(String employeeName, double salesAmount) {
super(employeeName);
this.salesAmount = salesAmount;
}
