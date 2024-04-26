import java.util.Scanner;

public class Ex1 {
    public static double distance(double x1, double y1, double x2, double y2){
        return Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("¬ведите координаты: ");
        System.out.println("x1 = ");
        double x1 = sc.nextDouble();
        System.out.println("y1 = ");
        double y1 = sc.nextDouble();
        System.out.println("x2 = ");
        double x2 = sc.nextDouble();
        System.out.println("y2 = ");
        double y2 = sc.nextDouble();
        System.out.println("dis = " + distance(x1, y1, x2, y2));

    }
}
