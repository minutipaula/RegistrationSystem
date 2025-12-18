package minutiPaula;

public class TrenCarga extends Tren {
    private String tipoCarga;

    public TrenCarga(String modelo, int cantVagones, String tipoCarga) {
        super(modelo, cantVagones);
        this.tipoCarga = tipoCarga;
    }

    public void setTipoCarga(String tipoCarga) {
		this.tipoCarga = tipoCarga;
	}

	@Override
    public void mostrarInfo() {
        System.out.println("Tren de Carga - Modelo: " + modelo + ", Vagones: " + cantVagones + ", Tipo: " + tipoCarga);
    }

    public String getTipoCarga() {
        return tipoCarga;
    }
}
