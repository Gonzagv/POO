package ejercicios.facultad;
import java.util.ArrayList;

public class CentroDocente {

    ArrayList<Persona> listaPersonas = new ArrayList<>();

    public void agregarPersona(Persona persona){
        if (listaPersonas.contains(persona)){
            System.out.println("Esa persona ya es parte del centro docente.");
        } else {
            listaPersonas.add(persona);
        }
    }

    public void bajaDePersona(String dni){
        if (listaPersonas.contains(dni)){
            for (int i = 0; i<listaPersonas.size();i++){
                if (listaPersonas.get(i).equals(dni)){
                    listaPersonas.remove(i);
                }
            }
        }else{
            System.err.println("Persona no registrada en el Centro docente.");
        }

    }

    public void imprimirLista(ArrayList<Persona> listaPersonas){
        for (int i = 0; i<listaPersonas.size(); i++){
            if(listaPersonas.get(i).getClass().getSimpleName().equals("Profesor")){
                System.out.println(listaPersonas.get(i).toString());
            }else if(listaPersonas.get(i).getClass().getSimpleName().equals("PersonalDeServicio")){
                System.out.println(listaPersonas.get(i).toString());
            }
        }

    }



    public ArrayList<Persona> getListaPersonas() {
        return listaPersonas;
    }

}
