public class CustomerManager {

    private BaseLogger baseLogger;

    public CustomerManager(BaseLogger baseLogger){
        this.baseLogger=baseLogger;
    }

    public void add(){
        System.out.println("Customer Added");
        baseLogger.log("log message");
    }
}
