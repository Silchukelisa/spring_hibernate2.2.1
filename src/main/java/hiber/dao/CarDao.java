package hiber.dao;

import hiber.model.Car;

import java.util.List;

public interface CarDao {
    Car getCar();

    void add(Car car);

    List<Car> listCars();
}
