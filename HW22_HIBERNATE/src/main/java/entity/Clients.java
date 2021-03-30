package entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;



@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "clients")
@Table
public class Clients {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name", nullable = false)
    private String name;
    @Column(name = "email", unique = true, nullable = false, length = 256)
    private String email;
    @Column(name = "phone", unique = true, nullable = false, length = 12)
    private long phone;
    @Column(name = "about", length = 350)
    private String about;
    @Column(name = "age", nullable = false)
    private int age;


}
