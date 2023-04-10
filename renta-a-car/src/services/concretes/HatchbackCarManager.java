package services.concretes;

import dataAccsess.abstracts.HatchbackCarDao;
import entities.HatchbackCar;
import services.abstracts.HatchbackCarService;

import java.util.List;

public class HatchbackCarManager implements HatchbackCarService {

    private final HatchbackCarDao hatchbackCarDao;

    public HatchbackCarManager(HatchbackCarDao hatchbackCarDao) {
        this.hatchbackCarDao = hatchbackCarDao;
    }

    @Override
    public List<HatchbackCar> getAllCar() {
        return hatchbackCarDao.getAllCar();
    }

    @Override
    public void addCar(HatchbackCar hatchbackCar) {
        if (hatchbackCar.getColor().isBlank()) {
            System.out.println("Arabanın rengi boş olamaz");
        } else {
            hatchbackCarDao.addCar(hatchbackCar);
        }
    }

    @Override
    public HatchbackCar updateCar(int id) {
        HatchbackCar hatchbackCar = hatchbackCarDao.updateCar(id);
        hatchbackCar.setPrice(1);
        return hatchbackCar;
    }

    @Override
    public void remove(int id) {
        hatchbackCarDao.remove(id);
    }
}
