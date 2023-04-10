package dataAccsess.concretes;

import dataAccsess.abstracts.SportCarDao;
import entities.SedanCar;
import entities.SportsCar;

import java.util.ArrayList;
import java.util.List;

public class InMemorySportCar implements SportCarDao {

    List<SportsCar> sportsCars = new ArrayList<>();

    @Override
    public List<SportsCar> getAllCar() {
        return sportsCars;
    }

    @Override
    public void addCar(SportsCar sportsCar) {
        sportsCars.add(sportsCar);
    }

    @Override
    public SportsCar updateCar(int id) {
        for (SportsCar sportsCar : sportsCars) {
            if (sportsCar.getId() == id) return sportsCar;
        }
        return null;
    }

    @Override
    public void remove(int id) {
        sportsCars.removeIf(sportsCar -> sportsCar.getId() == id);
    }
}
