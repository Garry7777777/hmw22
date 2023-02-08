package org.skypro.garry;

import org.skypro.garry.dao.*;
import org.skypro.garry.model.*;

//        Продолжаем работать с базой данных наших работников.
//
//        1. Приведите оба класса (Employee и City) к требованиям Entity.
//        2. Свяжите сущности между собой так, чтобы из одного города могло быть несколько сотрудников, а один сотрудник — только из одного города.
//        3. Включите полную каскадность.
//        4. Сформируйте слой DAO для сущности City.
//        5. В методе main вызовите CRUD-операции для связанных сущностей.

public class Application {
    public static void main(String[] args) {

        EmployeeDAOimpl employeeDAO = new EmployeeDAOimpl();
        CityDAOimpl cityDAO = new CityDAOimpl();

        City cityVienna = new City("Вена");
        Employee employeeGreg = new Employee( "Greg", "H.", "male", 45, cityVienna);


        cityDAO.create(cityVienna);
        employeeDAO.create(employeeGreg);
        employeeDAO.update(employeeGreg);

        cityDAO.readAll().forEach(System.out::println);
        employeeDAO.readAll().forEach(System.out::println);

        System.out.println( "\n" + employeeDAO.readById( 8 ) +"   " +cityDAO.readById(2) + "\n");
        cityDAO.delete(cityDAO.readById(10));

        employeeDAO.delete(employeeGreg);
        cityDAO.readAll().forEach(System.out::println);
        employeeDAO.readAll().forEach(System.out::println);
    }
}