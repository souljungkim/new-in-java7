import exception.ExceptionOne;
import exception.ExceptionThree;
import exception.ExceptionTwo;
import org.junit.Test;

public class CatchingMultipleExceptionTypeInSingleCatchBlock {

    void somethingToDo(int i) throws Exception {
        if (i == 0)
            throw new ExceptionOne();
        else if (i == 1)
            throw new ExceptionTwo();
        else  if (i == 2)
            throw new ExceptionThree();
    }



    @Test(expected = ExceptionOne.class)
    public void old() throws Exception {
        try {
            somethingToDo(0);
        } catch (ExceptionOne e) {
            throw e;
        } catch (ExceptionTwo e) {
            throw e;
        } catch (ExceptionThree e) {
            throw e;
        }
    }

    @Test(expected = ExceptionTwo.class)
    public void newMultiCatchInJava7() throws Exception {
        try {
            somethingToDo(1);
        } catch (ExceptionOne | ExceptionTwo | ExceptionThree e) {
            throw e;
        }
    }

    @Test(expected = ExceptionThree.class)
    public void newMultiMultiCatchInJava7() throws Exception {
        try {
            somethingToDo(2);
        } catch (ExceptionOne e) {
            throw e;
        } catch (ExceptionTwo | ExceptionThree e) {
            throw e;
        }
    }

}
