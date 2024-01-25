import java.util.Scanner;

public class OperadoresComparacion {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese dos números:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if (a > b) {
            System.out.println("El número mayor es " + a);
        } else if (a < b) {
            System.out.println("El número mayor es " + b);
        } else {
            System.out.println("Los números son iguales");
        }
    }
}
