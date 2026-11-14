import java.util.Scanner;

// Base class
class Product {
    int productId;
    String productName;
    double price;

    public Product(int productId, String productName, double price) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
    }

    public double calculateDiscount() {
        return 0.0;
    }
}

// Derived class 1: Electronics Product (12% discount)
class ElectronicsProduct extends Product {
    public ElectronicsProduct(int productId, String productName, double price) {
        super(productId, productName, price);
    }

    @Override
    public double calculateDiscount() {
        return price * 12.0 / 100.0;
    }
}

// Derived class 2: Clothing Product (20% discount)
class ClothingProduct extends Product {
    public ClothingProduct(int productId, String productName, double price) {
        super(productId, productName, price);
    }

    @Override
    public double calculateDiscount() {
        return price * 20.0 / 100.0;
    }
}

// Derived class 3: Grocery Product (5% discount)
class GroceryProduct extends Product {
    public GroceryProduct(int productId, String productName, double price) {
        super(productId, productName, price);
    }

    @Override
    public double calculateDiscount() {
        return price * 5.0 / 100.0;
    }
}

public class Q10_EcommercePricing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int productType = sc.nextInt();
        int productId = sc.nextInt();
        String productName = sc.next();
        double price = sc.nextDouble();

        // Base class reference for runtime polymorphism
        Product product = null;

        if (productType == 1) {
            product = new ElectronicsProduct(productId, productName, price);
        } else if (productType == 2) {
            product = new ClothingProduct(productId, productName, price);
        } else if (productType == 3) {
            product = new GroceryProduct(productId, productName, price);
        }

        if (product != null) {
            double discount = product.calculateDiscount();
            double finalPrice = price - discount;

            System.out.println("Product ID: " + product.productId);
            System.out.println("Product Name: " + product.productName);
            System.out.println("Discount: " + String.format("%.2f", discount));
            System.out.println("Final Price: " + String.format("%.2f", finalPrice));
        }

        sc.close();
    }
}
