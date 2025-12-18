package minutiPaula;

public abstract class Empleado {
    protected String nombre;
    protected String apellido;
    protected int dni;
    protected int antiguedad; 

    public Empleado(String nombre, String apellido, int dni, int antiguedad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.antiguedad = antiguedad;
    }

    public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public void setAntiguedad(int antiguedad) {
		this.antiguedad = antiguedad;
	}

	public int getDni() {
        return dni;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public abstract void mostrarInfo();
}
