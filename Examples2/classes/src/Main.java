public class Main {
    public static void main(String[] args) {

        CustomerManager customerManager = new CustomerManager();
        CustomerManager customerManager1 = new CustomerManager();

        customerManager = customerManager1;

        customerManager.add();
        customerManager.remove();
        customerManager.update();


    }
}