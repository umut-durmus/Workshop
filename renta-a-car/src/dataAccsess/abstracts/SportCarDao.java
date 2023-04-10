package dataAccsess.abstracts;

import entities.HatchbackCar;
import entities.SedanCar;
import entities.SportsCar;

import java.util.List;

public interface SportCarDao {

    List<SportsCar> getAllCar();

    void addCar(SportsCar sportsCar);

    SportsCar updateCar(int id);

    void remove(int id);
}
