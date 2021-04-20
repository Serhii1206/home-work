package emtity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "clients")
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    @Column(unique = true, nullable = true)
    private String email;
    @Column(unique = true,nullable = true,length = 12)
    private long phone;
    private int age;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "address_id")
    private Address address;

    @OneToMany(mappedBy = "client", fetch = FetchType.EAGER)
    private Set<Car> cars;
    @ManyToMany
    @JoinTable(name = "client_status", joinColumns = @JoinColumn(name = "client_id"),
            inverseJoinColumns = @JoinColumn(name = "status_id"))
    private Set<Status> statuses;
}
