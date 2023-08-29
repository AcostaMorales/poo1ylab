// Verifica si la suma de dos numeros es un tercer numero

import  java.util.Scanner;
public class _p22_VerificarSuma {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J"); System.out.flush();

        int num1,num2,num3;
        Scanner obj =  new Scanner(System.in);

        System.out.println("Verificar si la suma de dos numeros es igual a un tercer numero\n");
        System.out.print("Numero 1: "); num1= obj.nextInt();
        System.out.print("Numero 2: "); num2= obj.nextInt();
        System.out.print("Numero 3: "); num3= obj.nextInt();

        if (num1 + num2 == num3)
            System.out.println("Son iguales");
        else
            System.out.println("Son diferentes");

        
    }
    
}
