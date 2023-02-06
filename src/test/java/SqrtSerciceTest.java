import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import ru.netology.javaqa.untitled4.services.SqrtService;

public class SqrtSerciceTest {
    @Test
    public void positiveCalcExact() {
        SqrtService service = new SqrtService();
        int expected = 6;
        int actual = service.calcSqrt(101, 260);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void negativeCalcExact() {
        SqrtService service = new SqrtService();
        int expected = 7;
        int actual = service.calcSqrt(101, 260);
        Assertions.assertNotEquals(expected, actual);
    }
}
