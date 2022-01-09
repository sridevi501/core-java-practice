// Literal means expressing values in java (int, short, double, float, char..etc)
// We can express binary, decimal, hexadecimal, octal values. \
// Value representation of hexadecimal prefix with 0x, binary prefix with 0b
// Below example for 10 integer literal represention in binary, octal, decimal, hexadecimal
public class JavaLiterals {
    public static void main(String[] args) {
        byte binary = 0b1010;    
        byte octal = 012;
        byte decimal = 10;
        byte hexadecimal = 0xA;

        System.out.println(binary);
        System.out.println(octal);
        System.out.println(decimal);
        System.out.println(hexadecimal);
        
    }
    
}
