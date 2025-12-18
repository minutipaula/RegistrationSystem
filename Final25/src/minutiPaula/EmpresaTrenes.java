package minutiPaula;

import java.util.ArrayList;

public class EmpresaTrenes {
    private ArrayList<Empleado> empleados;
    private ArrayList<Tren> trenes;
    private ArrayList<Viaje> viajes;

    public EmpresaTrenes() {
        empleados = new ArrayList<>();
        trenes = new ArrayList<>();
        viajes = new ArrayList<>();
        cargarDatosIniciales();
    }

    private void cargarDatosIniciales() {
        //Maquinistas
        Maquinista m1 = new Maquinista("Juan", "Perez", 12345678, 12, "LIC123", 2);
        Maquinista m2 = new Maquinista("Ana", "Gomez", 22334455, 8, "LIC456", 1);

        //guardas
        Guarda g1 = new Guarda("Carlos", "Lopez", 33445566, 5);
        Guarda g2 = new Guarda("Luisa", "Martinez", 44556677, 15);

        //Trenes
        TrenCarga tc = new TrenCarga("CargaMax", 20, "Pesada");
        TrenPasajeros tp = new TrenPasajeros("PasajeroExpress", 15, "Eletrico");

        //Crarga inicial
        empleados.add(m1);
        empleados.add(m2);
        empleados.add(g1);
        empleados.add(g2);

        trenes.add(tc);
        trenes.add(tp);

        Viaje v1 = new Viaje("V001", "05/08/2024", "08:25", "Buenos Aires", "Rosario", tp, m1, g1);
        viajes.add(v1);
    }

    public void agregarViaje(Viaje v) {
        viajes.add(v);
        System.out.println("Viaje cargado correctamente\n");
    }

    public void mostrarViajes() {
        for (Viaje v : viajes) {
            v.mostrarInfo();
            System.out.println("--------------------");
        }
    }

    public void buscarEmpleadoPorDni(int dni) {
        for (Empleado e : empleados) {
            if (e.getDni() == dni) {
                e.mostrarInfo();
                return;
            }
        }
        System.out.println("No se encontró un empleado con ese DNI.");
    }

    public void buscarTrenConMasVagones() {
        if (trenes.isEmpty()) {
            System.out.println("No hay trenes registrados.");
            return;
        }
        Tren max = trenes.get(0);
        for (Tren t : trenes) {
            if (t.compareTo(max) > 0) {
                max = t;
            }
        }
        System.out.println("Tren con mas vagones:");
        max.mostrarInfo();
    }

    public void buscarViajesPorDestino(String destino) {
        boolean encontrado = false;
        for (Viaje v : viajes) {
            if (v.getEstacionLlegada().equalsIgnoreCase(destino)) {
                v.mostrarInfo();
                System.out.println("--------------------");
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("No hay viajes a ese destino.");
        }
    }

    public void buscarViajesPorDniMaquinista(int dni) {
        boolean encontrado = false;
        for (Viaje v : viajes) {
            if (v.getDniMaquinista() == dni) {
                v.mostrarInfo();
                System.out.println("--------------------");
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("No hay viajes para ese maquinista.");
        }
    }

    public void buscarViajesDeCarga() {
        boolean encontrado = false;
        for (Viaje v : viajes) {
            if (v.getTren() instanceof TrenCarga) {
                v.mostrarInfo();
                System.out.println("--------------------");
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("No hay viajes de carga.");
        }
    }

    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }

    public ArrayList<Tren> getTrenes() {
        return trenes;
    }
}
