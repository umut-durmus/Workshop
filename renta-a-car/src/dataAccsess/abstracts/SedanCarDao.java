package dataAccsess.abstracts;

import entities.HatchbackCar;
import entities.SedanCar;

import java.util.List;

public interface SedanCarDao {

    List<SedanCar> getAllCar();

    void addCar(SedanCar sedanCar);

    SedanCar updateCar(int id);

    void remove(int id);
}
