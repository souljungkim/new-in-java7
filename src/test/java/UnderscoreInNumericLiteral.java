import org.junit.Test;

public class UnderscoreInNumericLiteral {

    @Test
    public void checkNumber(){
        int money = 1_000;
        int money2 = 100_000;
        assert money + money2 == 101000;

        //Compare
        assert 1_000 == 1000;
        assert 50_000 == 50000;

        //You can express as you please.
        assert 9_0___0____0__0_0 == 900000;
    }

}
