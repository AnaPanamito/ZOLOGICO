public class Animal {
    public String nombre;
    public String nombreCientifico;
    public int edad;
    public String estadoSalud;

    public Animal(String nombre, String nombreCientifico, int edad, String estadoSalud) {
        this.nombre = nombre;
        this.nombreCientifico = nombreCientifico;
        this.edad = edad;
        this.estadoSalud = estadoSalud;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombreCientifico() {
        return nombreCientifico;
    }
    public void setNombreCientifico(String nombreCientifico) {
        this.nombreCientifico = nombreCientifico;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getEstadoSalud() {
        return estadoSalud;
    }
    public void setEstadoSalud(String estadoSalud) {
        this.estadoSalud = estadoSalud;
    }
}
class Carnivoro extends Animal {
    public Carnivoro(String nombre, String nombreCientifico, int edad, String estadoSalud) {
        super(nombre, nombreCientifico, edad, estadoSalud);
    }
    public void comeCarne() {
        System.out.println(getNombre() + " esta comiendo carne.");
    }
}
class Omnivoro extends Animal {
    public Omnivoro(String nombre, String nombreCientifico, int edad, String estadoSalud) {
        super(nombre, nombreCientifico, edad, estadoSalud);
    }
    public void comeVariado() {
        System.out.println(getNombre() + " esta comiendo una dieta variada.");
    }
}
class Herbivoro extends Animal {
    public Herbivoro(String nombre, String nombreCientifico, int edad, String estadoSalud) {
        super(nombre, nombreCientifico, edad, estadoSalud);
    }
    public void comePlantas() {
        System.out.println(getNombre() + " esta comiendo plantas.");
    }
}
class Insectivoro extends Animal {
    public Insectivoro(String nombre, String nombreCientifico, int edad, String estadoSalud) {
        super(nombre, nombreCientifico, edad, estadoSalud);
    }
    public void comeInsectos() {
        System.out.println(getNombre() + " esta comiendo insectos.");
    }
}
