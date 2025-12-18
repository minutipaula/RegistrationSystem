package minutiPaula;

public class TrenPasajeros extends Tren {
    private String tipoMotor;

    public TrenPasajeros(String modelo, int cantVagones, String tipoMotor) {
        super(modelo, cantVagones);
        this.tipoMotor = tipoMotor;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Tren de Pasajeros - Modelo: " + modelo + ", Vagones: " + cantVagones + ", Motor: " + tipoMotor);
    }

    public String getTipoMotor() {
        return tipoMotor;
    }
}
