package minutiPaula;

public class Guarda extends Empleado {
    private String turno;

    public Guarda(String nombre, String apellido, int dni, int antiguedad) {
        super(nombre, apellido, dni, antiguedad);
        this.turno = (antiguedad > 10) ? "Noche" : "Dia";
    }

    public void setTurno(String turno) {
		this.turno = turno;
	}

	public String getTurno() {
        return turno;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Guardia: " + nombre + " " + apellido + " - DNI: " + dni + " - Turno: " + turno);
    }
}
