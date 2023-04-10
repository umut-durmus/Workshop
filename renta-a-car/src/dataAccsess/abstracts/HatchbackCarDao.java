package dataAccsess.abstracts;

import entities.HatchbackCar;

import java.util.List;

public interface HatchbackCarDao {

    List<HatchbackCar> getAllCar();

    void addCar(HatchbackCar hatchbackCar);

    HatchbackCar updateCar(int id);

    void remove(int id);
}
