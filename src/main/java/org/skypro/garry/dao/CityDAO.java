package org.skypro.garry.dao;

import org.skypro.garry.model.*;
import java.util.List;

public interface CityDAO {

    void       create(City city);
    City       readById(Integer id);
    List<City> readAll();
    void       update(City city);
    void       delete(City city);
}

