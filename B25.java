import java.util.Scanner;

public class B25 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double sales = sc.nextDouble();
        double discount = sc.nextDouble();
        double gst = sc.nextDouble();

        double afterDiscount = sales - (sales * discount / 100);
        double revenue = afterDiscount + (afterDiscount * gst / 100);

        System.out.println("Final Revenue = " + revenue);

        sc.close();
    }
}
