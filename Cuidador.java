public class Cuidador extends Persona{
    String identificador;

    public Cuidador(String nombre, int edad, String telefono, String identificador, String rol){
        super(rol, nombre, edad, telefono);
        this.identificador = identificador;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.print("\nID:\t\t\t" + identificador);
    }


    //operations
    public void agregarAnimales(Habitat habitat, String nombreAnimal, int cuantos){
        habitat.totAnimales = habitat.totAnimales + cuantos;
        System.out.print("\nDel habitat " + habitat.mombre + " se ha añadido "+ cuantos + " " + nombreAnimal + "/s");
        System.out.print("\nTotal " + nombreAnimal + "/s: " + habitat.totAnimales);
    }
    public void quitarAnimales(Habitat habitat, String nombreAnimal, int cuantos) {
        habitat.totAnimales = habitat.totAnimales - cuantos;
        System.out.print("\nDel habitat " + habitat.mombre + " se ha quitado " + cuantos + " " + nombreAnimal + "/s");
        System.out.print("\nTotal " + nombreAnimal + "/s: " + habitat.totAnimales);
    }

    public void alimentar(Animal animal, Cuidador cuidador){
    System.out.print("\nEl cuidador "+ cuidador.nombre + " alimento con " + animal.alimentacionPrincipal + " a " + animal.nombre);
    }

}
