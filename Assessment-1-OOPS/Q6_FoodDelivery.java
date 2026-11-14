import java.util.Scanner;

// Base class
class Delivery {
    double orderAmount;

    public Delivery(double orderAmount) {
        this.orderAmount = orderAmount;
    }

    public double calculateDeliveryCharge() {
        return orderAmount;
    }
}

// Derived class 1: Regular Delivery (+40.0)
class RegularDelivery extends Delivery {
    public RegularDelivery(double orderAmount) {
        super(orderAmount);
    }

    @Override
    public double calculateDeliveryCharge() {
        return orderAmount + 40.0;
    }
}

// Derived class 2: Express Delivery (+80.0 + 5% service charge)
class ExpressDelivery extends Delivery {
    public ExpressDelivery(double orderAmount) {
        super(orderAmount);
    }

    @Override
    public double calculateDeliveryCharge() {
        double serviceCharge = orderAmount * 5.0 / 100.0;
        return orderAmount + 80.0 + serviceCharge;
    }
}

public class Q6_FoodDelivery {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int deliveryType = sc.nextInt();
        double orderAmount = sc.nextDouble();

        // Base class reference for runtime polymorphism
        Delivery delivery = null;

        if (deliveryType == 1) {
            delivery = new RegularDelivery(orderAmount);
        } else if (deliveryType == 2) {
            delivery = new ExpressDelivery(orderAmount);
        }

        if (delivery != null) {
            System.out.println(String.format("%.2f", delivery.calculateDeliveryCharge()));
        }

        sc.close();
    }
}
