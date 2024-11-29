import java.util.ArrayList;
import java.util.List;

public class Zoologico {
    private String nombre;
    private String horario;
    private int capacidadMaxima;
    private List<Animal> animales;
    public Zoologico(String nombre, String horario, int capacidadMaxima) {
        this.nombre = nombre;
        this.horario = horario;
        this.capacidadMaxima = capacidadMaxima;
        this.animales = new ArrayList<>();
    }
    public boolean registrarAnimal(Animal animal) {
        if (animales.size()< capacidadMaxima) {
            animales.add(animal);
            System.out.println(animal.getNombre() + " Se ha registrado con exito a su nueva jaula.");
            return true;
        }else {
            System.out.println("Capacidad Maxima alcanzada");
            return false;
        }
    }
}
