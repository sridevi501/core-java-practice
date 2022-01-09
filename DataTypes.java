// Float values should suffix with f or F
// Double values optional to be suffix with d or D. By default considered decimal values as Double
// Long values should suffix with l or L. all numbers by default considered as int.
public class DataTypes {
    public static void main(String[] args) {
        int i = 2019;
        float f = 25.0f;
        short s = 12;
        char c = 'S';
        double d = 25032019.1146d;
        long l = 201903151146l;

        System.out.println(i);
        System.out.println(f);
        System.out.println(s);
        System.out.println(c);
        System.out.println(d);
        System.out.println(l);
    }
    
}
