import org.junit.Test;

public class BinaryLiteral {


    @Test
    public void before(){
        int seven = Integer.parseInt("0111", 2);
        assert seven == 7;
    }

    @Test
    public void java7(){
        int seven = 0b0111;
        assert seven == 7;
    }

    @Test
    public void checkEquals(){
        int[] hexademicalLiterals = { 0x31, 0x62, 0xC4, 0x89, 0x13, 0x26, 0x4C, 0x98 }; //16
        int[] binaryLiterals = { 0b00110001, 0b01100010, 0b11000100, 0b10001001, 0b00010011, 0b00100110, 0b01001100, 0b10011000 }; //2
        for (int i=0; i<hexademicalLiterals.length; i++){
            assert hexademicalLiterals[i] == binaryLiterals[i];
        }
    }

    @Test
    public void define(){
        // An 8-bit 'byte' value:
        byte aByte = (byte) 0b00100001;

        // A 16-bit 'short' value:
        short aShort = (short) 0b1010000101000101;

        // Some 32-bit 'int' values:
        int anInt1 = 0b10100001010001011010000101000101;
        int anInt2 = 0b101;
        int anInt3 = 0B101; // The B can be upper or lower case.

        // A 64-bit 'long' value. Note the "L" suffix:
        long aLong = 0b1010000101000101101000010100010110100001010001011010000101000101L;
    }


}
