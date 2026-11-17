public class Reproductor {
    private String cancion;
    private boolean reproduciendo;

    public Reproductor() {
        this.cancion = "Ninguna";
        this.reproduciendo = false;
    }

    public void reproducir(String cancion) {
        this.cancion = cancion;
        this.reproduciendo = true;
    }

    public void pausar() {
        this.reproduciendo = false;
    }

    public String estado() {
        if (reproduciendo) {
            return "Reproduciendo: " + cancion;
        } else {
            return "Pausado (" + cancion + ")";
        }
    }

    public static void main(String[] args) {
        Reproductor rep = new Reproductor();
        
        rep.reproducir("Imagine");
        System.out.println(rep.estado());
        
        rep.pausar();
        System.out.println(rep.estado());
    }
}