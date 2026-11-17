public class Puerta {
    private boolean abierta;

    public Puerta() {
        this.abierta = false;
    }

    public void abrir() {
        abierta = true;
    }

    public void cerrar() {
        abierta = false;
    }

    public String estado() {
        if (abierta) {
            return "Abierta";
        } else {
            return "Cerrada";
        }
    }

    public static void main(String[] args) {
        Puerta puerta = new Puerta();
        
        System.out.println("Estado inicial: " + puerta.estado());
        puerta.abrir();
        System.out.println("Al abrirla: " + puerta.estado());
        puerta.cerrar();
        System.out.println("Al cerrarla: " + puerta.estado());
    }
}