import java.util.Scanner;

public class _p80_PrimerExamenParcial {
    public static int Validar(int edad, int sexo, int ocupacion){
        int validar = 0;
        if (edad >=18 )
            validar +=1;
        if (sexo ==1 || sexo ==2)
            validar +=1;
        if  (ocupacion == 1 || ocupacion == 2 || ocupacion == 3) 
            validar +=1;
        return validar;
    }
    public static int Total(int opcion){
        int Dinero=0;
        if (opcion ==1)
            Dinero=50;
        else if (Dinero ==2)
            Dinero=80;
        else if (Dinero ==3)
            Dinero=60;
        return Dinero;
    }

    public static void main(String[] args) {
        int Edad,sexo,ocupacion,opcion, validar, Al,Doc,Tra, H, M,contador,DAl,DDo,DTr,TD =0;
        String Nombre;
        Al=0;
        DAl =0;
        Doc=0;
        DDo =0;
        Tra=0;
        DTr =0;
        H =0;
        M =0;
        contador=0;
        Scanner obj = new Scanner(System.in);
        System.out.print("\033[H\033[2J");System.out.flush();
        do {
            System.out.println("Bienvenido al sistema de Control de Inscripcion");
            System.out.println("Este es el menu de opciones:\n[1]Ingresar nuevo Ususario.\n[2]Ver total de Participantes\n[3]Ver total de ganancias");
            opcion = obj.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("\033[H\033[2J");System.out.flush();
                    do {
                        System.out.println("Recopilacion de datos de nuevo participante");
                        //System.out.print("Ingrese el Nombre del participante:"); Nombre = obj.nextLine(); Nombre= obj.next();
                        System.out.println("Ingrese la edad del participante (Solo los mayores de edad pueden participar):"); Edad = obj.nextInt();
                        System.out.println("Sexo del participante \n[1] Hombre\n[2]Mujer:"); sexo = obj.nextInt();
                        System.out.println("Tipo de participante \n[1] Alumno\n[2]Docente\n[3]Trabajador:"); ocupacion = obj.nextInt();
                        validar = Validar(Edad,sexo,ocupacion);
                         if (validar != 3) 
                            System.out.println("Existe algun error en los datos");
                        else {
                            contador +=1;
                            if (sexo == 1)
                                H +=1;
                            else if (sexo == 2) 
                                M +=1;
                            if (ocupacion==1){
                                Al +=1;
                                DAl = DAl + Total(1);
                                TD = TD + DAl;
                            }
                            else if (ocupacion == 2) {
                                Doc +=1;
                                DDo = DDo + Total(2);
                                TD = TD + DDo;
                            }
                            else if (ocupacion == 3) {
                                Tra +=1;
                                DTr = DTr + Total(3);
                                TD = TD + DTr;
                            }
                            
                        }
                        
                    } while (validar!=3);
                    System.out.println("Guardado con exito");
                    System.out.println("[0]Salir del sistem\n[1]Regresar al menu");opcion = obj.nextInt();
                    if (opcion == 1){
                        System.out.print("\033[H\033[2J");System.out.flush();
                    }
                    break;
                
                case 2:
                    System.out.print("\033[H\033[2J");System.out.flush();
                    System.out.printf("Total de Alumnos: %d\n",Al);
                    System.out.printf("Total de Docentes: %d\n",Doc);
                    System.out.printf("Total de Trabajadores: %d\n",Tra);
                    System.out.printf("Total de Hombres general: %d\n",H);
                    System.out.printf("Total de Mujeres General: %d\n",M);
                    System.out.printf("Total de todos los participantes: %d\n",contador);
                    System.out.printf("Promedio de la edad de todos los participantes: %d\n",TD);
                    System.out.println("[0]Salir del sistem\n[1]Regresar al menu");opcion = obj.nextInt();
                    if (opcion == 1){
                        System.out.print("\033[H\033[2J");System.out.flush();
                    }
                    break;
                case 3:
                    System.out.printf("Total dinero recaudado de Alumnos: %d\n", DAl);
                    System.out.printf("Total dinero recaudado de Docentes: %d\n", DDo);
                    System.out.printf("Total dinero recaudado de Trabajadores: %d\n", DTr);
                    System.out.printf("Total dinero en general: %d\n", TD);
                    break;
                default:
                    break;
            }

        } while (opcion!=0);

    }
}
