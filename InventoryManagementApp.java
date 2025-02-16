import java.util.ArrayList;
import java.util.Scanner;

class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }
}

class InventoryManagementSystem {
    private ArrayList<Product> products;

    public InventoryManagementSystem() {
        products = new ArrayList<>();
    }

    public void addProduct(String name, double price) {
        Product newProduct = new Product(name, price);
        products.add(newProduct);

        System.out.println("\n----------------------------------------------------");
        System.out.println("[A new product has been added successfully!]");
        System.out.println("----------------------------------------------------");
    }

    public void displayProducts() {
        System.out.println("\n****************************************************");
        if(products.isEmpty()) {
            System.out.println("Products List");
            System.out.println("----------------------------------------------------");
            System.out.println("[No products available.]");
        }

        else {
            System.out.println("Products List");
            System.out.println("----------------------------------------------------");

            for(Product product : products) {
                System.out.println("Product Name: " + product.getName());
                System.out.println("Product Price: Php. " + product.getPrice());
                System.out.println("----------------------------------------------------");
            }
        }
    }
}

public class InventoryManagementApp {
    public static void main(String[] args) {
        InventoryManagementSystem inventory = new InventoryManagementSystem();
        Scanner scan = new Scanner(System.in);

        System.out.println("****************************************************");
        System.out.println("Welcome to the Inventory Management System");
        System.out.println("By: Marvin M. Agudines"); 
        System.out.println("****************************************************");

        while(true) {
            System.out.println("\nMenu:");
            System.out.println("[1] Add Product");
            System.out.println("[2] Display Products");
            System.out.println("[3] Exit");
            System.out.print("Enter your choice: ");

            int choice = scan.nextInt();

            scan.nextLine();

            switch(choice) {
                case 1:
                    System.out.print("\nEnter product name: ");
                    String name = scan.nextLine();

                    System.out.print("Enter product price: ");
                    Double price = scan.nextDouble();

                    inventory.addProduct(name, price);

                    break;

                case 2:
                    inventory.displayProducts();

                    break;

                case 3:
                    System.out.println("\nThank you for using the Inventory Management System. Goodbye!");
                    scan.close();
                    return;

                default:
                    System.out.println("\nInvalid choice. Please try again.");   
            }
        }
    }
}