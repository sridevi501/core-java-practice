import javax.sound.sampled.SourceDataLine;

public class RemoveSpecialChars {
    public static void main(String[] args) {
        String s ="checking$whether*Spcial90!chars$are@ Removed";
        s=s.replaceAll("[^a-zA-Z0-9]","");
        System.out.println(s);

    }
}
