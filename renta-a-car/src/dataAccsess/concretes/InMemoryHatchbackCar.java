package dataAccsess.concretes;

import dataAccsess.abstracts.HatchbackCarDao;
import entities.HatchbackCar;

import java.util.ArrayList;
import java.util.List;

public class InMemoryHatchbackCar implements HatchbackCarDao {
    List<HatchbackCar> hatchbackCars = new ArrayList<>();


    @Override
    public void addCar(HatchbackCar hatchbackCar) {
        hatchbackCars.add(hatchbackCar);
    }

    @Override
    public List<HatchbackCar> getAllCar() {
        return hatchbackCars;
    }

    @Override
    public HatchbackCar updateCar(int id) {
        for (HatchbackCar hatchbackCar : hatchbackCars) {
            if (hatchbackCar.getId() == id) return hatchbackCar;
        }
        return null;
    }

    @Override
    public void remove(int id) {
        hatchbackCars.removeIf(hatchbackCar ->
                hatchbackCar.getId() == id);
    }
}
