import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.junit.Test;

public class NewGreenCardTest {
    
    @Test
    public void test(){

        String address = "123";
        String name = "456";
        String id = "789";

        NewGreenCard greenCard = new NewGreenCard(address, name, id);

        assertEquals(greenCard.validate("123", "456", "789"), true);


    }
}
