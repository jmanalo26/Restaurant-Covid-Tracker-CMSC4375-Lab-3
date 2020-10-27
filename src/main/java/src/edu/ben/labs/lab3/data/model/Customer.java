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
@Table(name = "customer")
public class Customer {
    @Id
    @Column(name = "customerID")
    private int customerID;

    @Column(name = "customerfirstname")
    private String firstName;

    @Column(name = "customerlastname")
    private String lastName;

    @Column(name = "customeremail")
    private String email;

    @Column(name = "customerphonenum")
    private String phone;

    @Column(name = "customerbirthdate")
    private String birthday;

    @Column(name = "customerentrydate")
    private String entryDate;

    @Column(name = "Covid")
    private int covidPos;

    @Column(name = "addressID")
    private int addressID;

    @Column(name = "restaurantID")
    private int restaurantID;

    public int getCustomerID() {
        return customerID;
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

    public int isCovidPos() {
        return covidPos;
    }

    public void setCovidPos(int covidPos) {
        this.covidPos = covidPos;
    }
}
