package entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "addresses")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(nullable = true)
    private String city;
    @Column(nullable = true)
    private String street;
    @Column(nullable = true)
    private int number;
    @Column(nullable = true)
    private String postcode;

    @OneToOne(mappedBy = "address")
    private Client client;

}
