package services.concretes;

import dataAccsess.abstracts.SportCarDao;
import entities.SedanCar;
import entities.SportsCar;
import services.abstracts.SportCarService;

import java.util.List;

public class SportCarManager implements SportCarService {

    private final SportCarDao sportCarDao;

    public SportCarManager(SportCarDao sportCarDao) {
        this.sportCarDao = sportCarDao;
    }

    @Override
    public List<SportsCar> getAllCar() {
        return sportCarDao.getAllCar();
    }

    @Override
    public void addCar(SportsCar sportsCar) {

        if (sportsCar.getBrand().isEmpty()) {
            System.out.println("Marka ismi Boş Olamaz");
        } else {
            sportCarDao.addCar(sportsCar);
        }
    }

    @Override
    public SportsCar updateCar(int id) {
        SportsCar sportsCar = sportCarDao.updateCar(id);
        sportsCar.setId(id);
        return sportsCar;
    }

    @Override
    public void remove(int id) {
        sportCarDao.remove(id);
    }
}
