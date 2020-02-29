import org.junit.Test;

public class StringInSwitch {


    @Test
    public void before(){
        String str = "anna";
        if (str.equals("bob") || str.equals("sam"))
            assert false;
        else if(str.equals("carl") || str.equals("joy"))
            assert false;
        else if(str.equals("anna") || str.equals("haron"))
            assert true;
        else
            assert false;
    }

    @Test
    public void switchInJava7(){
        String str = "anna";
        if (str == null)
            assert false;
        switch(str) {
            case "bob":
            case "sam":
                assert false;
                break;
            case "carl":
            case "joy":
                assert false;
                break;
            case "anna":
            case "haron":
                assert true;
                break;
            default:
                assert false;
                break;
        }

    }


}
