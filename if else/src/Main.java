import java.util.Enumeration;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Numero entero menor que 10
        Scanner scanner = new
                Scanner(System.in);
        //Pedir al usuario que ingrese un numero entero
        System.out.print("Ingrese un numero entero:");

        int numeroEntero = scanner.nextInt();

        //Validar si el numero entero es positivo, negativo o cero
        if (numeroEntero > 10) {
            System.out.println("El numero entero ingresado es mayor a 10");
        } else if (numeroEntero < 10) {
            System.out.println("El numero entero es menor a 10");
        } else {
            System.out.println("El numero entero ingresado es 10");
        }
        //Cerrar el objeto Scannerscanner.close();
    }
}