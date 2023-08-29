// Convertir en centigrados a farenheit y viceversa

import java.util.Scanner;

public class _p23_ConvertirTemperatura {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J"); System.out.flush();
        char op;
        double tem,res;
        Scanner obj = new Scanner(System.in);

        System.out.println("Convertir de centigrados a farenheit y viceversa\n");
        System.out.println("[F] Farenheit a Centigrados");
        System.out.println("[C] Centigrados a Farenheit ");
        System.out.println("Elije un opcion:");
        op = Character.toUpperCase(obj.nextLine().charAt(0));

        if (op == 'F'){
            System.out.println("Dame la temperatura en Farenheit: ");
            tem = obj.nextDouble();
            res = (tem - 32) * 5 / 9;
            System.out.printf("\nLa temperatura %f en grados farenheit equivale a %f grados centigrados", tem, res);
        }
        else if (op == 'c'){
            System.out.println("Dame la temperatura en Centigrados: ");
            tem = obj.nextDouble();
            res = (tem * 9/5) + 32;
            System.out.printf("\nLa temperatura %f en grados centigrados equivale a %f grados farenheit", tem, res);
        }
        else
            System.out.println("Opcion invalida");

    }
}
