package minutiPaula;

public abstract class Tren implements Comparable<Tren> {
    protected String modelo;
    protected int cantVagones;

    public Tren(String modelo, int cantVagones) {
        this.modelo = modelo;
        this.cantVagones = cantVagones;
    }

    public int getCantVagones() {
        return cantVagones;
    }

    public abstract void mostrarInfo();

    @Override
    public int compareTo(Tren otro) {
        return Integer.compare(this.cantVagones, otro.cantVagones);
    }
}
