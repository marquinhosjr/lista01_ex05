import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {

        double metro;
        double cm;

        Scanner sc = new Scanner(System.in);
        metro = sc.nextDouble();
        sc.close();

        cm = metro * 100;

        System.out.print("A conversão em centímetros da " + cm );
    }
}
