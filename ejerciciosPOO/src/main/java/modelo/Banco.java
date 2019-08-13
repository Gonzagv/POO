package modelo;

import persistence.BancoRepository;

import java.util.ArrayList;

public class Banco {

    private ArrayList<Cuenta> cuentas = new ArrayList<>();
    final private String nombreBanco = "Superbanco";
    private String cuit;


    public static void actualizarCuenta(ArrayList<Cuenta> cuentas) {

    }


   /* public void agregarCuentaGson(String repGson) {
        boolean noContiene = false;
        for (int i = 0; i < cuentas.size(); i++) {
            if (!cuentas.get(i).contains(repGson)) {
                noContiene = true;
            }
        }
        if (noContiene) {
            cuentas.add(repGson);
            BancoRepository bancoRepository = new BancoRepository();
            bancoRepository.writeObjectToFile(cuentas);
        }

    }*/

    public ArrayList<Cuenta> getCuentas() {
        return cuentas;
    }

    @Override
    public String toString() {
        return "Banco{" +
                "cuentas=" + cuentas +
                ", nombreBanco='" + nombreBanco + '\'' +
                ", cuit='" + cuit + '\'' +
                '}';
    }
}