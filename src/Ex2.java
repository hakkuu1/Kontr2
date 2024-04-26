import java.util.Scanner;

public class Ex2 {
    public static int rec_sum(int a, int b){
        if (a == 0) {
            return b;
        }
        else return rec_sum(a-1, b+1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("¬ведите числа: ");
        System.out.println("a = ");
        int a = sc.nextInt();
        System.out.println("b = ");
        int b = sc.nextInt();
        System.out.println("sum = " + rec_sum(a, b));
    }
}
