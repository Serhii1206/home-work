import java.io.FileNotFoundException;
import java.io.IOException;

public interface Service {
    public boolean check(Member member) throws IOException;
    public void fillIn(Member member) throws IOException;
}
