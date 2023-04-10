package services.abstracts;

import entities.SedanCar;

import java.util.List;

public interface SedanCarService {

    List<SedanCar> getAllCar();

    void addCar(SedanCar sedanCar);

    SedanCar updateCar(int id);

    void remove(int id);
}
