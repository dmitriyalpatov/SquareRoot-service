package homework.QA;


import myservice.SquareRoot;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SquareRootServiceTest {

    @Test


    public void sqrOfRoundedNumberThousands() {
        SquareRoot service = new SquareRoot();
        int number = 250;
        int expected = 5;

        int actual = service.SquareRoot(number);

        Assertions.assertEquals(expected, actual);
    }
}
