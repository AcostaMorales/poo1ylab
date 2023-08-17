// Manda un saludo a la pantalla

public class _p01_HolaMundo {
    public static void main(String[] args) {
        String amigo = "Manuel";
        String hermano = "Angel";
        String mensaje = String.format("Tanto %s como %s desean aprender Java", amigo , hermano);

        System.out.println("Hola Mundo desde el leenguaje java");
        System.out.println("\nHola amigo " + amigo + " bienvenido a java");
        System.out.println("\nMi amigo es " + amigo + " mi hermano es " + hermano);
        System.out.println("\n"+mensaje);

    }
}