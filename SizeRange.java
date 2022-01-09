// MIN_VALUE, MAX_VALUE, BYTES are static variables in java.lang package in Integer,Float,Double,Byte,Short class
// As java.lang gets automatically import it is option to import java.lang package.
// Integer minimum -2147483648
// Integer maximum 2147483647
// Integer Bytes 4
// Float minimum 1.4E-45
// Float maximum 3.4028235E38
// Float Bytes 4
// Double minimum 4.9E-324
// Double maximum 1.7976931348623157E308
// Double Bytes 8
// Byte minimum -128
// Byte maximum 127
// Byte Bytes 1
// Short minimum -32768
// Short maximum 32767
// Short Bytes 2
public class SizeRange {
    public static void main(String[] args) {
        //Integer
        System.out.println("Integer minimum "+Integer.MIN_VALUE);
        System.out.println("Integer maximum " +Integer.MAX_VALUE);
        System.out.println("Integer Bytes " +Integer.BYTES);
         //Float
         System.out.println("Float minimum "+Float.MIN_VALUE);
         System.out.println("Float maximum " +Float.MAX_VALUE);
         System.out.println("Float Bytes " +Float.BYTES);
          //Double
        System.out.println("Double minimum "+Double.MIN_VALUE);
        System.out.println("Double maximum " +Double.MAX_VALUE);
        System.out.println("Double Bytes " +Double.BYTES);
         //Byte
         System.out.println("Byte minimum "+Byte.MIN_VALUE);
         System.out.println("Byte maximum " +Byte.MAX_VALUE);
         System.out.println("Byte Bytes " +Byte.BYTES);
         //Byte
         System.out.println("Short minimum "+Short.MIN_VALUE);
         System.out.println("Short maximum " +Short.MAX_VALUE);
         System.out.println("Short Bytes " +Short.BYTES);
    }
    
}
