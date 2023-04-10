package consoleUI;

import dataAccsess.abstracts.HatchbackCarDao;
import dataAccsess.concretes.InMemoryHatchbackCar;
import entities.HatchbackCar;
import services.abstracts.HatchbackCarService;
import services.concretes.HatchbackCarManager;

public class Main {
    public static void main(String[] args) {

        HatchbackCarDao hatchbackCarDao = new InMemoryHatchbackCar();

        HatchbackCarService hatchbackCarService = new HatchbackCarManager(hatchbackCarDao);

        HatchbackCar hatchbackCar1 = new HatchbackCar();
        HatchbackCar hatchbackCar2 = new HatchbackCar();
        HatchbackCar hatchbackCar3 = new HatchbackCar();


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

    }
}
