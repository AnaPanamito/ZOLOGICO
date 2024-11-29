public class Persona {
    protected String nombre;
    protected String cedula;
    protected String telefono;

    public Persona(String nombre, String cedula, String telefono) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.telefono = telefono;
    }

}

class Cuidador extends Persona {
    public Cuidador(String nombre, String cedula, String telefono) {
        super(nombre, cedula, telefono);
    }

    public void alimentar(Animal animal) {
        System.out.println(" El cuidador Carlos esta alimentando a " + animal.getNombre());
    }

    public void limpiarJaula(Jaula jaula) {
        jaula.limpiarJaula();
    }
}

class Veterinario extends Persona {
    private String especialidad;

    public Veterinario(String nombre, String cedula, String telefono, String especialidad) {
        super(nombre, cedula, telefono);
        this.especialidad = especialidad;
    }

    public void realizarChequeo(Animal animal) {
        System.out.println("El veterinario esta chequeando a " + animal.getNombre());
    }

    public void prescribirTratamiento(HistorialSalud historial, String tratamiento) {
        historial.registrarTratamiento(tratamiento);
        System.out.println("Se ha prescrito tratamiento: " + tratamiento);
    }
}
class cliente extends Persona {
    public cliente(String nombre, String cedula, String telefono) {
        super(nombre, cedula, telefono);
    }
    public void entradasAdquiridas() {
    }
}
