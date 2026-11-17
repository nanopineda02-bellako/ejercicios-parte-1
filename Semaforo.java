public class Semaforo {
    private String color;

    public Semaforo() {
        this.color = "rojo";
    }

    public void cambiarRojo() {
        color = "rojo";
    }

    public void cambiarAmarillo() {
        color = "amarillo";
    }

    public void cambiarVerde() {
        color = "verde";
    }

    public String mostrarColor() {
        return color;
    }

    public static void main(String[] args) {
        Semaforo semaforo = new Semaforo();
        
        System.out.println("Color inicial: " + semaforo.mostrarColor());
        semaforo.cambiarVerde();
        System.out.println("Cambio de luz: " + semaforo.mostrarColor());
        semaforo.cambiarAmarillo();
        System.out.println("Precaución: " + semaforo.mostrarColor());
        semaforo.cambiarRojo();
        System.out.println("Alto total: " + semaforo.mostrarColor());
    }
}