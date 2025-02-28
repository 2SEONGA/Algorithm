import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int roomNum = sc.nextInt();
        sc.close();
        int f = 1;
        int range = 1;
        while (roomNum > range) {
            range += 6 * f;  // 6, 12, 18, 24... 증가
            f++;
        }
        System.out.println(f);
    }
}