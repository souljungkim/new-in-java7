import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class TypeInference {

    @Test
    public void beforeDiamondOperator (){
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        assert list.size() == 3;
    }

    @Test
    public void afterDiamondOperator (){
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        assert list.size() == 3;
    }

}
