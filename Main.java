public class Main {
    public static void main(String[] args) {
        //crear zoo
        Zoologico zoologico = new Zoologico("Zoológico Central", "8:00 AM - 6:00 PM", 80);
        System.out.println("***BIENVENIDOS AL ZOOLOGICO***");
        System.out.println("***Nuestros horarios son de 8:00 AM - 6:00 PM***");
        System.out.println("Capacidad maxima de 80 personas ");

        //crear animal
        Carnivoro leon = new Carnivoro("León", "Panthera leo", 5, "Sano");
        Herbivoro jirafa = new Herbivoro("Jirafa", "Giraffa camelopardalis", 8, "Sano");
        //resgistrar animales
        zoologico.registrarAnimal(leon);
        zoologico.registrarAnimal(jirafa);
        //crear jaulas
        Jaula jaula = new Jaula(5, "Sector A");
        jaula.asignarAnimal(leon);
        jaula = new Jaula(4, "Sector B");
        jaula.asignarAnimal(jirafa);
        //creando cuidador
        Cuidador cuidador = new Cuidador("Carlos", "123456789", "0987654321");
        cuidador.alimentar(leon);
        //creando veterinario
        Veterinario veterinario = new Veterinario("Ana", "987654321", "0912345678", "Felinos");
        veterinario.realizarChequeo(jirafa);
    }
}
