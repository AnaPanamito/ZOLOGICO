public class Habitat {
    //attributes
    public String mombre;
    public String tipo;
    public String clima;
    public float dimenciones;
    public int capacidadAnimales;
    public boolean estado;
    public int totAnimales;


    //get
    public Habitat(int totAnimales, String mombre){
        this.totAnimales = totAnimales;
        this.mombre = mombre;
    }
}
