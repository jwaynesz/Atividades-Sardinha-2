
import java.util.Scanner;

public class atv7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite as coordenadas do ponto P1 (x1 y1): ");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();

        System.out.print("Digite as coordenadas do ponto P2 (x2 y2): ");
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();

        double distancia = calcularDistancia(x1, y1, x2, y2);

        System.out.printf("A distancia entre os pontos P1(%.2f, %.2f) e P2(%.2f, %.2f) e %.2f%n", x1, y1, x2, y2, distancia);
    }

    public static double calcularDistancia(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }
}
  