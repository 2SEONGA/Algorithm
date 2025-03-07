import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        sc.close();
        int first = B/100;
        int second = (B%100)/10;
        int third = (B%100)%10;
        System.out.println(A*third);
        System.out.println(A*second);
        System.out.println(A*first);
        System.out.println(A*B);
    }
}