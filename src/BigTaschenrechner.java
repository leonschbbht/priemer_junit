import java.math.BigInteger;

public class BigTaschenrechner {
    public static BigInteger fakultaet(int zahl){
        if(zahl < 0){
            throw new IllegalArgumentException();
        }
        if(zahl < 2){
            return BigInteger.valueOf(1);
        }
        return BigInteger.valueOf(zahl).multiply(fakultaet(zahl-1));
    }
}
