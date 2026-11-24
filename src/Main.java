public class Main {
    public static void main(String[] args) {
        Modulo[] modulos = new Modulo[5];
        modulos[0] = new Modulo("Autenticación", "Java", 100, true);
        modulos[1] = new Modulo("Inventario", "Java", 75, false);
        modulos[2] = new Modulo("Facturación", "Python", 100, true);
        modulos[3] = new Modulo("Reportes", "SQL", 40, false);
        modulos[4] = new Modulo("Notificaciones", "JavaScript", 15, false);

        AnalizadorProyecto analizador = new AnalizadorProyecto(modulos);

        System.out.println("=== LISTADO DE MÓDULOS ===");
        System.out.println(analizador.listarModulos());

        System.out.println("=== RESUMEN DEL PROYECTO ===");
        System.out.println("Módulos terminados: " + analizador.contarTerminados());
        System.out.println("Progreso promedio: " + analizador.calcularProgresoPromedio() + "%\n");

        System.out.println("=== PRUEBAS DE BÚSQUEDA ===");
        Modulo encontrado1 = analizador.buscarModulo("Autenticación");
        if (encontrado1 != null) {
            System.out.println("Encontrado -> " + encontrado1.mostrarInformacion());
        } else {
            System.out.println("El módulo 'Autenticación' no existe.");
        }

        Modulo encontrado2 = analizador.buscarModulo("Pasarela de Pagos");
        if (encontrado2 != null) {
            System.out.println("Encontrado -> " + encontrado2.mostrarInformacion());
        } else {
            System.out.println("El módulo 'Pasarela de Pagos' no existe.");
        }
    }
}