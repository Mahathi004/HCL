import java.util.Scanner;

// Abstract base class
abstract class Course {
    double courseFee;

    public Course(double courseFee) {
        this.courseFee = courseFee;
    }

    // Abstract methods
    public abstract double calculateDiscount();
    public abstract String getCourseType();

    // Concrete method
    public double calculateFinalFee() {
        return courseFee - calculateDiscount();
    }
}

// Derived class 1: Programming Course (10% discount)
class ProgrammingCourse extends Course {
    public ProgrammingCourse(double courseFee) {
        super(courseFee);
    }

    @Override
    public double calculateDiscount() {
        return courseFee * 10.0 / 100.0;
    }

    @Override
    public String getCourseType() {
        return "Programming";
    }
}

// Derived class 2: Data Science Course (15% discount)
class DataScienceCourse extends Course {
    public DataScienceCourse(double courseFee) {
        super(courseFee);
    }

    @Override
    public double calculateDiscount() {
        return courseFee * 15.0 / 100.0;
    }

    @Override
    public String getCourseType() {
        return "Data Science";
    }
}

// Derived class 3: Cloud Course (5% discount)
class CloudCourse extends Course {
    public CloudCourse(double courseFee) {
        super(courseFee);
    }

    @Override
    public double calculateDiscount() {
        return courseFee * 5.0 / 100.0;
    }

    @Override
    public String getCourseType() {
        return "Cloud";
    }
}

public class Q8_CourseFee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int courseType = sc.nextInt();
        double courseFee = sc.nextDouble();

        // Abstract class reference for runtime polymorphism
        Course course = null;

        if (courseType == 1) {
            course = new ProgrammingCourse(courseFee);
        } else if (courseType == 2) {
            course = new DataScienceCourse(courseFee);
        } else if (courseType == 3) {
            course = new CloudCourse(courseFee);
        }

        if (course != null) {
            System.out.println("Course Type: " + course.getCourseType());
            System.out.println("Discount: " + String.format("%.2f", course.calculateDiscount()));
            System.out.println("Final Fee: " + String.format("%.2f", course.calculateFinalFee()));
        }

        sc.close();
    }
}
