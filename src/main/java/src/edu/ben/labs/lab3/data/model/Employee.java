package src.edu.ben.labs.lab3.data.model;


import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
@Entity
@Table(name = "employee")
public class Employee {
    @Id
    @Column(name = "employeeID")
    private int ID;

    @Column(name = "employeefirstname")
    private String firstName;

    @Column(name = "employeelastname")
    private String lastName;

    @Column(name = "employeeemail")
    private String email;

    @Column(name = "employeephonenum")
    private String phone;

    @Column(name = "employeedateofbirth")
    private String birthday;

    @Column(name = "employeecheckindate")
    private String entryDate;

    @Column(name = "Covid")
    private int covidPos;

    @Column(name = "addressID")
    private int addressID;

    @Column(name = "restaurantID")
    private int restaurantID;

    public int getID() {
        return ID;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getBirthday() {
        return birthday;
    }

    public String getEntryDate() {
        return entryDate;
    }

    public int getAddressID() {
        return addressID;
    }

    public int getRestaurantID() {
        return restaurantID;
    }

    public int getCovidPos() {
        return covidPos;
    }

    public void setCovidPos(int covidPos) {
        this.covidPos = covidPos;
    }
}
