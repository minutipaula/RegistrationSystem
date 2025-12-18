package minutiPaula;

public class Maquinista extends Empleado {
    private String nroLicencia;
    private int categoria;

    public Maquinista(String nombre, String apellido, int dni, int antiguedad, String nroLicencia, int categoria) {
        super(nombre, apellido, dni, antiguedad);
        this.nroLicencia = nroLicencia;
        this.categoria = categoria;
    }

    public String getNroLicencia() {
		return nroLicencia;
	}

	public void setNroLicencia(String nroLicencia) {
		this.nroLicencia = nroLicencia;
	}

	public void setCategoria(int categoria) {
		this.categoria = categoria;
	}

	public String getLicencia() {
        return nroLicencia;
    }

    public int getCategoria() {
        return categoria;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Maquinista: " + nombre + " " + apellido + " - DNI: " + dni +
            " - Licencia: " + nroLicencia + " - Categoria: " + categoria +
            " - Turno: " + ((antiguedad > 10) ? "Noche" : "Dia"));
    }
}
