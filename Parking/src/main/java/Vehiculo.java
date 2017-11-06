import java.util.Date;

public class Vehiculo {

    // Datos vehículo

    private String matricula;
    private String horaEntrada;
    private String horaSalida;

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMatricula() {
        return this.matricula;
    }

    public void setHoraEntrada(String horaEntrada){
        this.horaEntrada = horaEntrada;
    }

    public void setHoraSalida(String horaSalida) {
        this.horaSalida = horaSalida;
    }
}
