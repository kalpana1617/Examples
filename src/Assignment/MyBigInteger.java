package Assignment;
import java.math.BigInteger;

public class MyBigInteger {
  
    public static void main(String[] args) {
        int count = 150;
        BigInteger[] fibonacci = new BigInteger[count];
        fibonacci[0] = BigInteger.ZERO;
        fibonacci[1] = BigInteger.ONE;

        for (int i = 2; i < count; i++) {
            fibonacci[i] = fibonacci[i - 1].add(fibonacci[i - 2]);
        }
        
        for (int i = 0; i < count; i++) {
            System.out.println(fibonacci[i]);
        }
    }
}
