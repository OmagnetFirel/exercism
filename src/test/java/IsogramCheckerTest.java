package test.java;
import main.IsogramChecker;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class IsogramCheckerTest {

    @Test
    public void testaPalavra1(){
        IsogramChecker iso = new IsogramChecker();
        Assertions.assertTrue(iso.isIsogram("six-year-old"));
    }
}

