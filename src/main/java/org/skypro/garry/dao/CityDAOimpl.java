package org.skypro.garry.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.skypro.garry.config.HibernateSessionFactoryUtil;
import org.skypro.garry.model.*;


import java.util.List;

public class CityDAOimpl implements CityDAO {
    public CityDAOimpl() { }

    // Метод добавления
    @Override
    public void create(City city) {

        try (Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession()) {
            Transaction transaction = session.beginTransaction();
            session.save(city);
            transaction.commit();
        }
    }
    // Метод получения объекта из базы
    @Override
    public City readById(Integer id) {
        try(Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession()){
            return session.get(City.class,id);
        }
    }

    //Получение всех объектов из базы
    @Override
    public List<City> readAll() {
        try(Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession()){
            return session.createQuery("FROM City").list();
        }
    }
    //Метод обновления данных в базе
    @Override
    public void update(City city) {
        try(Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession()){
            Transaction transaction = session.beginTransaction();
            session.update(city);
            transaction.commit();
        }
    }
    // Метод удаления данных из базы
    @Override
    public void delete(City city) {
        try(Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession()){
            Transaction transaction = session.beginTransaction();
            session.delete(city);
            transaction.commit();
        }
    }
}