import java.util.Scanner;
// Base class
class Vehicle {
double dailyRate;
public Vehicle(double dailyRate) {
this.dailyRate = dailyRate;
}
public double calculateRentalCharge(int rentalDays) {
return dailyRate * rentalDays;
}
public String getVehicleType() {
return "Vehicle";
}
}
// Derived classes
class Car extends Vehicle {
public Car() {
super(1500.0); // Set Car rate in parent
}
@Override
public String getVehicleType() {
return "Car";
}
}
class Bike extends Vehicle {
public Bike() {
super(600.0); // Set Bike rate in parent
}
@Override
public String getVehicleType() {
return "Bike";
}
}
class Truck extends Vehicle {
public Truck() {
super(3000.0); // Set Truck rate in parent
}
@Override
public String getVehicleType() {
return "Truck";
}
}
