package consoleUI;

import dataAccsess.abstracts.HatchbackCarDao;
import dataAccsess.abstracts.SedanCarDao;
import dataAccsess.abstracts.SportCarDao;
import dataAccsess.concretes.InMemoryHatchbackCar;
import dataAccsess.concretes.InMemorySedanCar;
import dataAccsess.concretes.InMemorySportCar;
import entities.HatchbackCar;
import entities.SedanCar;
import entities.SportsCar;
import services.abstracts.HatchbackCarService;
import services.abstracts.SedanCarService;
import services.abstracts.SportCarService;
import services.concretes.HatchbackCarManager;
import services.concretes.SedanCarManager;
import services.concretes.SportCarManager;

public class Main {
    public static void main(String[] args) {

        HatchbackCarDao hatchbackCarDao = new InMemoryHatchbackCar();
        HatchbackCarService hatchbackCarService = new HatchbackCarManager(hatchbackCarDao);

        SedanCarDao sedanCarDao = new InMemorySedanCar();
        SedanCarService sedanCarService = new SedanCarManager(sedanCarDao);

        SportCarDao sportCarDao = new InMemorySportCar();
        SportCarService sportCarService = new SportCarManager(sportCarDao);

        HatchbackCar hatchbackCar1 = new HatchbackCar();
        HatchbackCar hatchbackCar2 = new HatchbackCar();
        HatchbackCar hatchbackCar3 = new HatchbackCar();

        SedanCar sedanCar1 = new SedanCar();
        SedanCar sedanCar2 = new SedanCar();
        SedanCar sedanCar3 = new SedanCar();

        SportsCar sportsCar1 = new SportsCar();
        SportsCar sportsCar2 = new SportsCar();
        SportsCar sportsCar3 = new SportsCar();

        hatchbackCar1.setId(1);
        hatchbackCar1.setBrand("Audi");
        hatchbackCar1.setModel("A6");
        hatchbackCar1.setColor("Black");
        hatchbackCar1.setPrice(500000);


        hatchbackCar2.setId(2);
        hatchbackCar2.setModel("M5");
        hatchbackCar2.setBrand("Bmw");
        hatchbackCar2.setColor("White");
        hatchbackCar2.setPrice(5000);


        hatchbackCar3.setId(3);
        hatchbackCar3.setBrand("Audi");
        hatchbackCar3.setModel("A8");
        hatchbackCar3.setColor("Blue");
        hatchbackCar3.setPrice(25000000);

        hatchbackCarService.addCar(hatchbackCar1);
        hatchbackCarService.addCar(hatchbackCar2);

        System.out.println("<---------------------------->");
        System.out.println("Hatchback Car CRUD");
        System.out.println("<---------------------------->");
        System.out.println("read");

        for (HatchbackCar hatchbackCar : hatchbackCarService.getAllCar()) {
            System.out.println(hatchbackCar.getBrand() + "-" + hatchbackCar.getModel() + "-"
                    + hatchbackCar.getColor() + "-" + hatchbackCar.getPrice() + " =" + hatchbackCar.getId());
        }

        System.out.println("<---------------------------->");


        System.out.println("add");
        hatchbackCarService.addCar(hatchbackCar3);

        for (HatchbackCar hatchbackCar : hatchbackCarService.getAllCar()) {
            System.out.println(hatchbackCar.getBrand() + "-" + hatchbackCar.getModel() + "-"
                    + hatchbackCar.getColor() + "-" + hatchbackCar.getPrice() + " =" + hatchbackCar.getId());
        }

        System.out.println("<-------------------->");
        System.out.println("update");

        hatchbackCarService.updateCar(1);
        
        for (HatchbackCar hatchbackCar : hatchbackCarService.getAllCar()) {
            System.out.println(hatchbackCar.getBrand() + "-" + hatchbackCar.getModel() +
                    "-" + hatchbackCar.getColor() + "-" + hatchbackCar.getPrice() + "=" + hatchbackCar.getId());
        }

        System.out.println("<--------------------------------------->");
        System.out.println("delete");

        hatchbackCarService.remove(2);

        for (HatchbackCar hatchbackCar : hatchbackCarService.getAllCar()) {
            System.out.println(hatchbackCar.getBrand() + "-" + hatchbackCar.getModel() +
                    "-" + hatchbackCar.getColor() + "-" + hatchbackCar.getPrice() + "=" + hatchbackCar.getId());
        }

        sedanCar1.setId(1);
        sedanCar1.setModel("A6");
        sedanCar1.setBrand("Audi");
        sedanCar1.setPrice(500000);
        sedanCar1.setColor("Black");


        sedanCar2.setId(2);
        sedanCar2.setModel("M5");
        sedanCar2.setBrand("Bmw");
        sedanCar2.setColor("White");
        sedanCar2.setPrice(5000);


        sedanCar2.setId(3);
        sedanCar2.setBrand("Audi");
        sedanCar3.setModel("A8");
        sedanCar2.setColor("Blue");
        sedanCar2.setPrice(25000000);

        sedanCarService.addCar(sedanCar1);
        sedanCarService.addCar(sedanCar2);
        System.out.println("<---------------------------->");
        System.out.println("Sedan Car CRUD");
        System.out.println("<-------------------->");
        System.out.println("read");


        for (SedanCar sedanCar : sedanCarService.getAllCar()) {
            System.out.println(sedanCar.getBrand() + "-" + sedanCar.getModel() + "-"
                    + sedanCar.getColor() + "-" + sedanCar.getPrice() + " =" + sedanCar.getId());
        }

        System.out.println("<---------------------------->");


        System.out.println("add");
        sedanCarService.addCar(sedanCar3);

        for (SedanCar sedanCar : sedanCarService.getAllCar()) {
            System.out.println(sedanCar.getBrand() + "-" + sedanCar.getModel() + "-"
                    + sedanCar.getColor() + "-" + sedanCar.getPrice() + " =" + sedanCar.getId());
        }


        System.out.println("<-------------------->");
        System.out.println("update");

        sedanCarService.updateCar(1);

        for (SedanCar sedanCar : sedanCarService.getAllCar()) {
            System.out.println(sedanCar.getBrand() + "-" + sedanCar.getModel() + "-"
                    + sedanCar.getColor() + "-" + sedanCar.getPrice() + " =" + sedanCar.getId());
        }
        System.out.println("<--------------------------------------->");
        System.out.println("delete");

        sedanCarService.remove(2);

        for (SedanCar sedanCar : sedanCarService.getAllCar()) {
            System.out.println(sedanCar.getBrand() + "-" + sedanCar.getModel() + "-"
                    + sedanCar.getColor() + "-" + sedanCar.getPrice() + " =" + sedanCar.getId());
        }


        sportsCar1.setId(1);
        sportsCar1.setModel("A6");
        sportsCar1.setBrand("Audi");
        sportsCar1.setPrice(500000);
        sportsCar1.setColor("Black");


        sportsCar2.setId(2);
        sportsCar2.setModel("M5");
        sportsCar2.setBrand("Bmw");
        sportsCar2.setColor("White");
        sportsCar2.setPrice(5000);


        sportsCar3.setId(3);
        sportsCar3.setBrand("Audi");
        sportsCar3.setModel("A8");
        sportsCar3.setColor("Blue");
        sportsCar3.setPrice(25000000);

        sportCarService.addCar(sportsCar1);
        sportCarService.addCar(sportsCar2);
        System.out.println("<---------------------------->");
        System.out.println("Sport Car CRUD");
        System.out.println("<---------------------------->");
        System.out.println("read");


        for (SportsCar sportsCar : sportCarService.getAllCar()) {
            System.out.println(sportsCar.getBrand() + "-" + sportsCar.getModel() + "-"
                    + sportsCar.getColor() + "-" + sportsCar.getPrice() + " =" + sportsCar.getId());
        }

        System.out.println("<---------------------------->");


        System.out.println("add");
        sportCarService.addCar(sportsCar3);

        for (SportsCar sportsCar : sportCarService.getAllCar()) {
            System.out.println(sportsCar.getBrand() + "-" + sportsCar.getModel() + "-"
                    + sportsCar.getColor() + "-" + sportsCar.getPrice() + " =" + sportsCar.getId());
        }


        System.out.println("<-------------------->");

        System.out.println("update");


        sportCarService.updateCar(1);

        for (SportsCar sportsCar : sportCarService.getAllCar()) {
            System.out.println(sportsCar.getBrand() + "-" + sportsCar.getModel() + "-"
                    + sportsCar.getColor() + "-" + sportsCar.getPrice() + " =" + sportsCar.getId());
        }
        System.out.println("<--------------------------------------->");
        System.out.println("delete");

        sportCarService.remove(2);

        for (SportsCar sportsCar : sportCarService.getAllCar()) {
            System.out.println(sportsCar.getBrand() + "-" + sportsCar.getModel() + "-"
                    + sportsCar.getColor() + "-" + sportsCar.getPrice() + " =" + sportsCar.getId());
        }


    }
}
