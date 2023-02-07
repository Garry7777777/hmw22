package org.garry.skypro.dao;
import org.garry.skypro.model.Employee;

import java.util.List;

    public interface EmployeeDAO {

        //Создать в интерфейсе методы:
        //1. Создание(добавление) сущности Employee в таблицу
        //2. Получение конкретного объекта Employee по id
        //3. Получение списка всех объектов Employee из базы
        //4. Изменение конкретного объекта Employee в базе
        //5. Удаление конкретного объекта Employee из базы

        void           create(Employee employee);
        Employee       readById(Integer id);
        List<Employee> readAll();
        void           update(Employee employee);
        void           delete(Employee employee);
    }

