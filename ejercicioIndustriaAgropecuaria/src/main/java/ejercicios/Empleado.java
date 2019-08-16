package ejercicios.;

import java.util.Calendar;

public class Empleado extends Persona{
    private String sueldo;
    private String antiguedad;
    private Sector sector;
    private Cargo cargo;
    private int horario;
    private int receso;
    private String turno;

    public Empleado(){

    }

    public Empleado(String sueldo, String antiguedad, Sector sector, Cargo cargo, int horario, int receso, String turno) {
        this.sueldo = sueldo;
        this.antiguedad = antiguedad;
        this.sector = sector;
        this.cargo = cargo;
        this.horario = horario;
        this.receso = receso;
        this.turno = turno;
    }

    public String getSueldo() {
        return sueldo;
    }

    public void setSueldo(String sueldo) {
        this.sueldo = sueldo;
    }

    public String getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(String antiguedad) {
        this.antiguedad = antiguedad;
    }

    public Sector getSector() {
        return sector;
    }

    public void setSector(Sector sector) {
        this.sector = sector;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public int getHorario() {
        return horario;
    }

    public void setHorario(int horario) {
        this.horario = horario;
    }

    public int getReceso() {
        return receso;
    }

    public void setReceso(int receso) {
        this.receso = receso;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }
}
