package minutiPaula;

public class Main {
    public static void main(String[] args) {
        EmpresaTrenes empresa = new EmpresaTrenes();
        int opcion;

        do {
            System.out.println("\n---MENU PRINCIPAL---");
            System.out.println("1. Buscar empleado por DNI");
            System.out.println("2. Buscar tren con mas vagones");
            System.out.println("3. Cargar un nuevo viaje");
            System.out.println("4. Buscar viajes por destino");
            System.out.println("5. Buscar viajes por DNI de maquinista");
            System.out.println("6. Ver viajes de trenes de carga");
            System.out.println("7. Mostrar todos los viajes");
            System.out.println("8. Salir");

            opcion = Consola.leerEntero("Seleccione una opcion: ");

            switch (opcion) {
                case 1 -> {
                    int dni = Consola.leerEntero("Ingrese el DNI del empleado: ");
                    empresa.buscarEmpleadoPorDni(dni);
                }
                case 2 -> empresa.buscarTrenConMasVagones();
                case 3 -> cargarViaje(empresa);
                case 4 -> {
                    String destino = Consola.leerString("Ingrese destino: ");
                    empresa.buscarViajesPorDestino(destino);
                }
                case 5 -> {
                    int dniMaq = Consola.leerEntero("Ingrese DNI del maquinista: ");
                    empresa.buscarViajesPorDniMaquinista(dniMaq);
                }
                case 6 -> empresa.buscarViajesDeCarga();
                case 7 -> empresa.mostrarViajes();
                case 8 -> System.out.println("Fin del programa.");
                default -> System.out.println("ERROR! Opción inválida");
            }

        } while (opcion != 8);
    }

    public static void cargarViaje(EmpresaTrenes empresa) {
        System.out.println("/n-Carga de nuevo viaje-");

        String codigo = Consola.leerString("Codigo del viaje: ");
        String fecha = Consola.leerString("Fecha (dd/mm/aaaa): ");
        String hora = Consola.leerString("Hora de salida (hh:mm): ");
        String salida = Consola.leerString("Estacion de salida: ");
        String llegada = Consola.leerString("Estación de llegada: ");

        System.out.println("\n-Seleccion de maquinista-");
        for (Empleado e : empresa.getEmpleados()) {
            if (e instanceof Maquinista) {
                e.mostrarInfo();
            }
        }
        int dniMaq = Consola.leerEntero("DNI del maquinista elegido: ");
        Maquinista m = null;
        for (Empleado e : empresa.getEmpleados()) {
            if (e instanceof Maquinista && e.getDni() == dniMaq) {
                m = (Maquinista) e;
            }
        }

        System.out.println("\n--Seleccion de guarda--");
        for (Empleado e : empresa.getEmpleados()) {
            if (e instanceof Guarda) {
                e.mostrarInfo();
            }
        }
        int dniGuarda = Consola.leerEntero("DNI del guarda elegido: ");
        Guarda g = null;
        for (Empleado e : empresa.getEmpleados()) {
            if (e instanceof Guarda && e.getDni() == dniGuarda) {
                g = (Guarda) e;
            }
        }

        System.out.println("\n--Seleccion de tren--");
        int i = 1;
        for (Tren t : empresa.getTrenes()) {
            System.out.print(i++ + ". ");
            t.mostrarInfo();
        }
        int indiceTren = Consola.leerEntero("Seleccione numero de tren: ") - 1;
        Tren t = empresa.getTrenes().get(indiceTren);

        if (m != null && g != null && t != null) {
            Viaje nuevo = new Viaje(codigo, fecha, hora, salida, llegada, t, m, g);
            empresa.agregarViaje(nuevo);
        } else {
            System.out.println("ERROR! Datos invalidos para crear el viaje.");
        }
    }
}
