
import java.util.Date;

public class HistorialSalud {
    private Date fecha;
    private String diagnostico;
    private String tratamiento;
    private String observacion;

    public HistorialSalud(Date fecha, String diagnostico, String tratamiento, String observacion) {
        this.fecha = fecha;
        this.diagnostico = diagnostico;
        this.tratamiento = tratamiento;
        this.observacion = observacion;
    }

    public void registrarDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public void registrarTratamiento(String tratamiento) {
        this.tratamiento = tratamiento;
    }
}
