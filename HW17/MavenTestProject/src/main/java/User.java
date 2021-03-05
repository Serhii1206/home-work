import lombok.*;
import lombok.extern.log4j.Log4j2;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class User {
    String name;
    String userId;
    String email;
    int age;


}
