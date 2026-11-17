public class Termometro {
    private double temperatura;

    public Termometro() {
        this.temperatura = 25.0;
    }

    public void subir(double grados) {
        temperatura += grados;
    }

    public void bajar(double grados) {
        temperatura -= grados;
    }

    public double mostrarTemperatura() {
        return temperatura;
    }

    public static void main(String[] args) {
        Termometro t = new Termometro();
        
        System.out.println("Temperatura inicial: " + t.mostrarTemperatura() + " °C");
        t.subir(5.0);
        System.out.println("Después de subir 5 grados: " + t.mostrarTemperatura() + " °C");
        t.bajar(2.0);
        System.out.println("Después de bajar 2 grados: " + t.mostrarTemperatura() + " °C");
    }
}