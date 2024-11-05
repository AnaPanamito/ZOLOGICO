public class Veterinario extends Persona{
    String especialidad;

    public Veterinario(String nombre, int edad, String telefono, String identificador, String rol, String especialidad){
        super(rol, nombre, edad, identificador);
        this.especialidad = especialidad;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.print("\nEspecialidad:\t" + especialidad);
    }

    public void realizarChequeo(Animal animal){
        System.out.print("\nRealizando chequeo ...\n");
        if (animal.estadoSalud == true){
            System.out.print(animal.nombre + " se encuentra en buen estado de salud ");
        }else {
            System.out.print(animal.nombre + " se encuentra en mal estado de salud ");
        }
    }

}
