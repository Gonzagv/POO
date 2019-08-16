package ejercicios.facultad;

public class Estudiante extends Persona {

    private Curso cursoActual;

    public void cambioCurso(Curso curso) {
        this.cursoActual = curso;
    }

    public Curso getCursoActual() {
        return cursoActual;
    }

    public Estudiante(String nombre, String apellido, String dni, EstadoCivilEnum estadoCivil, Curso cursoActual) {
        super(nombre, apellido, dni, estadoCivil);
        this.cursoActual = cursoActual;
    }
}

