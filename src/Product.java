// quản lý sản phẩm: tên, giá, số lượng
// class: thuộc tính, phương thức, hàm khởi tạo
// hàm khởi tạo: Hàm được gọi khi mình tạo đối tượng.

public class Product {
    String name;
    double price;
    int quantity;

    // hàm khởi tạo.
    // - tên trùng với tên class
    // - không có kiểu dữ liệu trả về.
    // this: đại diện cho class hiện tại
    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String display(){
        return name + " đang được bán với giá " + price + "$ số lượng đang có là " + quantity;
    }

}
