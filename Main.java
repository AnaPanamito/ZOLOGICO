public class Main {
    public static void main(String[] args) {

        new zoo(true);


        Cliente cliente1 = new Cliente("Yober ", 18, "5555", "cliente", 3);
        Boleteria cliente = new Boleteria(cliente1, 20);
        cliente.venderEntradas(cliente1);

        Habitat habitat1 = new Habitat(20, "Terrestre");
        Cuidador cuidador1 = new Cuidador("Juan", 50, "521", "11C4T", "CUIDADOR");
        cuidador1.quitarAnimales(habitat1, "tigre", 1);

        Animal animal = new Animal("cebra", "pasto", false);
        Cuidador cuidador = new Cuidador("pepito", 20, "5454", "26h2", "cuidador");
        cuidador.alimentar(animal, cuidador);

        Veterinario veterinario = new Veterinario("PEPE", 20, "0", "0", "veterinario", "carnivoros");
        veterinario.realizarChequeo(animal);
    }
}

