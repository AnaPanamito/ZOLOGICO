/*/public class Carnivoros extends Animal{
    String nombreCientifico;

    public Carnivoros(String areaZoo, String nombre, String estadoSalud, String nombreCientifico){
        super(areaZoo, nombre, estadoSalud);
        this.nombreCientifico = nombreCientifico;
    }

    @Override
    public void mostrarAnimal() {
        super.mostrarAnimal();
        System.out.print("\nCientificName:" + nombreCientifico);
    }
}*/

