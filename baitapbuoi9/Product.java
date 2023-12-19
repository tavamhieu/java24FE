package baitapbuoi9;

public class Product {
    String id;
    String name;
    String description;
    int quantity;
    int price;
//    Mã sản phẩm (id)
//    Tên sản phẩm (name)
//    Mô tả (description)
//    Số lượng (quantity)
//    Giá bán (price)


    public Product() {
    }

    public Product(String id, String name, String description, int quantity, int price) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.quantity = quantity;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
