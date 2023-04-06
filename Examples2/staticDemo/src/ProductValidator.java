public class ProductValidator {

    public ProductValidator(){
        System.out.println("Yapıcı Blok Çalıştı");
    }

    static {
        System.out.println("Static Yapıcı Blok Çalıştı");
    }

    public static boolean  isValid(Product product){
     if (product.price>0&&product.name.isEmpty()){
           return true;
     }
     return false;
    }
    // innerclass
    public static class baskabirClass{
        public static void sil(){}
    }
}
