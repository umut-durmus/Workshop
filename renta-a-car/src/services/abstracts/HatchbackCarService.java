package services.abstracts;

import entities.HatchbackCar;

import java.util.List;

public interface HatchbackCarService {

    List<HatchbackCar> getAllCar();

    void addCar(HatchbackCar hatchbackCar);

    HatchbackCar updateCar(int id);

    void remove(int id);
}
