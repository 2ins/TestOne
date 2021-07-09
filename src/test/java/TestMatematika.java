
import federico.Matematika;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class TestMatematika {

    @Test
    void testSomma() {
        int sum = Matematika.somma(1,1);
        assertTrue(sum==2);
    }

    @Test
    void testMoltiplica() {
        int mol = Matematika.moltiplica(1,1);
        assertTrue(mol==1);
    }


}
