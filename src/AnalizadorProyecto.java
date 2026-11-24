public class AnalizadorProyecto {
    private Modulo[] modulos;

    public AnalizadorProyecto(Modulo[] modulos) {
        this.modulos = modulos;
    }

    public String listarModulos() {
        if (modulos == null) {
            return "";
        }

        String listado = "";
        for (int i = 0; i < modulos.length; i++) {
            if (modulos[i] != null) {
                listado += modulos[i].mostrarInformacion() + "\n";
            }
        }
        return listado;
    }

    public int contarTerminados() {
        if (modulos == null) {
            return 0;
        }

        int contador = 0;
        for (int i = 0; i < modulos.length; i++) {
            if (modulos[i] != null && modulos[i].isTerminado()) {
                contador++;
            }
        }
        return contador;
    }

    public double calcularProgresoPromedio() {
        if (modulos == null) {
            return 0.0;
        }

        int sumaProgreso = 0;
        int cantidadValidos = 0;

        for (int i = 0; i < modulos.length; i++) {
            if (modulos[i] != null) {
                sumaProgreso += modulos[i].getProgreso();
                cantidadValidos++;
            }
        }

        if (cantidadValidos == 0) {
            return 0.0;
        }

        return (double) sumaProgreso / cantidadValidos;
    }

    public Modulo buscarModulo(String nombre) {
        if (modulos == null || nombre == null) {
            return null;
        }

        for (int i = 0; i < modulos.length; i++) {
            if (modulos[i] != null && modulos[i].getNombre().equals(nombre)) {
                return modulos[i];
            }
        }
        return null;
    }
    //equals es para comparar mayusculas y minusculas.
}