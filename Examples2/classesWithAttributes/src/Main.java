public class Main {
    public static void main(String[] args) {
        Product product=new Product();
        ProductManager productManager=new ProductManager();

        product.id=1;
        product.name="Laptop";
        product.price=5000D;
        product.description="Hp Laptop";
        product.stockAmount=2;

        productManager.add(product);




    }
}