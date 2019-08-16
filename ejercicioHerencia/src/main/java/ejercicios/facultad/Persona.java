package ejercicios.facultad;

abstract class Persona {

    private String nombre;
    private String apellido;
    private String dni;
    private EstadoCivilEnum estadoCivil;

    public Persona(){
    }

    public Persona(String nombre, String apellido, String dni, EstadoCivilEnum estadoCivil) {
        super();
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.estadoCivil= EstadoCivilEnum.SOLTERO;
    }


    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getDni() {
        return dni;
    }

    public EstadoCivilEnum getEstadoCivil() {
        return estadoCivil;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setEstadoCivil(EstadoCivilEnum estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

}