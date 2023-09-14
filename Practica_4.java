package practica_4;
import java.util.Scanner;
public class Practica_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la cantidad que desea convertir: ");
        int cant= scanner.nextInt();
        scanner.nextLine();
        scanner.close();
       double dolares=(cant/17.31);
       double euros=(cant/18.26);
        System.out.println("Su cantidad en pesos es igual a: "+cant+" MXN");
        System.out.println("Su cantidad en dolares es igual a: "+dolares+" USD");
        System.out.println("Su cantidad en euros es igual a: "+euros+" €");
    }
}
