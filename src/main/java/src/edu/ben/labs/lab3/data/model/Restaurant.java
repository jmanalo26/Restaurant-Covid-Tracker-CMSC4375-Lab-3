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
@Table(name = "restaurant")
public class Restaurant {
    @Id
    @Column(name = "restaurantID")
    private int restaurantID;

    @Column(name = "restaurantName")
    private String name;

    @Column(name = "restaurantEmail")
    private String email;

    @Column(name = "restaurantPhoneNum")
    private String phone;

    @Column(name = "addressID")
    private String addressID;
}
