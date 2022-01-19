package Arrays;

public class ArrayPractice {
    public static void main(String[] args) {
        int A[] = new int[10];
        int B[]={1,2,3,4,5,};
        int c[];
        c= new int[10];
        B[2] = 13;
        System.out.println(B);   //[I@41a4555e  single dimersional array I means integer after @ it is address of B array
        System.out.println(B.length);
// to modify array values we should use counter controller for loop
        for (int i =0;i<B.length;i++){
            System.out.println(B[i]++);
        }
// By changing x we can change the elements of an array. For each loop only used to reading the elements.
        for(int x : B){
            System.out.println(x);
        }

    }
    
}