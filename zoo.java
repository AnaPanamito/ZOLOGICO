public class zoo {
    //attributes
    public String nombre;
    public String horario;
    public String direccion;
    public String telefono;
    public int capacidadMax;


    //operations
    boolean estaAbierto;

    public zoo (boolean estaAbierto){
        this.estaAbierto = estaAbierto;
        if (estaAbierto == true){
            System.out.print("El zoologico esta abierto :)\n");
        }else {
            System.out.print("El zoo esta cerrado :(\n");
            System.exit(0);
        }
    }

}
