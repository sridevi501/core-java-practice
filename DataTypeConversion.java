// We can convert data types from one to another
// Always make sure converting small data type to large data type is acceptable. Ex : short to int, float to double
// This is called as type casting. small data type to large data type is called as widening casting.
// Large data type to small data type results data loss and it is not acceptable. Ex : int to short also called as narrowing casting.
// If narrow casting is there in program, It gives compile error cannot convert from int to short
public class DataTypeConversion {
    public static void main(String[] args) {
        int x = 10;
        System.out.println(Integer.toBinaryString(x));
        System.out.println(Integer.toOctalString(x));
        System.out.println(Integer.toHexString(x));
        short s = 24;
        int i = s;
        System.out.println(i);
        // s = x;
        System.out.println(s);


    }
    
}
