import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class damagedCarsTest {

    damagedCars d;

    @BeforeEach
    void setup() throws Exception{

        d = new damagedCars(4, "qefd", 43000, 1);


    }

    @Test
    void getFinalPrice() {
        assertEquals(21500, d.getFinalPrice(), 0);
    }


}