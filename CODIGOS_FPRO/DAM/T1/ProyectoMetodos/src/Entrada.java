import model.Operaciones;

public class Entrada {

    public static void main(String[] args) {
        System.out.println("Proyecto metodos");
        System.out.println("Vamos a realizar llamadas a metodos");
        /*
        String data="Laura";
        saludar(data);
        despedir();
        data = "Borja";
        System.out.println();
        saludar(data);
        despedir();*/
        int numero;
        Operaciones operacionesMatematicas = new Operaciones();
        operacionesMatematicas.sumar(1, 4);
        operacionesMatematicas.sumar(2, 4);
        operacionesMatematicas.restar(8, 5);
        operacionesMatematicas.restar(8, 9);
    }

    public static void saludar(String nombre) {
        System.out.println("Hola " + nombre);
        System.out.println("Encantado de saludarte, vamos a practicar");
        System.out.println("Vamos a practicar el llamado de metodos");
        System.out.println("Vamos, a por el día");
    }

    public static void despedir() {
        System.out.println("A cerrar el portatil, a pasar la tarde a casa");
    }

}
