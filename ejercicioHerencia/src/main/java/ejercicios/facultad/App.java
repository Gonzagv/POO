package ejercicios.facultad;



public class App {

    public static void main(String[] args) {
        String nombre;
        String apellido;
        String dni;
        EstadoCivilEnum estadocivil;
        int anioIncorpora;
        int nroDespacho;
        String nombreDepartamento;
        Seccion seccion = new Seccion();;
        String nombreSeccion;
        String tipoEmpleado;
        int salario;
        Departamento departamento = new Departamento();
        Curso curso = new Curso();

        nombre = "Raul";
        apellido = "Gomez";
        dni = "26589500";
        estadocivil = EstadoCivilEnum.valueOf("CASADO");
        anioIncorpora = 2001;
        nroDespacho = 15;
        nombreDepartamento ="Alumnos";
        departamento.setNombre(nombreDepartamento);
        Persona profesor1 = new Profesor(nombre, apellido, dni, estadocivil, departamento, anioIncorpora,nroDespacho);
        //Cargo profesor
        ((Profesor)profesor1).setSalario((Empleado)profesor1);

        nombre = "Pedro";
        apellido = "Maradona";
        dni = "2658960";
        estadocivil = EstadoCivilEnum.valueOf("CASADO");
        anioIncorpora = 1950;
        nroDespacho = 15;
        nombreDepartamento ="Alumnos";
        departamento.setNombre(nombreDepartamento);
        Persona profesor2 = new Profesor(nombre, apellido, dni, estadocivil, departamento, anioIncorpora,nroDespacho);
        //Cargo profesor2
        ((Profesor)profesor2).setSalario((Empleado)profesor2);

        nombre = "Juan";
        apellido = "Rodriguez";
        dni = "39864500";
        estadocivil = EstadoCivilEnum.valueOf("SOLTERO");
        anioIncorpora = 2006;
        nroDespacho = 15;
        nombreSeccion = "BETA";
        seccion.setNombre(nombreSeccion);
        //Cargo Persona
        Persona personalServicio1 = new PersonalDeServicio(nombre, apellido, dni, estadocivil,seccion, anioIncorpora, nroDespacho);
        ((PersonalDeServicio)personalServicio1).setSalario((Empleado)personalServicio1);

        nombre = "German";
        apellido = "Vazquez";
        dni = "26589212";
        estadocivil = EstadoCivilEnum.valueOf("CASADO");
        anioIncorpora = 2021;
        curso.setNombre("4a");
        curso.setCantidadAlumnos(42);
        curso.setMateria("Matematicas");
        Persona estudiante = new Estudiante(nombre,apellido,dni,estadocivil,curso);

        CentroDocente centroDocente = new CentroDocente();
        centroDocente.agregarPersona(profesor1);
        centroDocente.agregarPersona(profesor2);
        centroDocente.agregarPersona(estudiante);
        centroDocente.agregarPersona(personalServicio1);
        centroDocente.imprimirLista(centroDocente.listaPersonas);

    }
}
