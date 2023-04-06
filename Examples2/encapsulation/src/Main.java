public class Main {
    public static void main(String[] args) {
    Product product=new Product();
    ProductManager manager=new ProductManager();

    product.setId(5);
    product.setName("Laptop");
    product.setPrice(5000D);
    product.setDescription("Asus Laptop");
    product.setColor("White");


    manager.add(product);

    }
}