// Calcular la paga de un trabajador

import java.util.Scanner;

public class _p04_PagaTrabajador {
    public static void main(String[] args) {
        String nombre;
        int horas;
        double pago,tasa, impuesto, pagabruta, paganeta;
        Scanner obj = new Scanner(System.in);

        System.out.println("Nombre del trabajdor: "); nombre = obj.nextLine();
        System.out.println("Horas trabajadas; "); horas = obj.nextInt();
        System.out.println("Paga x hora: "); pago = obj.nextInt();
        tasa = 0.03;

        pagabruta = horas * pago;
        impuesto = pagabruta* tasa ;
        paganeta = pagabruta-impuesto;

        System.out.println("\nResumen de pagos\n");
        System.out.println(String.format("El trabajador %s trabajo %d horas, por una paga de %.2f pesos la hora. Con una tasa de impuesto de %.2f por ciento", nombre, horas, pago, tasa*100));
        System.out.println(String.format("Paga Bruto    %.2f", pagabruta));
        System.out.println(String.format("Imouesto      %.2f", impuesto));
        System.out.println(String.format("Paga Neta    %.2f", paganeta));

    }
}
