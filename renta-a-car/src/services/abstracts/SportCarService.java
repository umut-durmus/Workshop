package services.abstracts;

import entities.SportsCar;

import java.util.List;

public interface SportCarService {

    List<SportsCar> getAllCar();

    void addCar(SportsCar sportsCar);

    SportsCar updateCar(int id);

    void remove(int id);
}
