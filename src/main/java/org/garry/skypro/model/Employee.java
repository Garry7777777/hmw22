package org.garry.skypro.model;

import javax.persistence.*;
import java.util.Objects;


@Entity
@Table(name = "employee")
public class Employee {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "gender")
    private String gender;

    @Column(name = "age")
    private Integer age;

    @Column(name = "city_id")
    private Integer city;

    public Employee(){ }

    public Employee( String firstName, String last_name, String gender, Integer age, Integer city) {
        this.firstName = firstName;
        this.lastName = last_name;
        this.gender = gender;
        this.age = age;
        this.city = city;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, lastName, gender, age, city);
    }

    @Override
    public String toString() {
        return "Employee:" +"id=" + id +" имя=" + firstName +" фамилия=" +
                lastName + ", " + gender + ", age=" + age +", " + city;
    }
}
