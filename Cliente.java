public class Cliente extends Persona {
int entradas;

    public Cliente(String nombre, int edad, String telefono, String rol, int entradas){
        super(rol, nombre, edad, telefono);
        this.entradas = entradas;

    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
    }
}
