package ejercicios.facultad;

public class Profesor extends Empleado{

    private Departamento departamento;
    private int salario;

    public Profesor(String nombre, String apellido, String dni, EstadoCivilEnum estadoCivil, Departamento departamento,int anioDeIncorpora, int nroDespacho, int salario) {
        super(nombre, apellido, dni, estadoCivil, anioDeIncorpora, nroDespacho);
        this.departamento=departamento;
        this.salario=salario;
    }

    public Profesor(String nombre, String apellido, String dni, EstadoCivilEnum estadoCivil, Departamento departamento,int anioDeIncorpora, int nroDespacho) {
        super(nombre, apellido, dni, estadoCivil, anioDeIncorpora, nroDespacho);
        this.departamento=departamento;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public int getSalario(Empleado empleado) {
        salario = empleado.getSalario();
        return salario;
    }

    public void setSalario(Empleado empleado) {
        int salario = 25000;
        if (empleado.getAnioDeIncorpora()>=2000){
            salario += (25000*0.08);
        }
        this.salario = salario;
    }

    public int getSalario() {
        return salario;
    }

}
