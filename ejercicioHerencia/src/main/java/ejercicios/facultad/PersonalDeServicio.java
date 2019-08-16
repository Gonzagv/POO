package ejercicios.facultad;

public class PersonalDeServicio extends Empleado {

    private Seccion seccion;
    private int salario;

    public Seccion getSeccion() {
        return seccion;
    }

    public void transladoSeccion(Seccion seccion) {
        this.seccion = seccion;
    }

    public PersonalDeServicio(String nombre, String apellido, String dni, EstadoCivilEnum estadoCivil, Seccion seccion, int anioDeIncorpora, int nroDespacho, int salario) {
        super(nombre, apellido, dni, estadoCivil, anioDeIncorpora, nroDespacho);
        this.seccion = seccion;
        this.salario = salario;
    }

    public PersonalDeServicio(String nombre, String apellido, String dni, EstadoCivilEnum estadoCivil, Seccion seccion, int anioDeIncorpora, int nroDespacho) {
        super(nombre, apellido, dni, estadoCivil, anioDeIncorpora, nroDespacho);
        this.seccion = seccion;
    }

    public void setSeccion(Seccion seccion) {
        this.seccion = seccion;
    }

    public int getSalario(Empleado empleado) {
        salario = empleado.getSalario();
        return salario;
    }

    public void setSalario(Empleado empleado) {
        salario = 15000;
        if (empleado.getEstadoCivil().equals("CASADO")) {
            salario += (15000 * 0.05);
        }
        this.salario = salario;

    }

    public int getSalario() {
        return salario;
    }

}
