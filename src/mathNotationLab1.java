import java.util.*;
public class mathNotationLab1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final float a = 9.81f;
        final int t = 10;
        int v,p;
        System.out.println("Enter initial velocity (m/s) ");
        v = input.nextInt();
        System.out.println("Enter initial position (m/s) ");
        p = input.nextInt();
        System.out.println("Position in meters "+ String.format("%.2f",0.5*(a*(t*t))+(v*t)+p));
    }
}
