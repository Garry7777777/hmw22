package org.garry.skypro.dao;

import org.garry.skypro.model.*;
import org.hibernate.*;
import java.util.*;

public class EmployeeDAOimpl implements EmployeeDAO {
    public EmployeeDAOimpl() { }

    // Метод добавления
    @Override
    public void create(Employee employee) {

        try (Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession()) {
            Transaction transaction = session.beginTransaction();
            session.save(employee);
            transaction.commit();
        }
    }
    // Метод получения объекта
    @Override
    public Employee readById(Integer id) {
        try(Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession()){
            return session.get(Employee.class,id);
        }
    }

    //Получение всех объектов из базы
    @Override
    public List<Employee> readAll() {
        try(Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession()){
            return session.createQuery("FROM Employee").list();
        }
    }
    //Метод обновления данных в базе
    @Override
    public void update(Employee employee) {
        try(Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession()){
            Transaction transaction = session.beginTransaction();
            session.update(employee);
            transaction.commit();
        }
    }
    // Метод удаления данных из базы
    @Override
    public void delete(Employee employee) {
        try(Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession()){
            Transaction transaction = session.beginTransaction();
            session.delete(employee);
            transaction.commit();
        }
    }
}