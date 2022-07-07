package hiber.dao;

import hiber.model.Car;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import javax.persistence.Query;
import javax.persistence.TypedQuery;
import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDaoImp implements CarDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void add(Car car) {
        sessionFactory.getCurrentSession().save(car);
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<Car> listCars() {
        TypedQuery<Car> query = (TypedQuery<Car>) sessionFactory.getCurrentSession().createQuery("from Car");
        return query.getResultList();
    }

    @Override
    @SuppressWarnings("unchecked")
    public Car getCar() {
        Query query = sessionFactory.openStatelessSession().createQuery("from Car where model = 'BMW' and series='12345' ");
        List<Car> list = query.getResultList();
        return list.get(0);
    }
}
