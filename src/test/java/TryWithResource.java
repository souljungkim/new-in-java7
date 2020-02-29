import org.junit.Test;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class TryWithResource {


    @Test
    public void before(){
        FileOutputStream fos = null;
        DataOutputStream dos = null;
        try {
            fos = new FileOutputStream("movies.txt");
            dos = new DataOutputStream(fos);
            dos.writeUTF("Java 7 Block Buster");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fos.close();
                dos.close();
                assert true;
            } catch (IOException e) {
                // log the exception
                assert false;
            }
        }
    }

    @Test
    public void after() {
        try (FileOutputStream fos = new FileOutputStream("movies.txt");
            DataOutputStream dos = new DataOutputStream(fos)) {
            dos.writeUTF("Java 7 Block Buster");
        } catch (IOException e) {
            // log the exception
        }
        assert true;
    }


}
