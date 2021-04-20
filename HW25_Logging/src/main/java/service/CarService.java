package service;

import dao.CarDao;
import emtity.Car;
import org.apache.log4j.Logger;

public class CarService {
    Logger logger = Logger.getLogger(CarService.class);

    public void save(Car car) {
        logger.debug(car.toString());
        CarDao carDao = new CarDao();
        carDao.save(car);
    }
}
