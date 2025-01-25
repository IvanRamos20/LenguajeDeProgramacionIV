import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer numero: ");
        int x =scanner.nextInt();
        System.out.print("Ingrese el segundo numero: ");
        int y =scanner.nextInt();
        System.out.print("Ingrese el tercer numero: ");
        int z =scanner.nextInt();

        int resultado=x*y*z;

        System.out.print("resultado de multiplicacion= " +resultado);
    }
}