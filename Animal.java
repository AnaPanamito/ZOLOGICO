public class Animal {
    //attributes
    public String nombre;
    public String alimentacionPrincipal;
    public int edad;
    public String origen;
    public String habitat;
    public String areaZoo;
    public boolean estadoSalud;



    //get
    public Animal(String nombre, String alimentacionPrincipal, boolean estadoSalud){
        this.nombre = nombre;
        this.alimentacionPrincipal = alimentacionPrincipal;
        this.estadoSalud = estadoSalud;
    }

    /*public void mostrarAnimal(){
        System.out.print("\nNombre: " + nombre + "\nEstadoSalud: " + estadoSalud);
    }*/

}
