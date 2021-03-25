import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UsedCarsTest {

    UsedCars u;

    @BeforeEach
    void setup() throws Exception{

        u = new UsedCars(4, "lol",24000,54000);


    }

    @Test
    void getFinalPrice() {
        assertEquals(17520, u.getFinalPrice(), 0);
    }

}