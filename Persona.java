public class Persona {
    //attributes
    private int edad;
    public String nombre;
    public String apellido;
    public String CI;
    public String telefono;
    public String rol;


    //get
    public Persona (String rol, String nombre, int edad, String telefono){
        this.rol = rol;
        this.nombre = nombre;
        this.edad = edad;
        this.telefono = telefono;

    };


    public void mostrarInfo(){
        System.out.print("\nRol: " + rol + "\nNombre:\t\t" + nombre + "\nEdad:\t\t" + edad + "\nContacto:\t" + telefono);
    };




}
