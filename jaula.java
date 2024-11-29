import java.util.ArrayList;
import java.util.List;

public class Jaula {
    private int capacidad;
    private String ubicacion;
    private List<Animal> animales;

    public Jaula(int capacidad, String ubicacion) {
        this.capacidad = capacidad;
        this.ubicacion = ubicacion;
        this.animales = new ArrayList<>();
    }
    public boolean asignarAnimal(Animal animal) {
        if (animales.size() < capacidad) {
            animales.add(animal);
            System.out.println(animal.getNombre() + " ha sido asignado a la jaula en " + ubicacion);
            return true;
        } else {
            System.out.println("La jaula está llena.");
            return false;
        }
    }
    public void limpiarJaula() {
        System.out.println("La jaula en " + ubicacion + " ha sido limpiada.");
    }
    public boolean verificarCapacidad() {
        return animales.size() < capacidad;
    }
}
