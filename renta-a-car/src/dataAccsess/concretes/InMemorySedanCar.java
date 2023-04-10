package dataAccsess.concretes;

import dataAccsess.abstracts.SedanCarDao;
import entities.HatchbackCar;
import entities.SedanCar;

import java.util.ArrayList;
import java.util.List;

public class InMemorySedanCar implements SedanCarDao{

    List<SedanCar>sedanCars = new ArrayList<>();
    @Override
    public List<SedanCar> getAllCar() {
        return sedanCars;
    }

    @Override
    public void addCar(SedanCar sedanCar) {
        sedanCars.add(sedanCar);
    }

    @Override
    public SedanCar updateCar(int id) {
        for (SedanCar sedanCar:sedanCars){
            if (sedanCar.getId()==id)return sedanCar;
        }
        return null;
    }

    @Override
    public void remove(int id) {
        sedanCars.removeIf(sedanCar -> sedanCar.getId() == id);
    }
}
