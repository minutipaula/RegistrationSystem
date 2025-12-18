package minutiPaula;

public class Viaje {
    private String codigo;
    private String fecha;
    private String horaSalida;
    private String estacionSalida;
    private String estacionLlegada;
    private int nroParadas;

    private Tren tren;
    private Maquinista maquinista;
    private Guarda guarda;

    public Viaje(String codigo, String fecha, String horaSalida, String estacionSalida,
                 String estacionLlegada, Tren tren, Maquinista maquinista, Guarda guarda) {
        this.codigo = codigo;
        this.fecha = fecha;
        this.horaSalida = horaSalida;
        this.estacionSalida = estacionSalida;
        this.estacionLlegada = estacionLlegada;
        this.tren = tren;
        this.maquinista = maquinista;
        this.guarda = guarda;

        if (tren instanceof TrenPasajeros) {
            this.nroParadas = 5;
        } else if (tren instanceof TrenCarga) {
            this.nroParadas = 2;
        }
    }

    public void mostrarInfo() {
        System.out.println("Viaje " + codigo + " - Fecha: " + fecha + " - Salida: " + horaSalida);
        System.out.println("De " + estacionSalida + " a " + estacionLlegada + " - Paradas: " + nroParadas);
        maquinista.mostrarInfo();
        guarda.mostrarInfo();
        tren.mostrarInfo();
    }

    public String getEstacionLlegada() {
        return estacionLlegada;
    }

    public int getDniMaquinista() {
        return maquinista.getDni();
    }

    public Tren getTren() {
        return tren;
    }
}
