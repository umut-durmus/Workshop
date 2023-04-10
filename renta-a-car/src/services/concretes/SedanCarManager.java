package services.concretes;

import dataAccsess.abstracts.SedanCarDao;
import entities.SedanCar;
import services.abstracts.SedanCarService;

import java.util.List;

public class SedanCarManager implements SedanCarService {

    private final SedanCarDao sedanCarDao;

    public SedanCarManager(SedanCarDao sedanCarDao) {
        this.sedanCarDao = sedanCarDao;
    }

    @Override
    public List<SedanCar> getAllCar() {
        return sedanCarDao.getAllCar();
    }

    @Override
    public void addCar(SedanCar sedanCar) {
        if (sedanCar.getModel().isBlank()) {
            System.out.println("Model ismi boş olamaz");
        } else {
            sedanCarDao.addCar(sedanCar);
        }
    }

    @Override
    public SedanCar updateCar(int id) {
        SedanCar sedanCar = sedanCarDao.updateCar(id);
        sedanCar.setId(id);
        return sedanCar;
    }

    @Override
    public void remove(int id) {
        sedanCarDao.remove(id);
    }
}
