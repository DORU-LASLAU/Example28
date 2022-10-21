import java.util.Scanner;
public class Example28 {
    public static void main (String[] argv) {
        int x, y, suma=0;
        Scanner inputValue = new Scanner(System.in);
        System.out.println("Enter first number:");
        x =inputValue.nextInt();
        System.out.println("Enter second number:");
        y = inputValue.nextInt();

        if (x>0 && y>0) {
            for (int i=1; i<=y;i++) {
                System.out.println(i);
                suma= suma+x;
            }
            System.out.println("El producto es:"+suma);
        } else {
            System.out.println("Error");
        }
    }
}
