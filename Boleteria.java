public class Boleteria {
    //attributes
    int entradasDisponibles;



    //get
    public Boleteria(Cliente cliente1, int entradasDisponibles) {
        this.entradasDisponibles = entradasDisponibles;
    }

    //operations
    public void venderEntradas(Cliente cliente1){
        entradasDisponibles = entradasDisponibles - cliente1.entradas;
        System.out.print("El " + cliente1.rol + " " + cliente1.nombre + "compro " + cliente1.entradas + " entradas\nEntradas disponibles: " + entradasDisponibles);
    }

    }

