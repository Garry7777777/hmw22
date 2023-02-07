package org.garry.skypro;
import org.garry.skypro.dao.*;
import org.garry.skypro.model.*;

//        1. Добавьте зависимость `hibernate-core` версии `[5.6.14.Final](http://5.6.14.Final)` в файл pom.xml
//        2. Замените в классе Employee поле city с типа City на тип int.
//        3. Приведите класс Employee ко всем критериям Entity. Используйте все необходимые аннотации.
//        4. Создайте конфигурационный класс для соединения с БД.
//        5. Создайте конфигурационный файл hibernate.cfg.xml
//        6. Скорректируйте в интерфейсе EmployeeDAO методы удаления и изменения, они должны принимать объект типа Employee.
//        7. Измените методы класса EmployeeDAOImpl для реализации через Hibernate.
//        8. Измените класс Application для реализации через Hibernate.

public class Application {
    public static void main(String[] args) {

        var employeeDAO = new EmployeeDAOimpl();
        var employeeGreg = new Employee( "Greg", "H.", "male", 45, 2);

        employeeDAO.create(employeeGreg);
        System.out.println(
           employeeDAO.readById( 8 ));
        employeeDAO.update(employeeGreg);
        employeeDAO.readAll().forEach(System.out::println);
        employeeDAO.delete(employeeGreg);

    }
}