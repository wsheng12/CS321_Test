import static org.junit.Assert.*;
import org.junit.Test;

public class NewGreenCardTest {

    @Test
    public void argumentTypeTest() {

        String address = "1234";
        String name = "456";
        String id = "12345";

        NewGreenCard greenCard = new NewGreenCard(address, name, id);

        assertEquals(greenCard.getAddress() instanceof String, true);
        assertEquals(greenCard.getName() instanceof String, true);
        assertEquals(greenCard.getId() instanceof String, true);
        assertEquals(greenCard.getStatus() instanceof String, true);


    }
    @Test
    public void greenCardTypeTest() {

        String address = "1234";
        String name = "456";
        String id = "12345";

        NewGreenCard greenCard = new NewGreenCard(address, name, id);

        assertEquals(greenCard instanceof NewGreenCard, true);

    }
    @Test
    public void validationTest() {

        String address = "1234";
        String name = "456";
        String id = "12345";

        String fakeAddress = "4321";
        String fakeName = "654";
        String fakeId = "54321";

        NewGreenCard greenCard = new NewGreenCard(address, name, id);
        NewGreenCard falseGreenCard = new NewGreenCard(fakeAddress, fakeName, fakeId);

        assertEquals(greenCard.validate(true), true);
        assertEquals(falseGreenCard.validate(true), false);

        assertEquals(greenCard.validate(false), true);
        assertEquals(falseGreenCard.validate(false), false);
    }
    @Test
    public void dbRetrievalTest() {

        String address = "1234";
        String name = "456";
        String id = "12345";

        String fakeAddress = "4321";
        String fakeName = "654";
        String fakeId = "54321";

        NewGreenCard greenCard = new NewGreenCard(address, name, id);
        NewGreenCard falseGreenCard = new NewGreenCard(fakeAddress, fakeName, fakeId);

        assertEquals(greenCard.dbRetrieve(greenCard.getId()) == greenCard, true);
        assertEquals(greenCard.dbRetrieve(greenCard.getId()) == falseGreenCard, false);

    }

    @Test
    public void dbAddTest() {

        

    }
}