package org.skypro.garry.model;

import javax.persistence.*;
import java.util.Objects;


@Entity
@Table(name = "employee")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer employeeId;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "gender")
    private String gender;

    @Column(name = "age")
    private Integer age;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="city_id", nullable=false)
    private City city;

    public Employee(){ }

    public void setEmployeeId(int id ) {this.employeeId = id;}
    public void setFirstName( String firstName ) {this.firstName = firstName;}
    public void setLastName( String lastName ) {this.lastName = lastName;}
    public void setGender( String gender ) {this.gender = gender;}
    public void setAge( int age ) {this.age = age;}
    public void setCity( City city ) {this.city = city;}

    public int getAge() { return age;}
    public String getGender() {return gender;}
    public String getLastName() {return lastName;}
    public String getFirstName() {return firstName;}
    public int getEmployeeId() {return employeeId;}
    public City getCity() {return city;}

    public Employee( String firstName, String lastName, String gender, Integer age, City city) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.age = age;
        this.city = city;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return employeeId == employee.employeeId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(employeeId, firstName, lastName, gender, age, city);
    }

    @Override
    public String toString() {
        return "Employee:" +"id=" + employeeId +" имя=" + firstName +" фамилия=" +
                lastName + ", " + gender + ", age=" + age +", " + city;
    }
}
