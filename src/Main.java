import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static Product nyCong = new Product("Ny Công", 500, 1);
    static Product nyKhoa = new Product("Ny Khoa", 500, 10);
    static Product[] products = {nyCong,nyKhoa};


    public static void main(String[] args) {
        while (true){
            System.out.println("Quản Lý Sản Phẩm");
            System.out.println("1. Hiển thị");
            System.out.println("2. Thêm sản phẩm");
            int choice = Integer.parseInt(scanner.nextLine());
            if (choice == 1){
                display();
                System.out.println("-----------------------------");
            }else {
                addProduct();
            }
        }
    }

    public static void display(){
        for (Product p:products) {
            System.out.println(p.display());
        }
    }

    public static void addProduct(){
        System.out.println("Nhập name sản phẩm");
        String name = scanner.nextLine();
        System.out.println("Nhập price sản phẩm");
        double price = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập quantity sản phẩm");
        int quantity = Integer.parseInt(scanner.nextLine());
        Product product = new Product(name,price,quantity);

        Product[] productsNew = new Product[products.length + 1];
        for (int i = 0; i < products.length; i++) {
            productsNew[i] = products[i];
        }
        productsNew[productsNew.length - 1] = product;
        products = productsNew;
    }

}


