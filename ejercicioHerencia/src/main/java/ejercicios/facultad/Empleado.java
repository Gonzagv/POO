package ejercicios.facultad;

public class Empleado extends Persona {

    private int anioDeIncorpora;
    private int nroDespacho;
    private int salario;

    public void reasignacionDespacho(int nuevoDespacho) {
        this.nroDespacho = nuevoDespacho;
    }

    public int getNroDespacho() {
        return nroDespacho;
    }
    @Override
    public String toString(){

        return  ("Empleado:"+getNombre()+" "+getApellido()+"\n Sueldo:"+getSalario()+".");
    }

    public Empleado(String nombre, String apellido, String dni, EstadoCivilEnum estadoCivil, int anioDeIncorpora, int nroDespacho) {
        super(nombre, apellido, dni, estadoCivil);
        this.anioDeIncorpora = anioDeIncorpora;
        this.nroDespacho = nroDespacho;
    }

    public int getAnioDeIncorpora() {
        return anioDeIncorpora;
    }

    public void setAnioDeIncorpora(int anioDeIncorpora) {
        this.anioDeIncorpora = anioDeIncorpora;
    }

    public void setNroDespacho(int nroDespacho) {
        this.nroDespacho = nroDespacho;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }
}
