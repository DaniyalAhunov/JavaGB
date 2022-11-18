package Java.Seminar6;


class Product {

    public int count;
    public String name;
    public double price;
    

    public Product(int count, String name, double price) {
        this.count = count;
        this.name = name;
        this.price = price;
    }
    @Override
    public String toString() {
        return "Количесвто: " + count + " Имя: " + name + " Цена: " + price;
    }
}
public class DZ_1 {
    public static void main(String[] args) {
        Product product = new Product(2,"Coca Cola", 90.99);
        System.out.println(product);
    }

}

