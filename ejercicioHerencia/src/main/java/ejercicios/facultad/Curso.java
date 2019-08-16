package ejercicios.facultad;

public class Curso {
    private String nombre;
    private String materia;
    private int cantidadAlumnos;

    public Curso(String nombre, String materia, int cantidadAlumnos) {
        this.nombre = nombre;
        this.materia = materia;
        this.cantidadAlumnos = cantidadAlumnos;
    }

    public Curso() {
    }

    public String getNombre() {
        return nombre;
    }

    public String getMateria() {
        return materia;
    }

    public int getCantidadAlumnos() {
        return cantidadAlumnos;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public void setCantidadAlumnos(int cantidadAlumnos) {
        this.cantidadAlumnos = cantidadAlumnos;
    }
}

